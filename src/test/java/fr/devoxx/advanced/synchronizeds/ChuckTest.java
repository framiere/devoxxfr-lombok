package fr.devoxx.advanced.synchronizeds;

import static com.jayway.awaitility.Awaitility.await;
import static fr.devoxx.advanced.synchronizeds.Chuck.SLEEP_IN_MS;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeoutException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChuckTest {
    private static final int NB_CONCURRENT_THREADS = 10;
    ThreadPoolExecutor threadPool;

    @Before
    public void setup() {
        threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(NB_CONCURRENT_THREADS);
    }

    @After
    public void tearDown() throws InterruptedException {
        threadPool.shutdown();
        threadPool.shutdownNow();
    }

    private void test(final Chuck chuck) throws Exception {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                synchronized (chuck) {
                    try {
                        System.out.println("I am locking " + chuck.getClass().getSimpleName() + " instance for 5s");
                        SECONDS.sleep(5);
                    } catch (InterruptedException ignore) {
                        //
                    }
                }
            }
        });
        for (int i = 0; i < NB_CONCURRENT_THREADS - 1; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    chuck.norris();
                }
            });
        }
        long maxWait = Math.round(NB_CONCURRENT_THREADS * SLEEP_IN_MS * 1.1);
        await().atMost(maxWait, MILLISECONDS).until(new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return threadPool.getActiveCount() == 1;
            }
        });
    }

    @Test(expected = TimeoutException.class)
    public void synchronizedChuck() throws Exception {
        test(new SynchronizedChuck(false));
    }

    @Test
    public void lombokSynchronizedChuck() throws Exception {
        test(new LombokChuck(false));
    }
}

package fr.devoxx.advanced.lazygetter;

import static java.lang.System.currentTimeMillis;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.fest.assertions.Assertions.assertThat;

import java.util.Date;

import org.junit.Test;

public class PricerTest {
    @Test
    public void constructorDoesNotWait() {
        long start = currentTimeMillis();
        new Pricer("QQQ", new Date(), new Date());

        long stop = currentTimeMillis();
        long duration = stop - start;

        assertThat(duration).isLessThan(SECONDS.toMillis(Pricer.PRICER_WAIT_IN_SECONDS));
    }

    @Test
    public void callPriceTwice() {
        Pricer pricer = new Pricer("QQQ", new Date(), new Date());

        long start = currentTimeMillis();
        pricer.getPricing();
        long firstPricing = currentTimeMillis() - start;
        System.out.println("First pricing took " + firstPricing + "ms");
        
        pricer.getPricing();
        long secondPricing = currentTimeMillis() - firstPricing - start;
        System.out.println("Second pricing took " + secondPricing + "ms");

        
        long stop = currentTimeMillis();
        long duration = stop - start;
        assertThat(duration).isLessThan(SECONDS.toMillis(Pricer.PRICER_WAIT_IN_SECONDS * 2));
    }
}

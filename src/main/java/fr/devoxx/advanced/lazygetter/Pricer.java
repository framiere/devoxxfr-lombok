package fr.devoxx.advanced.lazygetter;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.Date;

import lombok.LazyGetter;

public class Pricer {
    public static long PRICER_WAIT_IN_SECONDS = 5;
    private String instrument;
    private Date dateFrom;
    private Date dateTo;
    @LazyGetter
    private final long pricing = price();

    public Pricer(String instrument, Date dateFrom, Date dateTo) {
        this.instrument = instrument;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    private long price() {
        System.out.println("Computing long operation that will run for " + PRICER_WAIT_IN_SECONDS + "s");
        try {
            SECONDS.sleep(PRICER_WAIT_IN_SECONDS);
        } catch (InterruptedException ignore) {
        }
        System.out.println("Computation is done");
        return instrument.length() + dateTo.getTime() - dateFrom.getTime();
    }
}

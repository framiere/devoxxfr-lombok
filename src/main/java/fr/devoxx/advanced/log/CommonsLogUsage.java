package fr.devoxx.advanced.log;

import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class CommonsLogUsage {
    public static void log() {
        log.info("Log using commons-log");
    }
}

package fr.devoxx.advanced.log;

import lombok.extern.java.Log;

@Log
public class JavaLogUsage {
    public void log() {
        log.info("Log using java.util.logging");
    }
}

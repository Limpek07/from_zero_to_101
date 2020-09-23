package com.zeroone.logging;

import org.apache.logging.log4j.LogManager;
import org.testng.Reporter;

/**
 * Logger for logging.
 */
public class Logger {

    private final org.apache.logging.log4j.Logger logger;

    public Logger(final Class<?> clazz) {
        logger = LogManager.getLogger(clazz);
    }

    public void info(final String message) {
        Reporter.log(message + "\n");
        logger.info(message);
    }
}

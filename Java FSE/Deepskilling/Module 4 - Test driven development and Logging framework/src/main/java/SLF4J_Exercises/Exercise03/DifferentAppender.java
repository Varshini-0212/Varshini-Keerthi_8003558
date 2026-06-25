package SLF4J_Exercises.Exercise03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DifferentAppender {

    private static final Logger logger =
            LoggerFactory.getLogger(DifferentAppender.class);

    public static void main(String[] args) {

        logger.debug("Debug Message");
        logger.info("Info Message");
        logger.warn("Warning Message");
        logger.error("Error Message");
    }
}
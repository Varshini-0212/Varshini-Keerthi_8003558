package SLF4J_Exercises.Exercise02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {

        String userName = "Varshini";
        int marks = 95;

        logger.info("User {} scored {} marks.", userName, marks);
    }
}
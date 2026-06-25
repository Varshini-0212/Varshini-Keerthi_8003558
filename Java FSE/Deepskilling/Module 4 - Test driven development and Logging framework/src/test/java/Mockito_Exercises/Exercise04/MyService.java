package Mockito_Exercises.Exercise04;

public class MyService {

    private Logger logger;

    public MyService(Logger logger) {
        this.logger = logger;
    }

    public void performAction() {
        logger.log("Action Performed");
    }
}
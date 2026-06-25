package Mockito_Exercises.Exercise07;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void execute() {
        api.processData();
    }
}
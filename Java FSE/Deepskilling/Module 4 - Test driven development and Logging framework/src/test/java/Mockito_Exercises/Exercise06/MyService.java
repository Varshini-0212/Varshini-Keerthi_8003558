package Mockito_Exercises.Exercise06;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void performActions() {
        api.firstMethod();
        api.secondMethod();
    }
}
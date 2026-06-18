package exercise07.observer;

public class WebApp implements Observer {

    @Override
    public void update(String stockName, double price) {

        System.out.println(
                "Web App Notification -> "
                        + stockName
                        + " Price Updated: Rs."
                        + price);
    }
}
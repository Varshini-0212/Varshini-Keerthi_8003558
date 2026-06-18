package exercise07.observer;

public class TestObserver {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("TCS", 4200.50);

        stockMarket.setStockPrice("INFOSYS", 1750.75);
    }
}
package Observer_Pattern;

public class Client {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        StockObserver investor1 = new Investor("Sadia");
        StockObserver investor2 = new Investor("Jessia");

        stockMarket.registerObserver(investor1);
        stockMarket.registerObserver(investor2);

        stockMarket.setStockPrice("Laptop", 120000.00);
        stockMarket.setStockPrice("Mobile", 50000.00);

        stockMarket.removeObserver(investor1);

        stockMarket.setStockPrice("iPad", 70000);
        
    }
    
}

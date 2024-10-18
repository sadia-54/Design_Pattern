package Observer_Pattern;

public interface StockMarketSubject {

    public void registerObserver(StockObserver observer);
    public void removeObserver(StockObserver observer);
    public void notifyObservers(String stockName, double stockPrice);
    
    
}

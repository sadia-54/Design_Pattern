package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements StockMarketSubject{

    private List<StockObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(StockObserver observer) {
        observers.add(observer);
        
    }

    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
       
    }

    @Override
    public void notifyObservers(String stockName, double stockPrice) {
        for(StockObserver observer: observers){
            observer.update(stockName, stockPrice);
        }
    }

    public void setStockPrice(String stockName, double stockPrice){

        notifyObservers(stockName, stockPrice);
        
    }
    
}

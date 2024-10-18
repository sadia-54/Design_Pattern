package Observer_Pattern;

public class Investor implements StockObserver {

    private String name;

    public Investor(String name){
        this.name = name;
    }

    public void update(String stockName, double stockPrice){
        System.out.println(name+" received an update for "+stockName+": $"+stockPrice);

    }
    
}

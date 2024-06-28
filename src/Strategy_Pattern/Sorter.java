package Strategy_Pattern;

public class Sorter {

    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int arr[]){
        sortingStrategy.sort(arr);
    }
    
}

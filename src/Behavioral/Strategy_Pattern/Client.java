package Strategy_Pattern;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        int arr[] = {6, 8, 2, 0, 1, 9, 4};

        Sorter sorter = new Sorter();

        sorter.setSortingStrategy(new BubbleSort());
        sorter.sort(arr); 
        System.out.println("Bubble Sort: ");
        Arrays.stream(arr).forEach(System.out::println);

        sorter.setSortingStrategy(new SelectionSort());
        sorter.sort(arr);
        System.out.println("Selection Sort: ");
        Arrays.stream(arr).forEach(System.out::println);

    }
    
}

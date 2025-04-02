import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        
        // Sorting the array in ascending order
        Arrays.sort(numbers);
        
        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}

import java.util.Collections;
import java.util.Arrays;

public class ReverseSort {

    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(arr, Collections.reverseOrder());

        printArray(arr);
    }
}
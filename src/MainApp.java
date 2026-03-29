package problem3;

import java.util.Arrays;

public class MainApp {

    public static void mergeSort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {500, 100, 300};

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
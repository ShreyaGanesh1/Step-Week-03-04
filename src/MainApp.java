package problem5;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        String[] arr = {"accB", "accA", "accB", "accC"};

        // Linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("accB")) {
                System.out.println("Found at index: " + i);
                break;
            }
        }

        Arrays.sort(arr);

        int index = Arrays.binarySearch(arr, "accB");
        System.out.println("Binary index: " + index);
    }
}
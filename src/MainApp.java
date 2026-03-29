package problem6;

public class MainApp {

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};
        int target = 30;

        int floor = -1, ceil = -1;

        for (int num : arr) {
            if (num <= target) floor = num;
            if (num >= target && ceil == -1) ceil = num;
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceiling: " + ceil);
    }
}
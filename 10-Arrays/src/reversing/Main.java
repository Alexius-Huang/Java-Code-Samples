package reversing;

import java.util.Arrays;

public class Main {

    // Challenge: Reverse Array
    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Original: " + Arrays.toString(test));

        reverse(test);
        System.out.println("Reversed: " + Arrays.toString(test));
    }

    public static void reverse(int[] input) {
        int boundary = input.length / 2;
        for (int i = 0; i < boundary; i++) {
            int temp = input[i];
            int swapIndex = input.length - 1 - i;
            input[i] = input[swapIndex];
            input[swapIndex] = temp;
        }
    }
}

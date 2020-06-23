package sorting;

import java.util.Arrays;

public class Main {

    // Challenge: Sorting numbers descendently
    public static void main(String[] args) {
        int[] test = { 33, 16, 52, 1, 17, 13, 44, 29, 8, 31 };
        int[] result = sort(test);

        System.out.println("Before sorted: ");
        printArray(test);

        System.out.println("After sorted: ");
        printArray(result);
    }

    public static int[] sort(int[] input) {
        int[] sorted = Arrays.copyOf(input, input.length);
        // or
        // int[] sorted = input.clone();

        // Bubble Sort
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = i + 1; j < sorted.length; j++) {
                if (sorted[i] < sorted[j]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }

    public static void printArray(int[] input) {
        String str = "{ ";
        for (int i = 0; i < input.length; i++)
            str += (input[i] + " ");
        str += "}";
        System.out.println(str);
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* ---- Array ---- */
        // Array Declaration with specific number of element slots
        int[] numbers = new int[10];

        // Assigning single value in array
        numbers[0] = 100;

        // Default value of array of empty slot in integer array is 0
        System.out.println("Empty slot from integer array is: " + numbers[1]);

        // Arrays will throw out of bound error if the index is too large
        // System.out.println(numbers[10]);

        // Initialize array with multiple values
        int[] numbers2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // Initialize array using for-loop
        int[] numbers3 = new int[10];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = i + 1;
        }

        // Methods can also return or accept array types
        // int[] result = getIntegers(5);
        // System.out.println("Result: ");
        // printArray(result);


        /* ---- Reference v.s. Value ---- */
        // Value type won't be affected when copying
        int justInt = 123;
        int anotherInt = justInt;

        System.out.println("justInt: " + justInt);
        System.out.println("anotherInt: " + anotherInt);

        anotherInt++;
        System.out.println("justInt: " + justInt);
        System.out.println("anotherInt: " + anotherInt);

        // Reference type will be affected if referenced variable is modified
        int[] justIntArray = { 1, 2, 3 };
        int[] anotherIntArray = justIntArray;

        System.out.println("justIntArray: " + Arrays.toString(justIntArray));
        System.out.println("justIntArray: " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 123;
        System.out.println("justIntArray: " + Arrays.toString(justIntArray));
        System.out.println("justIntArray: " + Arrays.toString(anotherIntArray));


        // Resizing Array -- quite tedious
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;
        System.out.println("Original: " + Arrays.toString(arr));

        int[] original = arr;
        arr = new int[10];
        for (int i = 0; i < original.length; i++)
            arr[i] = original[i];
        System.out.println("Resized: " + Arrays.toString(arr));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values:");

        int[] result = new int[number];
        for (int i = 0; i < result.length; i++) {
            result[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return result;
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }

}

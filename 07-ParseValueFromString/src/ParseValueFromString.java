import java.util.Scanner;

public class ParseValueFromString {

    public static void main(String[] args) {
        /* ---- Parsing Methods ---- */
        String numStr = "2020";
        int num = Integer.parseInt(numStr);
        System.out.println("Parsed integer: " + num);

        String doubleStr = "2020.123";
        double doubleNum = Double.parseDouble(doubleStr);
        System.out.println("Parsed double: " + doubleNum);


        /* ---- Reading User Input ---- */
        // Scanner is a Java builtin class which used to scanning user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You are " + (2020 - year) + " years old");

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        scanner.close();
    }

    /* ---- Challenges ---- */
    // 1. Flour Pack Problems
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int maxBigCount = goal / 5;
        int restSmallCount = goal - 5 * Math.min(bigCount, maxBigCount);
        return restSmallCount <= smallCount;
    }

    // 2. Largest Prime
    public static int getLargestPrime(int number) {
        if (number < 2) return -1;
        int threshold = number;

        while (threshold > 1) {
            if (number % threshold == 0) {
                int targeted = threshold / 2;
                boolean isPrime = true;
                while (targeted > 1) {
                    if (threshold % targeted == 0) {
                        isPrime = false;
                        break;
                    }
                    targeted--;
                }

                if (isPrime) break;
            }
            threshold--;
        }

        return threshold;
    }

    // 3. Diagonal Star
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        String completeStar = "";
        for (int i = 0; i < number; i++) completeStar += "*";
        System.out.println(completeStar);

        for (int i = 1; i < number - 1; i++) {
            String result = "*";

            for (int j = 1; j < number - 1; j++) {
                result += (i == j || number - 1 - j == i) ? "*" : " ";
            }
            result += "*";
            System.out.println(result);
        }

        System.out.println(completeStar);
    }

    // 4. Input Calculator
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberOfInputs = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                numberOfInputs++;
                sum += scanner.nextInt();
                scanner.nextLine();
            } else break;
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double)(sum) / numberOfInputs));
        scanner.close();
    }

    // 5. Paint Job
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        return (int)(Math.ceil(width * height / areaPerBucket)) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (areaPerBucket <= 0 || area <= 0) return -1;

        return (int)(Math.ceil(area / areaPerBucket));
    }
}

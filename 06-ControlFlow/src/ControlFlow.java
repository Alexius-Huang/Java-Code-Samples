public class ControlFlow {

    public static void main(String[] args) {
        /* ---- Switch Statement ---- */
        int value = 3;

        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is not 1 or 2");
        }

        // Equivalent switch statement
        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Value is 3, 4 or 5");
                break;

            default:
                System.out.println("Value is not 1 or 2");
        }


        /* ---- For Statement ---- */
        for (int i = 0; i < 10; i += 1) {
            System.out.println(
                "10,000 at " + i + "% interest = " +
                String.format("%.2f", calcInterest(10000, i))
            );
        }

        /* ---- While/Do-While Statement ---- */
        int count = 0;
        while (count != 5) {
            System.out.println("Counting number: " + count);
            count++;
        }

        do {
            System.out.println("Counting number: " + count);
            count++;
        } while (count != 10);

    }

    public static double calcInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }


    /* ---- Challenges ---- */
    // 1. Number Palindrome
    public static boolean isPalindrome(int number) {
        int posNum = Math.abs(number);
        int temp = posNum;
        int reversed = 0;
        while (temp != 0) {
            reversed *= 10;
            reversed += temp % 10;
            temp /= 10;
        }

        return reversed == posNum;
    }

    // 2. First and Last Digit Sum
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int lastDigit = number % 10;
        int firstDigit;

        do {
            firstDigit = number % 10;
            number /= 10;
        } while (number != 0);

        return lastDigit + firstDigit;
    }

    // 3. Even Digit Sum
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int result = 0;

        while (number != 0) {
            int digit = number % 10;
            result += digit % 2 == 0 ? digit : 0;
            number /= 10;
        }

        return result;
    }

    // 4. Shared Digit
    public static boolean hasSharedDigit(int p1, int p2) {
        if (p1 < 10 || p1 > 99 || p2 < 10 || p2 > 99) return false;

        int p1D1 = p1 % 10;
        int p1D2 = p1 / 10;
        int p2D1 = p2 % 10;
        int p2D2 = p2 / 10;

        return p1D1 == p2D1 || p1D2 == p2D1 || p1D1 == p2D2 || p1D2 == p2D2;
    }

    // 5. Last Digit Checker
    public static boolean hasSameLastDigit(int p1, int p2, int p3) {
        if ( ! (isValid(p1) && isValid(p2) && isValid(p3))) return false;

        int lp1 = p1 % 10;
        int lp2 = p2 % 10;
        int lp3 = p3 % 10;
        return lp1 == lp2 || lp1 == lp3 || lp2 == lp3;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }

    // 6. Greatest Common Divisor
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }

        int gcd = 1;
        for (int i = 2; i <= second; i++) {
            if (first % i == 0 && second % i == 0)
                gcd = i;
        }
        return gcd;
    }

    // 7. All Factors
    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(1);

        if (num == 1) return;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                System.out.println(i);
        }
        System.out.println(num);
    }

    // 8. Perfect Number
    public static boolean isPerfectNumber(int num) {
        if (num < 1) return false;

        int result = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                result += i;
        }

        return result == num;
    }

    // 9. Number to Words
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int reversedNumber = reverse(number);
        int postZeros = getDigitCount(number) - getDigitCount(reversedNumber);
        while (reversedNumber != 0) {
            switch (reversedNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                default:
                    System.out.println("Nine");
            }

            reversedNumber /= 10;
        }

        for (int i = 0; i < postZeros; i++) {
            System.out.println("Zero");
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number == 0) return 1;

        int result = 0;

        while (number != 0) {
            result += 1;
            number /= 10;
        }
        return result;
    }

    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result *= 10;
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}











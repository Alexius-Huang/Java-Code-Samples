public class Methods {

    public static void main(String[] args) {
        sayHello();

        System.out.println("1 + 2 = " + add(1,2));
    }

    /* ---- Method Declaration ---- */
    // Declaring a method
    public static void sayHello() {
        System.out.println("Hello world!");
    }

    // Declaring method with input parameters and output type
    public static int add(int x, int y) {
        return x + y;
    }


    /* ---- Method Overloading ---- */
    // Each method being overloaded are all unique method signature
    // So long as each overloaded method have different pattern of input parameters

    // Same method name with different number of parameters
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    // Same method name with different types of parameters
    public static double add(double x, double y) {
        return x + y;
    }


    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) return "Invalid value";

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String formattedHour = hours < 10 ? "0" + hours : "" + hours;
        String formattedMinutes = remainingMinutes < 10 ? "0" + remainingMinutes : "" + remainingMinutes;
        String formattedSeconds = seconds < 10 ? "0" + seconds : "" + seconds;
        return formattedHour + "h " + formattedMinutes + "m " + formattedSeconds + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) return "Invalid value";
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String formattedHour = hours < 10 ? "0" + hours : "" + hours;
        String formattedMinutes = remainingMinutes < 10 ? "0" + remainingMinutes : "" + remainingMinutes;
        String formattedSeconds = remainingSeconds < 10 ? "0" + remainingSeconds : "" + remainingSeconds;
        return formattedHour + "h " + formattedMinutes + "m " + formattedSeconds + "s";
    }

    /* ---- Challenges ---- */

    // Challenge 1. Speed Converter
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double result = kilometersPerHour / 1.609d;
        return Math.round(result);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour < 0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

    // Challenge 2. Megabytes Converter
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }

    // Challenge 3. Barking Dog
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    // Challenge 4. Leap Year Calculator
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    // Challenge 5. Decimal Comparator
    public static boolean areEqualByThreeDecimalPlaces(double p1, double p2) {
        int decimalP1 = (int)(p1 * 1000);
        int decimalP2 = (int)(p2 * 1000);
        return decimalP1 == decimalP2;
    }

    // Challenge 6. Equal Sum Checker
    public static boolean hasEqualSum(int p1, int p2, int p3) {
        return p1 + p2 == p3;
    }

    // Challenge 7. Teen Number Checker
    public static boolean hasTeen(int p1, int p2, int p3) {
        return isTeen(p1) || isTeen(p2) || isTeen(p3);
    }

    public static boolean isTeen(int p) {
        return p >= 13 && p <= 19;
    }

    /* Challenge 8. Area Calculator */
    public static double area(double radius) {
        return radius < 0 ? -1d : radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        return x < 0 || y < 0 ? -1d : x * y;
    }

    /* Challenge 9. Minutes to Years and Days Calculator */
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long remainingDays = days % 365;
        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }

    /* Challenge 10. Eqailty Printer */
    public static void printEqual(int p1, int p2, int p3) {
        if (p1 < 0 || p2 < 0 || p3 < 0)
            System.out.println("Invalid Value");
        else if (p1 == p2 && p2 == p3)
            System.out.println("All numbers are equal");
        else if (p1 != p2 && p2 != p3 && p1 != p3)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }

    /* Challenge 11. Playing Cat */
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return temperature >= 25 && temperature <= (summer ? 45 : 35);
    }
}

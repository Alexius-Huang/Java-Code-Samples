public class Primitive {

    /*
     * Each primitive type occupies different size of memory
     *
     * */

    public static void main(String[] args) {
        /* ---- Integers ---- */
        // Integers occupies 32 bits, or width of 32
        int randomInt = 123;

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println("Integer Maximum value is: " + maxInt);
        System.out.println("Integer Minimum value is: " + minInt);

        /* `Overflow` and `Underflow` */
        System.out.println("Busted Maximum value is: " + (maxInt + randomInt));
        System.out.println("Busted Minimum value is: " + (minInt - randomInt));

        // Will shown error since maximum value is 2147483647
        // int overflowedMaxInt = 2147483648;  <-- The integer value is too large

        /* Numeric separators via underscores */
        int moreReadableInt = 1_234_567;
        System.out.println("More readable integer separated by underscores: " + moreReadableInt);

        /* ---- Byte ---- */
        // Byte occupies 8 bits, or width of 8
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.println("Byte Maximum value is: " + maxByte);
        System.out.println("Byte Minimum value is: " + minByte);

        /* ---- Short ---- */
        // Short occupies 16 bits, or width of 16
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        System.out.println("Short Maximum value is: " + maxShort);
        System.out.println("Short Minimum value is: " + minShort);

        // Hint: Replace all
        // In IntellijJ IDEA, select `Edit` > `Find` > `Replace...` or use Command + R to replace code

        /* ---- Long ---- */
        // Long occupies 64 bits, or width of 64

        // Long values always postfix with letter `L`
        // long randomLongValue = 123L;

        // Without `L`, Java won't treat number as `long`
        // long tooLargeIntValueAssignedToLong = 2147483648;

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println("Long Maximum value is: " + maxLong);
        System.out.println("Long Minimum value is: " + minLong);


        /* ---- Type Casting --- */
        // Definitely valid case:
        int randomResult1 = minInt / 2;
        System.out.println("Result 1: " + randomResult1);

        // However, in this case, it is invalid since the evaluated expression is `int`
        // instead of `byte`:
        // byte randomResult2 = minByte / 2;

        // In order to solve this problem, we need to do `type casting` in order to tell
        // Java that we need type conversion:
        byte randomResult2 = (byte)(minByte / 2);
        System.out.println("Result 2: " + randomResult2);

        // Same as other type:
        short randomResult3 = (short)(minShort / 2);
        System.out.println("Result 3: " + randomResult3);


        /* ---- Float & Double ---- */
        // Floating point numbers contain fractional parts, single precision occupies 32 bits
        // while double precision occupies 64 bits
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float Maximum value is: " + maxFloat);
        System.out.println("Float Minimum value is: " + minFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double Maximum value is: " + maxDouble);
        System.out.println("Double Minimum value is: " + minDouble);

        // Float literal have postfix of letter `f`
        float asFloat = 3.14f;
        System.out.println("Float type: " + asFloat);

        // Double literal have postfix of letter `d`
        double asDouble = 3.14d;
        System.out.println("Double type: " + asDouble);

        // Floating point number in division have more accurate precision then using integers
        int divisionResult1 = 5 / 3;
        System.out.println("Integer division 5 / 3 result: " + divisionResult1);

        float divisionResult2 = 5f / 3f;
        System.out.println("Float division 5.0 / 3.0 result: " + divisionResult2);

        double divisionResult3 = 5d / 3d;
        System.out.println("Double float division 5.0 / 3.0 result: " + divisionResult3);

        // Tips:
        // 1. `double` is actually processed faster than `float`, JAVA also treat `double`
        //    as default floating point type
        // 2. Both `float` and `double` are generally well in performing floating point
        //    operations; however, it is not great to perform absolute precise calculations
        //    (e.g. currency calculations) due to limitation of how floating points worked
        //    (Use BigDecimal class instead)


        /* ---- Character & String (Array of Characters) ---- */
        // Character is different than `string`, it represents only a single character; Hence,
        // it is nested by single quotes.
        char letterM = 'M';
        System.out.println("Character M: " + letterM);

        // Character occupies 2 bytes of memory, which is 16 bits. (It allows you to store
        // Unicode characters, hence characters other than English letters)
        // See: https://unicode-table.com/en/
        //
        // Hence, we can also declare character in unicode escape format:
        char letterMFromUnicode = '\u004D';
        System.out.println("Character M from unicode: " + letterMFromUnicode);

        char copyrightSymbol = '\u00A9';
        System.out.println("Copyright character: " + copyrightSymbol);

        // String, although is a type in Java, is not a primitive type but is a Java class; it
        // represents a sequence of characters
        String message = "Hello world!";
        System.out.println(message);

        // String can also input unicode character:
        System.out.println("Copyright \u00A9");

        // Tips:
        // 1. `String` in Java are immutable, that is, appending / deleting character in string in
        //    Java is not strictly true. What really happens is that, string operations creates
        //    new string instance instead, the old one are obsoleted.
        // 2. Directly appending string isn't efficient, hence, in Java there is a class called
        //    `StringBuffer` which tackles this kind of problem.


        /* ---- Booleans ---- */
        // Booleans represents concept of either `true` or `false` (0 or 1 ... etc)
        boolean hasPet = true;
        System.out.println("Status of having a pet: " + hasPet);

        boolean isMarried = false;
        System.out.println("Status of getting married: " + isMarried);
    }

}

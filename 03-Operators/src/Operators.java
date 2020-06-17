public class Operators {

    public static void main(String[] args) {
        /* ---- Operators & Operands ---- */
        // Operators are symbols that performs operations on one, two or three operands
        // Operands are any objects that is manipulated by operators

        // summation using `+` operator, 1 and 2 are the operands
        int summation = 1 + 2;
        System.out.println("1 + 2 = " + summation);

        int difference = 5 - 3;
        System.out.println("5 - 3 = " + difference);

        int multiplication = 2 * 10;
        System.out.println("2 * 10 = " + multiplication);

        int division = 10 / 5;
        System.out.println("10 / 5 = " + division);

        int modular = 10 % 3;
        System.out.println("10 % 3 = " + modular);


        /* ---- Operator Shortcut ---- */
        // Increment
        summation++;
        System.out.println("Incremented summation: " + summation);

        // Decrement
        difference--;
        System.out.println("Decremented difference" + difference);

        // Operate specific amount of value and assign the result
        summation += 3;
        System.out.println("Add 3 to summation: " + summation);

        difference -= 3;
        System.out.println("Subtract 3 to difference: " + difference);

        multiplication *= 3;
        System.out.println("Multiply 3 to multiplication: " + multiplication);

        division *= 3;
        System.out.println("Divide 3 to division: " + division);


        /* ---- Logical Operator ---- */
        int topScore = 100;
        int passScore = 60;

        // Equality comparison
        if (topScore == 100)
            System.out.println("You got the highest score!");

        // Inequality comparison
        if (topScore != 100)
            System.out.println("You didn't got the highest score!");

        // Greater than or equal to comparison
        if (passScore >= 60)
            System.out.println("You at least pass the test!");

        // Hint:
        // 1. `==`: equality comparison
        // 2. `!=`: inequality comparison
        // 3. `>`, `>=`, `<`, `<=`: Greater or less then comparison with equality comparison

        // AND / OR operation
        if (topScore > passScore && topScore <= 100)
            System.out.println("&& AND operation checks both condition are satisfied");

        if (topScore > passScore || topScore <= 100)
            System.out.println("|| OR operation checks at least one of the condition is satisfied");

        // NOT operation
        boolean isCar = false;
        if (!isCar)
            System.out.println("This is not a car");

        // Ternary operator: shortcut of assigning either one from two values depending on specific condition
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("`wasCar` is true");


        /* ---- Operator Precedence ---- */
        // Check out:
        // 1. Operator Summary: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        // 2. Precedence Table: https://introcs.cs.princeton.edu/java/11precedence/


        /* ---- Operator Challenge ---- */
        double var1 = 20d;
        double var2 = 80d;
        double result = (var1 + var2) * 100;
        result %= 40;
        boolean remainZero = result == 0;
        System.out.println("Result % 40 is zero: " + remainZero);
        if (!remainZero)
            System.out.println("Got some remainder!");
    }

}

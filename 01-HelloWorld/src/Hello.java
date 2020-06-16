/* Defining a Java Class */
public class Hello {

    /*
     *  Method performs operation of a class
     *  `main` is a special method which acts as an entry in any Java class
     */
    public static void main(String[] args) {
        /* Operations are organized inside code-block nested by curly brackets */

        /*
         *  A statement is a command which can contain multiple operations, it should
         *  always end with a semicolon
         */
        System.out.println("Hello world!");


        /* ---- Declaring & Using Variables ---- */

        /* Declaration statement: Declaring a variable of data type `int` */
        int number1 = 123;
        System.out.println(number1);

        /* Arithmetic Operations */
        int number2 = 1 + 2 * (3 + 4);
        System.out.println(number2);

        /* Using variable in operations */
        int sum = number1 + number2;
        System.out.println(sum);
    }
}

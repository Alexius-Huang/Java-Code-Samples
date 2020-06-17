public class KeywordsAndExpressions {

    public static void main(String[] args) {
        /* ---- Expressions ---- */
        double miles = 100d;
        //     ~~~~~~~~~~~~ expression
        double kilometers = (miles * 1.609344d);
        //                   ~~~~~~~~~~~~~~~~~ arithmetic expression


        /* ---- Statements ---- */
        // Assignment Statement
        int luckyNumber = 14;

        // Conditional Statement
        boolean gameOver = true;
        int score = 5000;
        int levelsCompleted = 5;
        int bonus = 100;

        if (score < 1000) {
            System.out.println("Your score is less than 1000");
        } else if (score < 5000) {
            System.out.println("Your score is less than 5000");
        } else {
            System.out.println("Your score is over 5000");
        }

        if (gameOver) {
            int finalScore = score + (levelsCompleted * bonus);
            System.out.println("Your final score is: " + finalScore);
        }
    }

}

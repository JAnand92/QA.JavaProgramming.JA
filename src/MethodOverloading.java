public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = 0;
        newScore = calculateScore("Tom", 500);
        System.out.println("New score is " + newScore);

        newScore = calculateScore(400);
        System.out.println("New score is " + newScore);

        calculateScore();

        calcFeetAndInchesToCentimeters(12, 3);
        calcFeetAndInchesToCentimeters(100);
    }

    private static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points!");
        return score * 100;
    }

    private static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points!");
        return score * 100;
    }

    private static int calculateScore() {
        System.out.println("No player name, no player score!");
        return 0;
    }

    /*So, overloading is possible in java with different parameters only i.e. changing parameters change the
    * signature of the method. But, signature doesn't change by just changing the return type.*/

    /*Challenges to implement Method Overloading*/

    private static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet <0) || ((inches <0) || (inches>12))) {
            System.out.println("Invalid feet or inches parameters!");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;

        System.out.println(feet + " feet, " + inches + " inch = " + centimeters + "cm");
        return centimeters;
    }

    private static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0) {
            System.out.println("Invalid inches parameter!");
            return -1;
        }
        double feet = (int) (inches / 12);
        double remainingInches = (int) (inches % 12);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}


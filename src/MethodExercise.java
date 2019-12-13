public class MethodExercise {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your high score was " + highScore);

        highScore = calculateScore(true, 100, 4, 200);
        System.out.println("Your high score was " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Ron", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Tom", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(40);
        displayHighScorePosition("Tam", position);

        checkNumber(5);
        checkNumber(-1);
        checkNumber(0);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1; /*-1 is used to return error in java!*/
    }

    /*Challenge 1*/
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position "
                + position + " on high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if ((playerScore >= 500)) {
            return 2;
        } else if ((playerScore >= 100)) {
            return 3;
        }
        return 4;

       /*Different way to do this challenge*/
        /*int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if ((playerScore >= 500)) {
            position = 2;
        } else if ((playerScore >= 100)) {
            position = 3;
        }
        return position;*/
    }

    /*psvm for main method short cut*/

    /*Challenge 2 : Check number*/
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        } else if(number < 0){
            System.out.println("negative");
        } else if(number == 0){
            System.out.println("zero");
        }
    }
}

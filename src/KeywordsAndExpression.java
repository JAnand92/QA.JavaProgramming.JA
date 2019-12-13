public class KeywordsAndExpression {

    public static void main (String[] args){
        /* A mile is equal to 1.609344 km. Now, if you want to find out how many miles 100 miles will have?*/

        double kilometers = (100 * 1.609344);
        /*data type is not part of expression hence apart from double every thing is expression.
        * double is java pre-defined keyword*/
        System.out.println(" 100 Miles = " + kilometers);

        int highScore = 50;
        if(highScore == 50){
            System.out.println("This is an expression.");
        }

        /*Exercise
        * Check in the following code below, which are expression*/
        int score = 100; // score = 100 --> this is expression.
        if(score > 99){ // score > 99 --> this is expression.
            System.out.println("You got the highest score!"); // You got the highest score! --> this is expression.
            score = 0;
        }
    }
}

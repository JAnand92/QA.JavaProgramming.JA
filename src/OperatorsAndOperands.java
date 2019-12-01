public class OperatorsAndOperands {

    public static void main (String[] args){
        /* Operator and Operand
         * Operator - Special symbols that perform special operations on one, or two operands and return the result.
         * Operand - Any object that is manipulated by an operator.*/
        int result = 1 + 2;
        System.out.println("The result = " + result);
        int previousResult = result;
        System.out.println("Previous result = " + previousResult);
        result = previousResult - 1;
        System.out.println("Updated result = " + result);
        result = result * 10;
        System.out.println("Updated result again = " + result);

        result = result / 2;
        System.out.println("Divide operator used, then result =  " + result);

        result = result % 2;
        System.out.println("Modulus operator used, then result = " + result);

        result = result++ + result-- ;
        System.out.println(result *=10);

        /*If and Else*/
        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And, I'm scared of aliens!");
        } else {
            System.out.println("It is an alien!");
        }

        /*Logical AND Operator*/
        int topScore = 100;
        if (topScore == 100){
            System.out.println("You have get the highest score.");
        }else if (topScore != 100){
            System.out.println("You have not got the highest score.");
        }else if (topScore > 100){
            System.out.println("You have not got the highest score.");
        }else if (topScore < 100){
            System.out.println("You have not got the highest score.");
        }

        int secondTopScore = 80;
        if ((secondTopScore < topScore) && (topScore == 100)){
            System.out.println("Greater than second top score and less than top score.");
        }

        if ((topScore > 100) || (secondTopScore < 90)){
            System.out.println("Either or both of the condition to be true.");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is not suppose to happen.");
        }

        boolean isCar = true;
        if (isCar == false){ // if (!isCar)
            System.out.println("This is not suppose to happen.");
        }

        /*Ternary Operator*/
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true!");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;

        System.out.println("Client is age of 20!");

        /*Challenge*/

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValueTotal = (myFirstValue + mySecondValue) * 100;
        double theReminder= myValueTotal % 40.00d;
        System.out.println("theReminder = " + theReminder);
        boolean isNoReminder = (theReminder == 0) ? true : false;
        System.out.println("isNoReminder = " + isNoReminder);
        if (!isNoReminder){
            System.out.println("Got some reminder.");
        }

    }
}

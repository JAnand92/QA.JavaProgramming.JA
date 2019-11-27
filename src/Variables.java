public class Variables {
    /* Variables - a way of store information in our computer.*/

    public static void main(String[] args){
        /*initialise int data type variable - myFirstNumber */
        int myFirstNumber = (5 + 10) + (10 + 5);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber*5;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;

        /*sout - shortcut for System.out.println
        * Print the value of all variables.*/

        System.out.println(myFirstNumber);
        System.out.println(mySecondNumber);
        System.out.println(myThirdNumber);
        System.out.println(myTotal);
        System.out.println(myLastOne);
    }
}

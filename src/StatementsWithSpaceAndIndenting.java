public class StatementsWithSpaceAndIndenting {

    public static void main (String[] args){
        int myVariable = 50; // This complete line of code is STATEMENT
        myVariable++;
        myVariable--;
        System.out.println(myVariable);
        /*STATEMENT can be on different lines as well.*/
        System.out.println("This is statement" +
                "present on different lines.");
        /* Good practice - DO NOT put line of code on same line.*/
        /* White space --> Java try ignore white space. And, it is there in line of
        * code so that easy to read.
        * Code --> Refactor code used to give indentation to the code.*/

        /*CODE BLOCK
        * Variable created in code block can be scope. And, it is not accessible
        * outside from code block.*/

    }
}

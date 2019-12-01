public class StringDataType {
    public static void main(String[] args){
        /*Sequence of characters - StringDataType*/
        java.lang.String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more.";
        System.out.println(myString);

        int myInt = 50;
        String lastString = "10";
        lastString = lastString + myInt;
        System.out.println("Last String is = " + lastString);

        /*Strings are immutable i.e. you can't change the value of string once it's created.
        * Java automatically create a new string with the value of old string and some new string.
        * And, java delete the old string variable from memory.*/
    }
}

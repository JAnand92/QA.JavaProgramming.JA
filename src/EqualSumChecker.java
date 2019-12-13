public class EqualSumChecker {

    public static void main(String[] args) {
        boolean isEqual = hasEqualSum(1,1,1);
        System.out.println(isEqual);
    }

    public static boolean hasEqualSum(int myVal1, int myVal2, int myVal3) {
        int mySum = myVal1 + myVal2;
        if(mySum == myVal3) {
            return true;
        }
        return false;
    }
}

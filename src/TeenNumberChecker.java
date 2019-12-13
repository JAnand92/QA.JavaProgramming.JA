public class TeenNumberChecker {

    public static void main(String[] args) {

        boolean isTeenNumber = hasTeen(9,99,19);
        System.out.println(isTeenNumber);

        boolean isTeenNum = isTeen(9);
        System.out.println(isTeenNum);
    }

    public static boolean hasTeen(int myVal1, int myVal2, int myVal3) {
        if(myVal1 >= 13 && myVal1 <= 19) {
            return true;
        } else if(myVal2 >=13 && myVal2 <= 19) {
            return true;
        } else if(myVal3 >= 13 && myVal3 <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int myVal) {
        if(myVal >= 13 && myVal <= 19){
            return true;
        }
        return false;
    }
}

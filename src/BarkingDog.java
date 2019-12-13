public class BarkingDog {
    public static void main(String[] args) {
        boolean wakeUpFlag = shouldWakeUp(true, 4);
        System.out.println(wakeUpFlag);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if(hourOfDay < 8 || hourOfDay > 22){
            if(barking){
                return true;
            }
        }
        return false;
    }
}

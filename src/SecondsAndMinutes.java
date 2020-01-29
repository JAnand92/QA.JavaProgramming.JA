public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Values!";
    public static void main(String[] args) {
        System.out.println(getDurationString(175, 59));
        System.out.println(getDurationString(3618L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMin = minutes % 60;

        String hourString = hours + "h";
        String minuteString = remainingMin + "m";
        String secondString = seconds + "s";
        if(hours < 10)
            hourString = "0" + hourString;
        if(remainingMin < 10)
            minuteString = "0" + minuteString;
        if(seconds < 10)
            secondString = "0" + secondString;

        return (hourString + " " + minuteString + " " + secondString);
    }

    private static String getDurationString(long seconds) {
        if(seconds < 0)
            return INVALID_VALUE_MESSAGE;
        long minutes = seconds / 60;
        long remainingSec = seconds % 60;

        return getDurationString(minutes, remainingSec);
    }
}

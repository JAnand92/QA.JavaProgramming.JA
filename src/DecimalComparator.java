import java.text.DecimalFormat;

public class DecimalComparator {
    public static void main(String[] args) {
        boolean compareValue = areEqualByThreeDecimalPlaces(3.1756, 3.175);
        System.out.println(compareValue);
    }

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);


        String param1Format = df.format(param1);
        System.out.println(param1Format);
        String param2Format = df.format(param2);
        System.out.println(param2Format);
        if(param1Format.equals(param2Format)){
            return true;
        }
        return false;
    }
}

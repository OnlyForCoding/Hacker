import java.util.Scanner;

public class TimesConversion {

    static String timeConversion(String s) {


        String splitString[] = s.split(":");
        String hours = splitString[0];
        String minutes = splitString[1];
        String seconds = splitString[2].substring(0,splitString[2].length()-2);
        int hoursIn24Format;

        if (s.contains("AM")){
            if (Integer.parseInt(splitString[0]) == 12){
                hours = "00";
            }
        }

        if (s.contains("PM")){
            if (Integer.parseInt(hours)<12){
                hoursIn24Format = Integer.parseInt(hours) + 12;
                hours = Integer.toString(hoursIn24Format);
            }
        }

        return hours+":"+minutes+":"+seconds;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

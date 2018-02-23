import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CamelCase {

    static int camelcase(String ss) {
        List<String> ssArray = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        char[] charsArray = ss.toCharArray();
        for (int i=0; i<charsArray.length; i++){

            if (i == 0){
                if (Character.isUpperCase(charsArray[i])){
                    System.out.println("Entered String is not camel case");
                    return 0;
                }
            }

            if (Character.isUpperCase(charsArray[i])){
                String ss1 = sb.toString();
                ssArray.add(ss1);
                sb = new StringBuffer();
                sb.append(charsArray[i]);
                if(i == charsArray.length-1){
                    System.out.println("String is camel casing but incomplete.");
                    return 0;
                }
            }else{
                sb.append(charsArray[i]);
                if (i == charsArray.length-1){
                    String sss1 = sb.toString();
                    ssArray.add(sss1);
                }
            }
        }
        return ssArray.size();
    }

    public static void main(String[] args) {
        System.out.println("Enter camel casing String");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}

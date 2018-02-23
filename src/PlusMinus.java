import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        int size = arr.length;
        double positive = 0.0;
        double noZero = 0.0;
        double negative = 0.0;

        for(int i = 0; i<size; i++){
            if (arr[i] > 0){
                positive = positive + 1;
            }else if (arr[i] < 0){
                negative = negative + 1;
            } else{
                noZero = noZero + 1;
            }
        }

        System.out.printf("%.6f\n%.6f\n%.6f",positive/6,negative/6,noZero/6);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}

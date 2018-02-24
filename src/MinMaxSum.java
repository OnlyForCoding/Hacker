import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

    static void miniMaxSum(int[] arr) {

        long minSum = 0;
        long maxSum = 0;

        for (int i=0;i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array : "+ Arrays.toString(arr));

        for (int i=0 ;i<arr.length-1; i++){
            minSum = minSum + arr[i];
        }

        for (int i=1; i<arr.length; i++){
            maxSum = maxSum + arr[i];
        }

        System.out.print(minSum+" "+maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}

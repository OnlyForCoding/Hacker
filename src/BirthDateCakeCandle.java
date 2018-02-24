import java.util.Scanner;

public class BirthDateCakeCandle {

    static int birthdayCakeCandles(int n, int[] ar) {

        int noOfTallestCandles = 0;
        int largest = ar[0];

        for(int i=1; i<ar.length; i++){
            if(largest<ar[i]){
                largest = ar[i];
            }
        }

        for (int i=0; i<n; i++){
            if (largest == ar[i])
                noOfTallestCandles++;
        }

        return noOfTallestCandles;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}

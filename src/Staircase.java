import java.util.Scanner;

public class Staircase {

    static void staircase(int n) {
        char a = '#';

        for(int i=1;i<=n;i++){
            for (int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=i;k>=1; k--){
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}

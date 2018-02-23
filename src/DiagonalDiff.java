import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDiff {



    static int diagonalDifference(int[][] a) {
        // Complete this function

        Integer totalRows = a.length;

        int [] primaryDiagonal = new int[totalRows];
        int [] secondaryDiagonal= new int[totalRows];
        int totalDiag1 = 0;
        int totalDiag2 = 0;
        int no = 0;


        for(int i=0; i<totalRows; i++){
            primaryDiagonal[i] = a[i][no];
            no++;
        }

        for(int i = 0; i<primaryDiagonal.length; i++){
            totalDiag1 = totalDiag1 + primaryDiagonal[i];
        }

        no = 0;

        for(int i=totalRows-1; i>=0; i--){
            secondaryDiagonal[i] = a[i][no];
            no++;
        }

        for(int i = 0; i<secondaryDiagonal.length; i++){
            totalDiag2 = totalDiag2 + secondaryDiagonal[i];
        }

        return Math.abs(totalDiag1-totalDiag2);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}

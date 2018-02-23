

public class HackerRankInString {

    public static void main(String[] args) {
        String s = "haacckkerrannkk";
        String expectedString = "hackerrank";
        char [] expectedString1 = expectedString.toCharArray();
        char [] s1 = s.toCharArray();
        String ss = "";
        int k = 0;

        for (int i=0 ;i<expectedString1.length; i++){
            for (int j=k; j<s1.length; j++){
                if (s1[j] == expectedString1[i]){
                    k = j;
                    ss = ss + s1[j];
                    continue;
                }
            }
        }

        System.out.println(ss);
    }
}

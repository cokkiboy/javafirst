package basic.loop;

public class BreakExam {
    public static void main(String[] args) {
        outer:for (int i = 0; i <= 2; i++) {
         for (int j = 0; j <= i; j++) {
             if (i == j) {
                 break outer;
             }
             System.out.println(i+"-"+j);
         }
        }
    }
}

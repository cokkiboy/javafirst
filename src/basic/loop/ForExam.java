package basic.loop;

import java.util.Scanner;

public class ForExam {
    public static void main(String[] args) {


     /*   for (int i = 1; i <=200 ; i++) {
          if (i % 6 == 0 && i % 12 != 0) {
              System.out.print(i+" ");
          }

        }*/

       Scanner scanner     =new Scanner(System.in);
           int n = scanner.nextInt();
           int sum = 1;
        for (int x = 1; x <=n; x++) {

            sum*=x;

        }
        System.out.println(sum);
    }
}

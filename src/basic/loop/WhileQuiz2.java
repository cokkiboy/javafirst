package basic.loop;

import java.util.Scanner;

public class WhileQuiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num = sc.nextInt();
         int i=2;
         int count=0;
       while (i<= num) {
           if ( num %i ==0){
               count++;

           }
           i++;
       }
        if (count == 2) {
            System.out.println("소수이다");
        }
        else {
            System.out.println("소수아니다");
        }
    }
}

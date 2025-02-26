package basic.constate;

import java.util.Scanner;

public class IfExam {
    public static void main(String[] args) {
       Scanner sc =   new Scanner(System.in);
        String result ="";
       int score = sc.nextInt();
        if (score >=60) {
            System.out.println("합격");
        }
       else {
            System.out.println("불합격");
        }
    }
}

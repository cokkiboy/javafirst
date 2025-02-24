package basic.begin;

import java.util.Scanner;

public class ScannerExam {
     public static void main(String[] args) {

         // 스케너 객체 생성
         Scanner sc = new Scanner(System.in);
          String name = sc.next();
         System.out.println("sc = " + name);

         int age = sc.nextInt();
         System.out.printf("sc = %d", age);
        sc.close();

     }
}

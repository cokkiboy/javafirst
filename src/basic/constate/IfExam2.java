package basic.constate;

import java.util.Scanner;

public class IfExam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int age = sc.nextInt();
       if (age >=20) {

           if (age <40) {
               System.out.println("청년이다");
           }
           else if (age <65) {
               System.out.println("장년층입니다");
           }
           else {
               System.out.println("노년층입니다.");
           }
       }
     else if (age >=17) {
         System.out.println("고등학생");
       }
      else if (age >=14) {
          System.out.println("중학생");

       }
      else if (age >=8) {
          System.out.println("초등학생");
       }
      else{
           System.out.println("미취학아동");
       }
    }
}

package basic.loop;

import java.util.Scanner;

public class WhileQuiz1 {
    public static void main(String[] args) {
     Scanner  sc  =new Scanner(System.in);

     int num1=sc.nextInt();
     int num2=sc.nextInt();
     int num3=sc.nextInt();

     int max ,min , mid;

     if(num1>num2 && num1>num3){
         max=num1;
     }
     else if(num2>num1 && num2>num3){
         max=num2;
     }
     else if(num3>num1 && num3>num2){
         max=num3;
     }

    }
}

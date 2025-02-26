package basic.constate;

import java.util.Scanner;

public class IfQuiz01 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int height = sc.nextInt();

        if (age >= 8 && height >= 140) {

            System.out.println("탑승 가능");

        } else if ( height < 140 && age>=8) {
            System.out.println("키가 작아서 탑승불가");
        } else if ( age >=6 && age <8) {
            System.out.println("보호자 동반 탑승가능");
        }
        else {
            System.out.println("탑승불가");
        }
        System.out.println("오늘 하루 즐거운 시간되세요");
    }
}

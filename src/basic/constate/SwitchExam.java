package basic.constate;

import java.util.Scanner;

public class SwitchExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("성별을 입력하시오");
        String gender = sc.next();
        switch (gender) {
            case "M":
                System.out.println("남성입니다.");
                break;
            case "F":
                System.out.println("여성입니다");
            default:
                System.out.println("잘못된 입력");
        }
    }
    
}

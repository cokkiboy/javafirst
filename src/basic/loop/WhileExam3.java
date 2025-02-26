package basic.loop;

import java.util.Scanner;

public class WhileExam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row =1;
    while(row<=9) {
        System.out.println(n*row);
        row++;

    }
    }
}

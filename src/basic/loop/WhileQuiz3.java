package basic.loop;

import java.util.Scanner;

public class WhileQuiz3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

       int start = Math.min(x, y);
       int end = Math.max(x, y);
      int total = 0;
       while (start  <= end){
           total+=start;
            start++;
       }
        System.out.println(total);
    }
}

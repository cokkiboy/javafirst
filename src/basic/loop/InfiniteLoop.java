package basic.loop;

import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args) {

                  Scanner sc = new Scanner(System.in);
                  while (true) {
                      System.out.println("");
                      int answer =sc.nextInt();

                      if (answer == 90){
                         break;
                      }
                      else if (answer == 0){
                          System.out.println("90");
                          break;
                      }
                      else {
                          System.out.println("틀렸습니다");
                      }
                  }
    }
}

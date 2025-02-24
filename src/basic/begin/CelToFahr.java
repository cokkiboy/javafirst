package basic.begin;

import java.util.Scanner;

public class CelToFahr {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);

       double cell = scanner.nextDouble();

       double far=  cell*1.8+32;

       System.out.printf("%.1f",far);
        scanner.close();
    }
}

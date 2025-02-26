package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

public static void main(String[] args) {

    String [] foods = {"피자","파스타","치킨","삼겹살"};
      Scanner sc = new Scanner(System.in);
      String search = sc.next();
      boolean found = false;
      for(int i=0;i<foods.length;i++){

          if(search.equals(foods[i])){
              System.out.println(i);

        break;

          }
      }
    
 
}
}

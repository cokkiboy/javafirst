package basic.array;

import java.util.Arrays;

public class ArrayPop {

    public static void main(String[] args) {


        int [] numbers = {10,20,30,40,50,60};

 int [] temp = new int[numbers.length-1];

   for(int i=0;i<temp.length-1;i++){
       temp[i] = numbers[i];
   }
     int removeNumber = numbers[temp.length-1];
   numbers= temp;
   temp =null;
        System.out.println(Arrays.toString(temp));
        System.out.println(removeNumber);

    }
}

package basic.array;

public class ArrayDelete {
    public static void main(String[] args) {
        int [] numbers = {1,3,5,7,9,11};

        int targetIndex = 2;
       for(int i=targetIndex; i<numbers.length-1; i++){
           numbers[i]=numbers[i+1];


       }

       int [] temp = new int[numbers.length-1];

       for(int i=0; i<temp.length; i++){
           temp[i]=numbers[i];
       }
  numbers=temp;
    temp =null;
    }
}

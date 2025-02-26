package basic.array;

public class ArrayPush {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40};
        int newNumber=50;
        int[] newNumbers=new int[numbers.length+1];

        for (int i=0;i<numbers.length;i++){
            newNumbers[i]=numbers[i];
        }

        newNumbers[numbers.length-1]=newNumber;
        numbers=newNumbers;
        newNumbers= null;
    }
}

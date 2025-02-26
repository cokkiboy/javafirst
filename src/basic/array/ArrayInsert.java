package basic.array;

public class ArrayInsert {
    public static void main(String[] args) {

        int [] arr ={10,50,90,100,150};
        int newNum = 66;
        int targetIndex =2;

        int [] newArr =new int[arr.length+1];
        for (int i = 0; i < arr.length   ; i++) {
            newArr[i] = arr[i];
        }

        for (int i =arr.length;i> targetIndex ; i--) {
            newArr[i] = newArr[i-1];
        }

     }
}

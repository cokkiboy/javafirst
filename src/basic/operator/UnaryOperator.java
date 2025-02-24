package basic.operator;

public class UnaryOperator {
    public static void main(String[] args) {
        //증감 연산자 (++,--)

        int a = 5;
       /* int b =  a++;
        int c = a--;*/

        int j =++a;  //전위 연산

        int k =--a; //후위 연산


        System.out.println(k);
        System.out.println("a = " + a);
    }
}

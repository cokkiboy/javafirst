package basic.operator;

public class ConditionalOperator {
    public static void main(String[] args) {
        /*
             # 3항 연산자
             - 피 연산자(연산을 당하는 값)가 3개인 연산자를 말합니다.
             - (조건식 ? 좌항 : 우항);
             - 조건식을 비교하여 true일 경우에는 좌항이,
              false일 경우에는 우항의 값이 도출됩니다.
        */

        /*int a = 10; int b = 20;
      String  result=  a > b ? "x는 y보다 큽니다.": "x는 y보다 작습니다.";
        System.out.println("result = " + result);*/

        int random = (int) (Math.random()*355+42);

        String result ="";
         result =random %2 == 0 ? "짝수":"홀수";

 System.out.println(random);
        System.out.println("result = " + result);
    }
}

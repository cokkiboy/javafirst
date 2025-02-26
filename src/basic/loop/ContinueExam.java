package basic.loop;

public class ContinueExam {
    public static void main(String[] args) {
      /*  for (int i = 0; i <= 10; i++) {
            if (i ==5)  continue;
            System.out.println(i+"");
        }
        System.out.println("\n반복문 종료!");*/
       int n=1;
       while(n<=10) {
           if(n==5) continue;
           //조건식으로 이동 
           System.out.print(n+"");
           n++;
       }
    }
}

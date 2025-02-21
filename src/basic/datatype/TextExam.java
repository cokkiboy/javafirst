package basic.datatype;

public class TextExam {
    public static void main(String[] args) {
        char ch ='A';
                System.out.println(ch);
          char ch2 =127;

System.out.println(ch2);
 String str = "abc";
 String str2 = "def";
 String str3 = "ghi";
        System.out.println(str3+ str+str2);//덧셈만 가능 나머지 타입들 안된다 
/*
         # 문자열을 저장할 수 있는 데이터 타입 String
         - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입합니다.
         - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
         기본 데이터 타입처럼 사용합니다. (사실은 객체 타입)
         */
    int month =12;
    int day =25;
    String anniversary = "January";

        System.out.println( day + ""+month+""+anniversary);

    }
}

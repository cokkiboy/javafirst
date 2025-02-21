package basic.casting;

public class CastingExam3 {
    public static void main(String[] args) {
        char ch = 'B';
        int i =2;
        int intResult = i+ch;
        char chResult =    (char)(i+ch);
        System.out.println(intResult);
        //서로 다른 타입간의 연산은  작은 쪽이 클쪽을 따라간다
        System.out.println("chResult = " + chResult);
        
        // double 의 연산을 위해 직접 형 변환을 진행해야한다
        int k =10;
        double d=(double)k/4;
        System.out.println("d = " + d);
    }
}

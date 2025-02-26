package basic.loop;

public class WhileExam2 {
    public static void main(String[] args) {

     /*    int i =1;
        while (i<=100) {
            if(i%4==0 && i%8!=0){
                System.out.print(i+" ");
            }
            i++;
            System.out.println("*");
        }*/
     int i =1;
     int n=1;
     while(i<=1000){
         if (1000 %i== 0) {
              n++;

         }

  i++;
     }
        System.out.println(n);
    }
}

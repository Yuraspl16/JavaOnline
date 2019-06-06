
public class Exercise5 {
    public static void main(String[] args) {
        int t = 5000; //период времени в секундах.
        int h,m,s; // часы, минуты, секунды.

        h= t/3600;
        m=(int)(Math.IEEEremainder((double) t,(double) 3600))/60;
        s= t - ((h*3600)+(m*60));
        System.out.println(h+"ч "+m+"мин "+s+"с ");


    }
}

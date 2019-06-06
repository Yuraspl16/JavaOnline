public class Exercise2_4 {
    public static void main(String[] args) {
        int A,B,x,y,z; //размеры кирпича и отверстия
        A=2;
        B=1;
        x=6;
        y=2;
        z=4;

        if ((A>x && B>y || B>z)||(B>x && A>y || A>z)||(A>y && B>x || B>z))  {

            System.out.println( "Кирпич с указанными параметрами пройдёт ");
        }

        else if   ((B>y && A>x || A>z)||(A>z && B>x || B>y)||(B>z && A>x || A>y))
        {
            System.out.println( "Кирпич с указанными параметрами пройдёт ");
        }

        else System.out.println( "Кирпич с указанными параметрами не пройдёт ");


    }
}

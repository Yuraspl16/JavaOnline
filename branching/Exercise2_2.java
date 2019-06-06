public class Exercise2_2 {
    public static void main(String[] args) {
        int a,b,c,d; //переменные
        a=8;
        b=22;
        c=11;
        d=6;
        int maximum;

        if ((a<b)&&(c<d)) {
            maximum = Math.max(a,b);
            System.out.println( "Искомое значение " + maximum);

        }
        else if ((a<b)&&(c>d)) {
            maximum = Math.max(a,d);
            System.out.println( "Искомое значение " + maximum);

        }
        else if ((a>b)&&(c<d)) {
            maximum = Math.max(b,c);
            System.out.println( "Искомое значение " + maximum);

        }
        else if ((a>b)&&(c>d)) {
            maximum = Math.max(b,d);
            System.out.println( "Искомое значение " + maximum);

        }

    }
}

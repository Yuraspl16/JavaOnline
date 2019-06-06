public class Exercise2
{
    public static void main(String[] args) {
        double a=0,b=2,c=2; // переменые a,b,c
        String fall;
        double result;
        fall = (a == 0) ? "Делить на ноль нельзя, проверьте переменную a \n" : "Условия соблюдаются, произвожу вычисления..\n";
        System.out.println(fall);
        result = (b+Math.sqrt(Math.pow(b,(double)2)+4*a*c))/(2*a)-(Math.pow(a,(double)3)*c)+(Math.pow(b,(double)-2));
        System.out.println("Результат " + result);


    }


}

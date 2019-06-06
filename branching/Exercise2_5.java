public class Exercise2_5 {
    int x;
    public static void main(String[] args) {
        int x; //значение переменной x
        x=4;
        float result;

        if (x<=3)  {

           result=(float)(((Math.pow(x,2)-3*x)+9));
            System.out.println(result);
        }

        else {
            result = (float) (1 / ((Math.pow(x, 3) + 6)));
            System.out.println(result);
        }

    }

}

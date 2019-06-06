public class Exercise2_3 {
    public static void main(String[] args) {
        int x1,x2,x3,y1,y2,y3; //координаты точек А(x1,y1), B(x2,y2), C(x3,y3)
        x1=2;
        x2=5;
        x3=6;
        y1=2;
        y2=4;
        y3=6;

        if ((y3-y1)/(y2-y1)==(x3-x1)/(x2-x1)) {

            System.out.println( "Точки находятся на одной прямой ");

        }
        else  System.out.println("Точки лежат не на одной прямой");
    }

}

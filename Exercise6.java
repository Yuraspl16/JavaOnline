public class Exercise6 {
    public static void main(String[] args) {
        int x,y; //координаты точек.
        x=2;
        y=1;
        boolean result;
        result =((y>=0) && (y<=4) && (x>=-2) && (x<=2)) || ((y<=0) && (y>=-3) && (x>=-4) && (x<=4));
        System.out.println(result);


    }
}

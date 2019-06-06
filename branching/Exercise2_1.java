public class Exercise2_1 {
    public static void main(String[] args) {
        int x,y; //углы треугольника
        x=20;
        y=70;
        int z;
        if ((180-(x+y))>0)
        {
            System.out.println("Сумма введенных углов <180, треугольник существует");

            if (x==90||y==90)
            {
                System.out.println("Треугольник будет прямоугольным");
            }
            else if (x+y==90)
            {
                System.out.println("Треугольник будет прямоугольным");
            }
        }
        else  System.out.println("Сумма введенных углов >180, треугольник не строится");
    }
}

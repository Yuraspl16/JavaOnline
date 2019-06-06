import java.math.BigDecimal;

public class Exercise3 {
    public static void main(String[] args) {
        double x = Math.toRadians(50); //ввод значения угла x в градусах
        double y= Math.toRadians(45); //ввод значения угла у в градусах
        String fall;
        double result;
        fall = ((float)Math.cos(x)==(float)Math.sin(y)) ? "Делить на ноль нельзя, проверьте величину углов x,y \n" : "Условия соблюдаются, произвожу вычисления..\n";
        System.out.println(fall);
        result = ((Math.sin(x)+Math.cos(y))/((float)Math.cos(x)-(float)Math.sin(y)))*Math.tan(x*y);
        System.out.println("Результат " + result);
    }

}


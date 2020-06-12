import java.util.Arrays;

public class Exercise3_5 {
    public static void main(String[] args) {
        int i = 10; //количество членов ряда
        int a = -2; //начало числового диапазона
        int n =1; // шаг
        double e=0.54; // константа
        double sum=0; //сумма
        double[] row = new double[i];
        System.out.println("Строим числовой ряд по общему члену");
        for (i = 0; i < 10; i++, a = a + n) {
            row[i] = (1 / Math.pow(2, (double) a)) + (1 / Math.pow(3, (double) a));
        }
        System.out.println(Arrays.toString(row));
        System.out.println("Находим сумму чисел > по модулю числа e");

        for (i=0;i<10;i++) {
            while (Math.abs(row[i])>=e)
            {
              sum=sum+Math.abs(row[i]);
              break;
            }

        }
        System.out.println(sum);

    }
}
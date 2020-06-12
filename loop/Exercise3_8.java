import java.util.Scanner;

public class Exercise3_8 {
    public static void main(String[] args) {
        int m; //число 1
        int n; // число 2
        int ostatok1; // остаток от деления на 10 первого числа
        int count;
        System.out.print("Введите число №1(Integer) ");
        Scanner reader = new Scanner(System.in);
        m = reader.nextInt();
        System.out.print("Вы ввели  ");
        System.out.println(m);
        System.out.print("Введите число №2(Integer) ");
        n = reader.nextInt();
        System.out.print("Вы ввели  ");
        System.out.println(n);
        String number2 = Integer.toString(n);
        //System.out.println(number2); // преобразование второго числа в строку.
        String str="";
        while (m != 0) {
            ostatok1 = m % 10;
            String number1 = Integer.toString(ostatok1);
            boolean isContain = number2.contains(number1);
            if (isContain == true) {
                boolean isContain2 = str.contains(number1);
                if (isContain2!=true) {
                    str = str + number1+",";
                }
                m = m / 10;
            } else {
                m = m / 10;
            }


        }
        if(str.endsWith(","))
        {
            str = str.substring(0,str.length() - 1);
        }
        System.out.print("\n Повторяющиеся цифры в числе №1 и №2 -\t" + str+".");
    }
}


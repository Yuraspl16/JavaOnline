import java.util.Scanner;

public class Exercise3_7 {
    public static void main(String[] args) {
        int m,n,d;
        System.out.print("Введите число m ");
        Scanner reader = new Scanner(System.in);
        m = reader.nextInt();
        System.out.print("Вы ввели  ");
        System.out.println(m);
        System.out.print("Введите число n ");
        n = reader.nextInt();
        System.out.print("Вы ввели  ");
        System.out.println(n);
       if (m<=n) {
           while (m <= n) {
               System.out.print("Проверяем число " + (m) + " делители \t");
               for (d = 2; d <= (m); d++) {
                   if (m % d == 0) {
                       System.out.print("  " + (d) + ",");
                   }

               }
               m++;
               System.out.println();

           }
       }
       else {
           while (m > n) {
               System.out.print("Проверяем число " + (n) + " делители \t");
               for (d = 2; d <= (n); d++) {
                   if (n % d == 0) {
                       System.out.print("  " + (d) + ",");
                   }

               }
               n++;
               System.out.println();

           }


       }

    }
}
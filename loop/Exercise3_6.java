import java.util.Arrays;

public class Exercise3_6 {
    public static void main(String[] args) {
        System.out.println("Код символа \t Значение" );
        char a = 0;
        int x=0;// код числа в ASCII;

        while (x<255) {
            System.out.println("\t"+(x) + "\t\t\t\t" + (a));
            x++;
            a++;
        }
    }
}

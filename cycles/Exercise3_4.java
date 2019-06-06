import java.math.BigInteger;

public class Exercise3_4 {
    public static void main(String[] args) {
        int n = 200; // натуральное число, вводимое пользователем
        int i; //счетчик
        BigInteger proizvedenie = new BigInteger("1");
        for (i=1;i<=n;i++) {
        proizvedenie = proizvedenie.multiply(BigInteger.valueOf((long)Math.pow(i,2)));

        }
        System.out.println(proizvedenie);
    }
}

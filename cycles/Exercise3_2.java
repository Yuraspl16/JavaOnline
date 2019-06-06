public class Exercise3_2 {
    public static void main(String[] args) {
        int a=-8,b=10; //границы
        int h=2;//шаг
        int x,result;

        for(x=a;x<=b;x=x+h)
        {
            if (x<=2)
            {
            result=-x;
            System.out.println(result);
            }
            else
             {
                result = x;
                System.out.println(result);
             }

        }

    }

}

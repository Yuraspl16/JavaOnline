public class Exercise4 {
    public static void main(String[] args) {
        float r = 555.666f; //число nnn.ddd
        float nnn;
        nnn=(int)r;
        r=(int)((r-nnn)*1000)+(nnn/1000);
        System.out.println(r);

    }
}
package first;

public class Main1 {
    /*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String startTime = simpleDateFormat.format(new Date());*/
    public static void main(String[] args) {
        float a = 0.8f;
        float b = 0.7f;
        float c = 0.6f;
        System.out.println(a - b);
        System.out.println(b - c);
        System.out.println(a - b == b - c);
    }
}

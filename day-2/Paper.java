import java.util.*;

public class Paper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int p = x - y;
        int tp = p * w;
        int fp = tp -100;
        System.out.println(fp);
        scan.close();
    }
    
}

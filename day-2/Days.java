import java.util.*;

public class Days {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        int y = d / 365;
        int w = (d % 365) / 7;
        int da = d % 365 % 7;
        System.out.println(y);
        System.out.println(w);
        System.out.println(da);
        scan.close();
    }
    
}

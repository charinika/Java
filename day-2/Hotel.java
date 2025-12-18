import java.util.*;

public class Hotel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int r = scan.nextInt();
        int d = scan.nextInt();
        
        if ( m == 4 || m == 5 || m == 6 || m == 11 || m == 12) {
            double tr = ((r * d ) + (r * d * 0.20 ));
            System.out.println(tr);
        } else {
            int tr = r * d;
            System.out.println(tr);
        }
        scan.close();
    }
    
}

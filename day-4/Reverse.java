import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = 0;
        while (n > 0) {
            int ld = n % 10;
            r = ( r * 10 ) + ld;
            n /= 10;
            
        }

        System.out.println(r);
        scan.close();
    }
    
}

import java.util.Scanner;

public class Sreverse {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            int s = i*i;
            int r = 0;
            while( s > 0){
                int ld = s % 10;
                r = ( r * 10 ) + ld;
                s /= 10;
            }
            System.out.println(r);
        }
        scan.close();
    }    
}
    


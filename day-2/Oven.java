import java.util.*;

public class Oven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int t = scan.nextInt();
        if (i == 1 ){
            System.out.println(t);
        }else if ( i == 2 ){
            System.out.println(t + (t * 0.50));
        }else if ( i == 3 ){
            System.out.println(t * 2);
        }else{
            System.out.println("Number items is more ");
        }
        scan.close();
    }
    
}

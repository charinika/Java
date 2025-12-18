import java.util.*;

public class Boat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int a = scan.nextInt();
        int c = scan.nextInt();
        int tw = ((a*75)+(c*50));
        if(tw <= b){
            System.out.println("Boat is stable");
        } else {
            System.out.println("Boat will drowmn");
        }
        scan.close();
    }
}

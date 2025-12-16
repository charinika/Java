import java.util.Scanner;

public class Midpoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1=scanner.nextInt();
        int x2=scanner.nextInt();
        int y1=scanner.nextInt();
        int y2=scanner.nextInt();
        double d1=Math.abs((x1+x2)/2);
        double d2=Math.abs((y1+y2)/2);
        System.out.println(d1+" "+d2);
    }
     
}

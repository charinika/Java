import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int last = n%10;
        int first = n/1000;
        System.out.println(first + last);

    }
}
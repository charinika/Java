import java.util.*;
public class Teamsplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int s = scan.nextInt();
        int n = Math.round(t / s);
        int r = t % s;
        System.err.println("The number of students in each team is " + n + " and the number of students left out is " + r);
        scan.close();
    }
}

import java.util.Scanner;
public class Numbersquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 4;
		int square = 1;
        int n2 = scanner.nextInt();
		for(int i=1; i<=n2;i++) {
			System.out.print(n+" ");
			n = n + (square*square);
			square++;
		}
        scanner.close();
	}

}

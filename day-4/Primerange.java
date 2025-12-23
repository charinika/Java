import java.util.Scanner;

public class Primerange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter lower range:");
		int lowervalue = scanner.nextInt();
		System.out.println("Enter Highest range:");
		int highervalue = scanner.nextInt();
		int factor = 0;
		for(int i=lowervalue;i<=highervalue;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					factor+=1;
				}
			}
			if(factor==2) {
				System.out.print(i+" ");
			}
			factor=0;
		}
        scanner.close();

	}

}

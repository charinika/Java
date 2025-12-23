
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Item1 rate: ");
		float rate1 = scanner.nextFloat();
		System.out.println("Item2 rate: ");
		float rate2 = scanner.nextFloat();
		System.out.println("Discount:");
		float discount = scanner.nextFloat();
		float totalamount = rate1+ rate2;
		float discount1 = (discount/100) * totalamount; 
		float discountamount = totalamount - discount1;
		float difference = discount1;
		System.out.println(totalamount);
		System.out.println(discountamount);
		System.out.println(difference);
        scanner.close();
	}

} 
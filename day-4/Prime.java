import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        if(n<=1)
            System.out.println("Not Prime Number");
            
        for(int i=1; i<=n; i++){
            if (n%i==0){
                count++;
            }
        }

        if (count ==2 )
                System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
        scan.close();
    }
    
}

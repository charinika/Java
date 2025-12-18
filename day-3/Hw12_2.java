import java.util.Scanner;

public class Hw12_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        if(n==1){
            System.out.println("0");

        }
        else if (n>1) {
            while(n>1){
                
                fact=fact*n;
                n--;
                
            }
            
        }
        System.out.println(fact);
        sc.close();
    }
}
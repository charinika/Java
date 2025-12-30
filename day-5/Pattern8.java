import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=(n-1)*1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (j ==i+1){
                    System.out.print(" * ");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println("  ");    
        }
        scan.close();

    }
    
}

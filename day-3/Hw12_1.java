import java.util.Scanner;
public class Hw12_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count1=0;
        int count2=0;
        for(int i=1;i<=n1;i++){
            if(n1%i==0){
                count1+=i;
            }
        }
        for(int j=1;j<=n2;j++){
            if(n2%j==0){
                count2+=j;
            }
        }
        if((count1/n1)==(count2/n2)){
            System.out.print("they are friendly number");
        }
        else{
            System.out.print("they are not friendly number");
        }
        sc.close();
    }
}

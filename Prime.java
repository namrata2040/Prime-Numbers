import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            if(n==1){
                System.out.println("Neither Prime nor Composite");
            }else{
                System.out.println("The number is a Prime number");
            }
        }else{
            System.out.println("The number entered is not a Prime number");
        }
    }
}

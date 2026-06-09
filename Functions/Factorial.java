package Functions;
import java.util.Scanner;
public class Factorial {
    public static void printFactorial(int n)
    {
        if(n<0)
        {
            System.out.println("Invaid interval!:");
            return;
        }
        int fact=1;
        for(int i=1;i<=n;i++)
        {
          fact=fact*i;
        }
        System.out.print("factorial is:"+fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        printFactorial(n);
    }
}

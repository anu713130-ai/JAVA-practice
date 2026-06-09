package Functions;
import java.util.Scanner;
public class Sumofoddno {
    public static void printSumofodd(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
             sum=sum+i;
            }
        }
         System.out.println("Sum is:"+sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        printSumofodd(n);
    }
}

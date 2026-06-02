package Basic;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("Factorial is not defined for negative numbers and 0");
        } 
        else
        {
            int fact=1;
        for(int i=1;i<=n;i++)
        {
           fact=fact*i;
        }
        System.out.println("Factorial is:"+fact);
    }
}
}

package NumberbasedQ;
import java.util.Scanner;
public class Armstrongno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0)
        {
            int digit=temp%10;
            sum=sum+(digit*digit*digit);
            temp=temp/10;
        }
        if(num==sum)
        {
            System.out.println(num+" is a Armstrong number.");
        }
        else
        {
           System.out.println(num+" is not a Armstrong number.");
        }
    }
}

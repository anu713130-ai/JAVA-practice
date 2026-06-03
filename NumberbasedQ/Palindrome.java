package NumberbasedQ;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int rev=0;
        int temp=num;
        while(temp!=0)
        {
          int digit=temp%10;
          rev=rev*10+digit;
          temp=temp/10;
        }
       if(num==rev)
       {
        System.out.println(num+" is palindrome:");
       }
       else
       {
        System.out.println(num+" is not palindrome:");
       }
    }
}

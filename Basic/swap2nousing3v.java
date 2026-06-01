package Basic;
import java.util.Scanner;
public class swap2nousing3v {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping the value of a is:"+a);
        System.out.println("After swapping the value of b is:"+b);
    }
}

package Basic;
import java.util.Scanner;
public class swap2nowithout3v {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping the value of a is:"+a);
        System.out.println("After swapping the value of b is:"+b);
    }
}

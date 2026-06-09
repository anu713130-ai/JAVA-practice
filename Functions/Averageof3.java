package Functions;
import java.util.Scanner;
public class Averageof3 {
    public static void printAvg(int a,int b,int c)
    {
        double average=(a+b+c)/3;
        System.out.println("Average is:"+average);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        System.out.println("enter the value of c:");
        int c=sc.nextInt();
        printAvg(a,b,c);
    }
}

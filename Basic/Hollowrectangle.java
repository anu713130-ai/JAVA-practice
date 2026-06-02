package Basic;
import java.util.Scanner;
public class Hollowrectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of r:");
        int r=sc.nextInt();
        System.out.println("enter the number of c:");
        int c=sc.nextInt();
        System.out.println("Hollow rectanglepattern is:");
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==1||j==1||i==r||j==c)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

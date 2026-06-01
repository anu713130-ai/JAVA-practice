package Basic;
import java.util.Scanner;
public class Solidrectanglepattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of r:");
        int r=sc.nextInt();
        System.out.println("enter the number of c:");
        int c=sc.nextInt();
        System.out.println("Solid rectanglepattern is:");
        for(int i=1;i<=r;i++)
        {
            for(int j=0;j<=c;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

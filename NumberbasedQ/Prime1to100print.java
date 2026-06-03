package NumberbasedQ;
import java.util.Scanner;
public class Prime1to100print {
    public static void main(String[] args) {
        int num;
        for(num=2;num<=100;num++)
        {
        boolean isprime=true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
            isprime=false;
            break;
            }
        }
        if(isprime)
        {
         System.out.println(num+" is prime");
        }
    }
    }
}


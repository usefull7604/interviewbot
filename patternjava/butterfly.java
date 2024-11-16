import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int p=1;p<=2*(num-i);p++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("*");
           }
           System.out.println();
        }
        for(int t=num-1;t>=1;t--)
        {
            for(int j=1;j<=t;j++)
            {
                System.out.print("*");
            }
            for(int p=1;p<=2*(num-t);p++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=t;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
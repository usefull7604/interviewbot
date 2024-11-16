import java .util.*;
public class B
{
    public static void main(String args [])
    {
       Scanner sc=new Scanner(System.in); 
       System.out.println("enter a number");
       int num=sc.nextInt();
       int a=0;
       for(int i=1;i<=num;i++)
       {
           for(int j=1;j<=a;j++)
           {
               System.out.print(" ");
           }
           for(int k=num;k>=i;k--)
           {
               System.out.print("*");
           }
           System.out.println();
           a++;
       }
    }
}
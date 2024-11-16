import java.util.*;
public class A {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int num=sc.nextInt();
     
      for(int i=1;i<=num;i++)
      {
          for(int j=num;j>=i;j--)
          {
              System.out.print(" ");
          }
          for(int k=1;k<=i;k++)
          {
              System.out.print("*");
          }
          for(int l=2;l<=i;l++)
          {
              System.out.print("*");
          }
          System.out.println();
      }
     for(int p=1;p<=num;p++)
     {
         for(int j=1;j<=p;j++)
         {
             System.out.print(" ");
         }
         for(int j=num;j>=p;j--)
         {
             System.out.print("*");
         }
          for(int k=num-1;k>=p;k--)
         {
             System.out.print("*");
         }
       
         System.out.println();
     }
    }}
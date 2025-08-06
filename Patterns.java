import java.util.Scanner;
class Main
{
public static void main(String args[])
{
 System.out.println("Enter a Positive Number");
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 for(int a=1;a<=n;a++)
{
 for(int b=1;b<=a;b++)
  System.out.print("* ");
   System.out.println();
}
}
}
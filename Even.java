import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  System.out.println("Enter a positive number");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  
  for(int i=2;i<=n;i=i+2)
  System.out.println(i); 
  System.out.println("These are the even numbers upto "+n);
}
}
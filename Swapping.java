import java.util.Scanner;
class Main
{
public static void main(String args[])
{
int c;
Scanner sc=new Scanner(System.in);
System.out.print("Enter A value ");
int A=sc.nextInt();
System.out.print("Enter B value ");
int B=sc.nextInt();
System.out.println("Before Swapping");
System.out.println("A="+A+" and "+"B="+B);
c=A;
A=B;
B=c;
System.out.println("After Swapping");
System.out.println("A="+A+" and "+"B="+B);
}
}
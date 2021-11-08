import java.util.Scanner;
class add{
public static void main(String[] args){
Scanner ka=new Scanner (System.in);
System.out .println("enter the two integers:");
int a=ka.nextInt();
int b=ka.nextInt();
int sum=a+b;
int diff=a-b;
int product=a*b;
int quotient=a%b;
int remainder=a/b;
System.out.println("sum of the numbers:"+ sum);
System.out.println("diff of the numbers:"+ diff);
System.out.println("product of the numbers:"+ product);
System.out.println("quotient of the numbers:"+ quotient);
System.out.println("remainder of the numbers:"+ remainder);
}
}



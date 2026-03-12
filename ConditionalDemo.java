// Program to demonstrate Conditional statement 
import java.util.Scanner;
public class ConditionalDemo
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter your marks:");
	 int marks=sc.nextInt();
	 if(marks>=90){
	 System.out.println("First Class");
	 }
	 else if(marks>=75)
	 {
	 System.out.println("Second class");
	 }
	 else if(marks>=45)
	 {
	 System.out.println("Third class");
	 }
	 else{
	 System.out.println("Fail");
	 }

	 sc.close();
	 
	}
}
//program to demonstrate input and output
import java.util.Scanner;
public class IODemo
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your FirstName: ");
	String Fname=sc.nextLine();
	System.out.print("Enter your LastName: ");
	String Lname=sc.nextLine();
	System.out.print("Enter your age: ");
	int age=sc.nextInt();
	System.out.print("Enter your Course: ");
	String Course=sc.nextLine();

	System.out.println("you have entered your Firstname:"+Fname);
	System.out.println("you have entered your Lnamename:"+Lname);
	System.out.println("you have entered your Age:"+age);
	System.out.println("you have entered you course:"+Course);
}
}
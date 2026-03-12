// program to demonstrate student details
import java.util.Scanner;
public class StudentDetails
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter student name: ");
	String name=sc.nextLine();
	
	System.out.print("Enter Student age: ");
	int age=sc.nextInt();
	sc.nextLine();
	
	System.out.print("Enter Student grade: ");
	char grade=sc.next().charAt(0);

	
	System.out.print("Enter Student marks: ");
	double marks=sc.nextDouble();
	
	System.out.print("Enter Student is passed: ");
	Boolean passed=sc.nextBoolean();

	System.out.println("you have entered the student name:"+name);
	System.out.println("you have entered the student age:"+age);
	System.out.println("you have entered the student grade:"+grade);
	System.out.println("you have entered the student marks:"+marks);
	System.out.println("you have entered the student passed:"+passed);

	sc.close();

	}
}
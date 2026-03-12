// Relational Operator

import java.util.Scanner;
class ANDOperator{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your age: ");
	int age=sc.nextInt();
	
	if(age>=18 && age<60)
	{
	System.out.println("you are Eligible for vote");
	}else{
	System.out.println("you are  Not Eligible for vote");
	}

	
	}
} 
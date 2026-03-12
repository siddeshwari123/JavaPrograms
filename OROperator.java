//
import java.util.Scanner;

public class OROperator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        if(marks > 80)
        {
            System.out.println("First Class");
        }
        else if(marks > 40 || marks == 40)
        {
            System.out.println("Second Class");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
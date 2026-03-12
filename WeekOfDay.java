// DayOfWeek 
import java.util.Scanner;
public class WeekOfDay
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter day: ");
	int day=sc.nextInt();
	String DayName;
	switch(day)
	{
	case 1:
	  DayName="Monday";
	  break;
	case 2:
	  DayName="Tuesday";
	  break;
	case 3:
	  DayName="Wednesday";
	  break;
	case 4:
	  DayName="Thursday";
	  break;
	case 5:
	  DayName="Friday";
	  break;
	case 6:
	  DayName="saturday";
	  break;
	case 7:
	  DayName="Sunday";
	  break;
	
	default:
	  DayName="Invalid Day";
	  break;

	}

	System.out.println("Day:" + DayName);

	
	}
}
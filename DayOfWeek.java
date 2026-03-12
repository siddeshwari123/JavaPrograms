import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = sc.nextLine();

        String DayName;

        switch(day) {
            case "Monday":
                DayName = "Day 1 of the Week";
                break;

            case "Tuesday":
                DayName = "Day 2 of the Week";
                break;

            case "Wednesday":
                DayName = "Day 3 of the Week";
                break;

            default:
                DayName = "Invalid Day";
        }

        System.out.println(DayName);
    }
}
	

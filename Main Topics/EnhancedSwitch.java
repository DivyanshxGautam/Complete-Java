import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else if statements
        //                   (Java14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.next().toUpperCase();

        switch(day){
            case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY" ->
                    System.out.println("It is a weekday 😫");

            case "SATURDAY","SUNDAY" ->
                    System.out.println("It is a weekend 😄");
            default -> System.out.println(day + " is not a day");

        }
        scanner.close();
    }
}

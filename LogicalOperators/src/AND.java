import java.util.Scanner;

public class AND {
        public static void main(String[] args) {
            // && = AND
            // || = OR
            // !  = NOT
            Scanner scanner = new Scanner(System.in);

            double temp;
            boolean isSunny = true;

            System.out.println("Enter the temp (in Celsius): ");
            temp = scanner.nextDouble();

            if(temp<=30 && temp>=0 && isSunny){
                System.out.println("The weather is GOOD 😄");
                System.out.println("It is SUNNY outside ☀️");
            }
            else if(temp<=30 && temp>=0 && !isSunny){
                System.out.println("The weather is GOOD 😄");
                System.out.println("It is CLOUDY outside ☁️");
            } else if (temp > 30 || temp < 0) {
                System.out.println("The weather is bad 👎");
            }
            scanner.close();
        }
    }



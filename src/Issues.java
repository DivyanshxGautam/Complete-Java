import java.util.Scanner;

public class Issues {
    public static void main(String[] args){
        // COMMON ISSUES

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();


        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are "+ age + " years old");
        System.out.println("You like the color " + color);

        scanner.close();
    }
}

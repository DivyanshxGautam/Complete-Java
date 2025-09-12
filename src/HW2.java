import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        double length = 0;
        double width = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        length = scanner.nextDouble();

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        area = length * width;

        System.out.print("The area is: " + area + "cm^2");

        scanner.close();
    }
}

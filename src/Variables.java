public class Variables {
    public static void main(String[] args){
        //  variable = a reusable container for a value
        //             a variable behaves as if it was the value it contains

        //  Primitive = simple value stored direct;y in memory (stack)
        //  Reference = memory address (stack) that points to the (heap)

        //  Primitive   vs  Reference
        //  ---------       ---------
        //  int             string
        //  double          array
        //  char            object
        //  boolean

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment

        int age = 20;
        int year = 2025;

        double price = 19;
        double gpa = 3.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Divyansh";
        String food = "Pizza";
        String car = "Hellcat";


        System.out.println("My name is "+ name);
        System.out.println("Your favourite food is "+ food);
        System.out.println("The best car to ever exist is probably "+ car + " up for sale"+ " " + year + " edition");


        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are NOT a student!");
        }
    }
}

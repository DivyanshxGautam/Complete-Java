public class printf {
    public static void main(String[] args) {
        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

        //[flags]
        // += output a plus
        // ,= comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive


        //[width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding


        String name = "Larry";
        char firstLetter = 'L';
        int age = 22;
        double height = 60.4;
        double price = 100.154;
        double balance = -1000000;
        boolean isEmployed = true;

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;


        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.1f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.printf("You bought this for %.2f??\n",price);
        System.out.printf("%s is %d years old\n", name, age);
        System.out.printf("How tf is your balance %,.2f\n",balance);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);


    }
}

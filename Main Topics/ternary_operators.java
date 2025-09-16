public class ternary_operators {
    public static void main(String[] args) {
        // ternary operator ? = Return 1 of 2 values if a condition is true

        //variable = (condition) ? ifTrue : ifFalse;

        //int score = 55;
        //int number = 12;
        //int hours = 12;

        int income = 300000;

        double taxRate = (income >= 400000) ? 5 : 0;


        System.out.println(taxRate);
    }
}

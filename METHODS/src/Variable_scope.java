// variable scope = where a variable can be accessed
public class Variable_scope {

    static int x = 3; //CLASS VARIABLE

    public static void main(String[] args) {

        int x = 1; //LOCAL VARIABLE

        System.out.println(x);
        doSomething();

    }
    static void doSomething(){
        int x = 2; // LOCAL
        System.out.println(x);
    }
}

public class Constructors {
    static void main() {
        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        Student student1 = new Student("Future",41,3.2);
        Student student2 = new Student("Patrick",34,1.5);
        Student student3 = new Student("Sandy",27,4.0);

       student1.study();
       student2.study();
       student3.study();

    }
}

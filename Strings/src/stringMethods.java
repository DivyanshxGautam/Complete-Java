public class stringMethods {
    public static void main(String[] args) {

        String name = "Password";

//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf(" ");
//        int lastIndex = name.lastIndexOf(" ");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("G","k");
        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello "+ name);
        }


        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name doesn't contain any spaces");
        }
        */

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello "+ name);
        }
    }
}

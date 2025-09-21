public class TwoD_arrays {
    public static void main(String[] args) {
        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data


        String[][] groceries = {{"apple","orange","banana"},
                                {"potato","onion","carrot","broccoli"},
                                {"chicken","pork","fish"}};

        groceries[2][1] = "eggs";
        for(String[] foods: groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}

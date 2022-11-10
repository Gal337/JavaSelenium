import java.util.ArrayList;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {

        // IF-Else conditions *****************************************************************************************
        int[] arr2 = {1,2,4,5,6,7,8,9,10,122};

        // Getting specific values with IF conditional statement (multiplied by 2)
        for (int i=0; i < arr2.length; i++){
            if (arr2[i] % 2 == 0){
                System.out.println(arr2[i]);
                break; // stops FOR loop once the first condition is fulfilled
            }
            else {
                System.out.println(arr2[i] + " is not multiple of 2.");
            }
        }

        // Arraylist and arrays ***************************************************************************************
        ArrayList a = new ArrayList <String>(); // ArrayList is class, while a is the object of the class
        a.add("Gal");
        a.add("Sesek");
        a.add("Selenium");
        a.add("Training");
        //a.remove(3); // removes value from specific index
        System.out.println(a.get(2)); // get value from specific index

    }
}

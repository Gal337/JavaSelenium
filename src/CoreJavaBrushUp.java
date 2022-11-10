public class CoreJavaBrushUp {
    public static void main(String[] args) {
        // Variables and variable types *******************************************************************************
        int myNum = 5;
        String website = "Learn Selenium automation";
        char letter = 'g';
        double decimal = 5.44;
        boolean myTime = true;

        // Arrays *****************************************************************************************************
        int[] array = new int[5]; // syntax that will hold 5 integer numbers
        array[0] = 1; // we assigned number 1 to index 0
        array[1] = 2; // we assigned number 2 to index 1
        array[2] = 7;
        array[3] = 4;
        array[4] = 5;

        int[] array2 = {1,2,7,4,5,230,12,420,124}; // directly assigning values to indexes
        System.out.println(array2[2]); // retrieving value saved in index 2

        // FOR loop ***************************************************************************************************
        for (int i=0; i < array.length; i++) { // going through values in array
            System.out.println(array[i]); // printing values from array in order
        }

        for (int i=0; i < array2.length; i++){
            System.out.println(array2[i]);
        }

        String[] name = {"Gal","Sesek","Selenium"};
        for (int i=0; i < name.length; i++){
            System.out.println(name[i]);
        }

        for (String s: name){ //enhanced FOR loop
            System.out.println(s);
        }


    }
}

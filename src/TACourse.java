import java.sql.Array;

public class TACourse {

    //Methods
    public static void main(String[] args) {
//        =========
//        Variables
//        =========
        int a = 5;
        int b = 5;
        int c = 2 + a++; //a+=1 -> a=a+1; c=7; a=6
        int d = 2 + ++b; // b+=1 -> b=b+1; b=6; d=8

//        Days day = Days.MONDAY;

        a--; // a=a-1
        --a; // a=a-1
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        boolean b1 = true;
        boolean b2 = false;
        boolean result = !b1;
//        ===============
//        Casting Example
//        ===============
        double a = 5.4;
        int b = (int) a;
        System.out.println("Value A is: " + a);
        System.out.println("Value B is: " + b);
//        ==========
//        Autoboxing
//        ==========
        int numA1 = 5;
        Integer numA2 = numA1;
        System.out.println("Autoboxing: " + numA2);
//        ========
//        Unboxing
//        ========
        Integer numB1 = new Integer("06");
        int numB2 = numB1;
        System.out.println("Unboxing: " + numB2);
//        =======
//        Strings
//        =======
        String text1 = "This is first string!";
        System.out.println("String: " + text1);
        text1 = "This is new text!";
        System.out.println("String: " + text1);
        String text2 = "This is first string!";
        System.out.println("String: " + text2);
        text1 = "This is not the first string anymore";
        text1 = text1.toLowerCase();

//        ======
//        Arrays
//        ======
        int[] intArray = {4,10,-3,6};
        System.out.println("Third element of Array is: " + intArray[2]);
        intArray[2] = -7;
        System.out.println("Third element of Array is: " + intArray[2]);

        int[] intArray2 = new int[5];

        String[] stringArray = {"one", "two", "three"};
        String[] stringArray2 = new String[5];
        stringArray2[2] = "Text text";
        System.out.println("Number of elements of stringArray2: " + stringArray2.length);
        System.out.println("Values are: " + stringArray2.toString());

        int[][] twoDimensionalArray = new int[3][4];

//        ================================================
//        Calling method from another class in main method
//        ================================================
//        MySecondClass msc = new MySecondClass();
//        int result1 = msc.addTwoNumbers(-3,10);
//        System.out.println(result1);
//        int result2 = msc.addTwoNumbers(2,12);
//        System.out.println(result2);

    }

//    public int addTwoNumbers(int x, int y){
//        int result = x + y;
//        return result;
//    }

}

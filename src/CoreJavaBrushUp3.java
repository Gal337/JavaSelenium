public class CoreJavaBrushUp3 {
    public static void main(String[] args) {
        // String is an object that represents sequence of characters - String literal
        String g = "Gal Sesek";
        String g1 = "Gal Sesek"; // g1 points to value g in memory, because same object already exists (g)


        // new object in memory
        String h = new String("Hello"); //new object is created
        String h2 = new String("Hello"); // new object is created

        String s = "Gal Sesek Selenium Course";
        String []  splittedString = s.split("Sesek");
//        for (String s1 : splittedString) {
//            System.out.println(s1);
//        }
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[1].trim());
        for (int i = 0; i < s.length();i++) {
            System.out.println(s.charAt(i)); // prints each character in new line
        }

        for (int i = s.length()-1; i<s.length();i--) { // FOR loop going from back to front
            System.out.println(s.charAt(i));
        }
    }
}

public class Methods {
    public static void main(String[] args) {
        Methods g = new Methods();
        String name = g.getData();
        System.out.println(name); // prints everything (every line)

        Methods2 g1 = new Methods2();
        g1.getData(); // prints value without return line

        getData2();
    }

    // Methods are created outside the main method and called inside main method!! ************************************
    public String getData() {
        System.out.println("Hello");
        return "Gal";
    }

    public static String getData2() { // if method is marked as static it belongs to specific class, Methods in this case
        System.out.println("Hello");
        return "Gal";
    }


}

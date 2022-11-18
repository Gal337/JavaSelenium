import java.util.ArrayList;
import java.util.List;

public class JavaStreams {
    public static void main(String[] args) {
//        Creating array list object
        List<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Abu");
        names.add("Alekhya");
        names.add("Ram");
        int count = 0;
//        Iterate through names with for loop
        for (int i = 0; i < names.size(); i++) {
//            Getting all the names from the list
            String name = names.get(i);
//            Compare if string starts with letter "A"
            if (name.startsWith("A")) {
                count++;
            }
        }
        System.out.println(count);



    }
}

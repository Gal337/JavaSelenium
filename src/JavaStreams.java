import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreams {

    @Test
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

    @Test
    public void streamFilter(){
        List<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Abu");
        names.add("Alekhya");
        names.add("Ram");
//        Converting existing array list into stream and iterating through list
        long c = names.stream().filter(n->n.startsWith("A")).count();
        System.out.println(c);
//        Instead of having a list of names, you can also directly put names for values and counting them
        long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(n->
        {
            n.startsWith("A");
            return true;
        }).count();
        System.out.println(d);

//        Printing all the names of array that are longer than 4 characters
        names.stream().filter(n -> n.length()>4).forEach(n -> System.out.println(n));
//        Printing 1 name that is longer than 4 characters
        names.stream().filter(n -> n.length()>4).limit(1).forEach(n -> System.out.println(n));
    }
    }


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
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

    @Test
    public void streamMap() {
//        Printing names with last character being m and converting the names to upper case
        Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(n -> n.endsWith("m")).map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));

//        Printing the names which start with character a with uppercase and sorting them
        List<String> names = Arrays.asList("Abhijeet", "Don", "Alekhya", "Adam", "Ram");
        names.stream().filter(n -> n.startsWith("A")).sorted().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));

//        Merging 2 lists into one
        List<String> names1 = new ArrayList<String>();
        names1.add("Man");
        names1.add("Don");
        names1.add("Woman");

        List<String> names2 = Arrays.asList("Abhijeet", "Don", "Alekhya", "Adam", "Ram");
//        Merging 2 lists into one
        Stream<String> newStream = Stream.concat(names1.stream(), names2.stream());
//        Sorting the names on the list by alphabet
//        newStream.sorted().forEach(n -> System.out.println(n));
        boolean flag = newStream.anyMatch(n -> n.equalsIgnoreCase("Adam"));
        System.out.println(flag);
        Assert.assertTrue(flag);
    }

    @Test
    public void streamCollect() {
//        Creating a list upon all the modifications created previously
        List<String> ls = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(n -> n.endsWith("a")).map(n -> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(ls.get(0));

//        Creating a list of numbers
        List<Integer> values = Arrays.asList(3,2,2,5,6,1,9,6);
//        Printing unique numbers from array
        values.stream().distinct().forEach(n -> System.out.println(n));
//        Printing number on specific index after sorting the numbers
        List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li.get(2));
    }



    }


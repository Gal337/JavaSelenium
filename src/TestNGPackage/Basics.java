package TestNGPackage;

import org.testng.annotations.Test;

public class Basics {

    @Test
//    Method that follows @Test annotation will be treated as test case by TestNG
    public void FirstTest() {
        System.out.println("Hello, this is my first test");
    }

    @Test
    public void SecondTest() {
        System.out.println("Bye");
    }
}

//    @Test
//    public void WebLogin () {
//        //Write Selenium code here
//    }
//
//    @Test
//    public void LoginAPI() {
//        //Write REST API code here
//    }

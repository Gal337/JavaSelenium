import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ECommerceApplication {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String link = "https://rahulshettyacademy.com/seleniumPractise/";
//        Declaring global IMPLICIT WAIT to solve the problem with promo code text box element
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        Declaring EXPLICIT WAIT and passing 2 arguments to it (object and time to wait)
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
//        Assigning array variable for elements we want to add to cart
        String[] itemsNeeded = {"Cucumber", "Brinjal", "Corn", "Tomato"};
        driver.manage().window().maximize();
        driver.get(link);
//        Implementing sleep so the webpage can load and items become visible
        Thread.sleep(3000);
//        Created another STATIC method from which test script is being called
        addItems(driver,itemsNeeded);
//        Before accessing the method, object for the class needs to be created first
//        ECommerceApplication e = new ECommerceApplication();
//        e.addItems(driver,itemsNeeded);
//        Clicking on cart
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
//        Proceeding to checkout
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//        Selecting promo code text box with CSS selector and entering promo code
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
//        Waiting until the element is visible
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//        Returning the text in console after entering the promo code and applying it
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

    }

//    Creating static method allows the access to that method in main code block without creating an object for class
    public static void addItems(WebDriver driver, String[] itemsNeeded) {
//        Variable j is declared to stop the for loop once we add desired items to cart
        int j = 0;
//        Because all elements have the same class name, we create a list, so we can iterate to get the desired item
//        We use -findElements- because we are saving all items to a list / CSS selector: tagName.value
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
//        FOR loop for iterating through the list of web elements
        for (int i = 0; i < products.size(); i++) {
//            We assign a variable so we get index of each element
//            We need to format the name of the product to match the names in our array with .split()
            String[] name = products.get(i).getText().split("-");
//            Now we need to trim the whitespaces
            String formattedName = name[0].trim();
//            Check wether name we extracted is present in arrayList or not; for that we need to also convert array into array list for easy search
            List itemsList = Arrays.asList(itemsNeeded);
//            IF sentence to get the desired item we are looking for
            if (itemsList.contains(formattedName)) {
                j++;
//                Once the item is found we add it to cart
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
//                Code came in this block 3 times, meaning all 3 items are successfully added and we can stop the loop
//                Making the IF sentence dynamic so it adjusts to the array
                if (j == itemsNeeded.length)
                    break;
            }
        }
    }
}



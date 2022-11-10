import org.openqa.selenium.*;
import org.testng.Assert;
import graphql.relay.Edge;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Cookie;
import java.time.Duration;
import java.util.List;
import java.util.Set;


public class AutomatingWebElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\Program Files\\Java\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        String link = "https://www.spicejet.com";
        String link2 = "https://www.airindia.in/";
        String link3 = "https://rahulshettyacademy.com/dropdownsPractise/";
        String link4 = "https://www.airindia.in/";
        String link5 = "https://www.aerlingus.com/html/en-IE/home.html";
        driver.manage().window().maximize();

//        Automating STATIC DROPDOWN menu EXAMPLE - 2nd webpage:
//        driver.get(link2)
//        Select s = new Select(driver.findElement(By.id("ddladult1")));
//       s. selectByValue("2");
//        s.selectByIndex(6);
//        s.selectByVisibleText("5 Adults");

//        Automating DYNAMIC DROPDOWN menu EXAMPLE - 1st webpage:
//        driver.get(link);
//        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]")).click();

//      WHILE LOOP
//        int i = 1;
//        while (i<3) { // Adds 2 passengers (3 all together, 1 is by default and it adds 2 more)
//            driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
//            i++;
//        }

//      FOR LOOP
//        for (int i = 0; i < 2; i++) {
//            driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
//        }
//        driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();
        ////      Getting the final value from Passengers dropdown box
//        System.out.println(driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]")).getText());
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[5]/div[2]/div/div[2]")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div/div[3]")).click();
//        System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[5]/div[2]/div/div[2]")).getText());
//        driver.findElement(By.xpath("//*[@autocapitalize='sentences']")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[7]")).click();
////        Command to select the 2nd dropdown menu (To:):
//        driver.findElement(By.xpath("(//*[@autocapitalize='sentences'])[2]")).click();
////        Sleep is implemented so the next element can load and be detected
//        Thread.sleep(2000L);
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[11]")).click();


//        Automating Auto-Suggestive DROPDOWN menu EXAMPLE - 3rd webpage:
//        driver.get(link3);
//        driver.findElement(By.id("autosuggest")).sendKeys("au");
//        Thread.sleep(3000);
//       Variable to save all elements from the list (dropdown menu) + command:
//        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//        Each time we iterate options variable (list of web elements), value will get stored in variable option and once the result matches our search parameter, that parameter is picked
//        for (WebElement option : options) {
//            if (option.getText().equalsIgnoreCase("Palau")) {
//              option.click();
//              break;
//            }
//        }

//        Automating selection of Radio Button and returning if correct element is selected EXAMPLE - 3rd webpage:
//        driver.get(link3);
//        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();
//        System.out.println(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
//        System.out.println(driver.findElement(By.cssSelector("input[id*='chk_StudentDiscount']")).isSelected());
//        driver.findElement(By.cssSelector("input[id*='chk_StudentDiscount']")).click();
//        System.out.println(driver.findElement(By.cssSelector("input[id*='chk_StudentDiscount']")).isSelected());
//        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='chk_StudentDiscount']")).isSelected());
//        Counting ALL the elements of the same selector type and returning the number of those elements in console
//        driver.findElements(By.cssSelector("input[type='checkbox']")).size();
//        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

//       ASSERTION in automation testing EXAMPLE - we compare 2 arguments; the chosen value to actual value and return it in console:
//        System.out.println(driver.findElement(By.id("divpaxinfo").getText()));
//        for (int i = 1; i < 5; i++) {
//            driver.findElement(By.id("hrefIncAdt")).click();
//        }
//        driver.findElement(By.id("btnclosepaxoption")).click();
//        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
//        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

//        Choosing an option from auto-suggestive dropdown menu example - 5th webpage:
        driver.get(link2);
        WebElement from = driver.findElement(By.id("from"));
        WebElement to =  driver.findElement(By.id("to"));
        from.clear();
        from.sendKeys("Dub");
        Thread.sleep(1000);
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);
        to.sendKeys("Can");
        Thread.sleep(1000);
        for (int i = 0; i < 3; i++){
            to.sendKeys(Keys.ARROW_DOWN);
        }
        to.sendKeys(Keys.ENTER);


        }


    }

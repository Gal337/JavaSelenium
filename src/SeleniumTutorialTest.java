import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

/*
!!NOTES!!
-Every object may not have ID, className or name - XPath and CSS locators are preferred
-Alpha numeric id may vary on every refresh - check before using id for locator in this case
-Confirm the link object with anchor "a" tag
-className should not have spaces, if it has spaces you can't use className - Compound classes cannot be accepted
-Selenium ALWAYS identifies the first field, even if there are more same fields, it will use the first it finds
-Selenium scans for fields from top left to bottom right
-Double quotes inside double quotes are not accepted - Xpath double quotes need to be changed to single quotes
-Xpath can be defined in n ways
-Define Xpath for parent / tagNames - inspect webpage / HTML code
-Right-click on highlighted HTML code and copy the code to generate Xpath

-Relative Xpath is PREFERABLE WAY and does not depend on parent node (tagName): //tagName[attribute='value']
-custom Xpath based on HTML code: //tagName[@attribute='value']; example: //input[@value='Log In']
-custom Xpath based on HTML code: //*[@attribute='value']; * looks for ANY tagName with specified attribute and value
-Absolute Xpath depends on parent-child nodes (tagName) / path; example: //section/div/div/div/ul/li
-Parent to child Xpath code: example (browser console): $x("//div[@class='RNNXgb']/div/div[2]/input")
-Traverse to sibling element using Xpath code:
//*[@id='tablist1-tab1']/following-sibling::child tagName[2]
-Traversing back to parent element from child element using Xpath code:
//*[@attribute of child tagName='value of child tagName']/parent::[parent tagName]
example: //*[@id='tablist1-tab1']/parent::ul
-Writing Xpath with only text being visible (no tagName), space needs to be included if there is space:
//*[text()=' value ']; example: //*[text()=' Selenium ']
-Regular / custom expression Xpath (if attribute value keeps changing partially):
//tagName[contains(@attribute,'value')]
-If multiple attributes have the same value, specify Xpath with index: (//*[@attribute='value'])[index]
example: (//*[@autocapitalize='sentences'])[2]
-Parent-child Xpath traverse: //tagName[@attribute='value'] //tagName[@attribute='value']

-If Xpath starts with html, it is not reliable locator. In this case use another browser to get Xpath
-There is no direct way to get CSS in Chrome. You can find it in tool bar
-To validate the Xpath locator u can write $x("//*[@id='forgot_password_link']") and enter it in browser console on
correct page to see if correct item gets highlighted
-To validate the CSS locator u can write $("//*[@id='forgot_password_link']") and enter it in browser console on correct
page to see if correct item gets highlighted


-Regular / custom expression CSS: tagName[attribute='value']; example: div[class='identity first']
-Custom expression for CSS code, if you don't want tagName mentioned: [attribute='value'];
example: [class='identity first']
-Custom CSS: tagName#value of attribute; example: input#password
-Custom CSS: #value of attribute; example: #password
-Custom CSS, if space is between class names it needs to be replaced with .: .classname; example: .input.identityinput
-Custom CSS selector to select all checkboxes example: input[type='checkbox']

-ASSERTIONS are for comparing arguments, best used in validations to see if the test passes or fails
-AssertEqual/s, assertTrue, assertFalse


 */




public class SeleniumTutorialTest {
    public static void main(String[] args) {
        // Setting system property for browser (Edge)
        System.setProperty("webdriver.edge.driver","C:\\Program Files\\Java\\edgedriver_win64\\msedgedriver.exe");
        // Setting system property for browser (Chrome)
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
        // Setting system property for browser (Firefox)
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
//        Maximize window
        driver.manage().window().maximize();
//        Example 1:
//        driver.get("https://www.facebook.com");
//        driver.findElement(By.cssSelector("[class='_42ft _4jy0 _9xo6 _4jy3 _4jy1 selected _51sy']")).click();
//        driver.findElement(By.id("email")).sendKeys("This is my first code");
//        driver.findElement(By.name("pass")).sendKeys("123456");
//        driver.findElement(By.linkText("Forgot password?")).click();
//        driver.findElement(By.name("login")).click();



//        Example 2:
        driver.get("https://login.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("Hello");
        driver.findElement(By.name("pw")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
//        driver.findElement(By.cssSelector("button r4 wide primary")).click(); //ERROR because className contains spaces
        driver.findElement(By.linkText("Forgot Your Password?")).click();
        driver.findElement(By.cssSelector("#username")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");




    }


}


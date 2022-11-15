import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

//public class HandlingHTTPSCertifications {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver-v0.32.0-win64\\geckodriver.exe");
//
////        Desired capabilities
//        DesiredCapabilities ff = DesiredCapabilities.firefox();
////        Accepts insecure certificates (2 ways of writing the command)
//        ff.acceptInsecureCerts();
////        ff.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
////        Accepts SSL certificates
//        ff.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//        FirefoxOptions o = new FirefoxOptions();
//        o.merge(ff);
//        WebDriver driver = new FirefoxDriver(ff);
//    }
//}

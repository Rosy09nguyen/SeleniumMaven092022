package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public static void createDriver() {
        //Khởi tạo browser với Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


        public static void sleep(int milisecond) {
            try {
                Thread.sleep(milisecond);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }


       // Đóng browser
        public static void closeDriver() {
        driver.quit();
    }



}

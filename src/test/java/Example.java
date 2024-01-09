// import ...
import io.github.bonigarcia.wdm.WebDriverManager;
import io.percy.selenium.Percy;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Example {
    private static WebDriver driver;
    private static Percy percy;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1:8080");
        percy = new Percy(driver);
        percy.snapshot("Java example");
    }
}

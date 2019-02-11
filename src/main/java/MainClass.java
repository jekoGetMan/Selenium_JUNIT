import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\someFiles\\Prg\\tstAuto\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://github.com");
        MainPage mainPage = new MainPage(driver);
//        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
//        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
//        signUpPage.regWithInvalidData("lol", "lol@gmail.com", "tstpass");
//        System.out.println(signUpPage.headingText());
        mainPage.register("testName", "tst@gmail.com", "tstpass");
//        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    }

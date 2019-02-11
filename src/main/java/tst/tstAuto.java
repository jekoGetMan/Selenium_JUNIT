//package tst;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import javax.xml.xpath.XPath;
//import java.util.concurrent.TimeUnit;
//
//public class tstAuto {
//
//    static WebDriver driver;
//
//    public static void main(String[] args){
//        System.setProperty("webdriver.chrome.driver", "C:\\someFiles\\Prg\\tstAuto\\driver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//
////        driver.get("https://rozetka.com.ua/");
////        driver.findElement(By.linkText("Бытовая техника")).click();
////        driver.findElement(By.xpath("//a[text()='Холодильники']")).click();
////        driver.findElement(By.xpath("//a[text()='Однокамерные']")).click();
//
////        driver.findElement(By.xpath("//li[@id='filter_producer_174']//label//a//span//i[text()='ATLANT']")).click();
//
//        driver.get("https://rozetka.com.ua/notebooks/c80004/filter/producer=apple/");
//
//        checkBoxes("Acer");
//
////        driver.quit();
//    }
//
//    public static void checkBoxes(String name){
//        String xpath = "//*[text()='%s']";
//        if(!driver.findElement(By.xpath(String.format(xpath, name))).isSelected()){
//            driver.findElement(By.xpath(String.format(xpath, name))).click();
//        }
//    }
//}
//

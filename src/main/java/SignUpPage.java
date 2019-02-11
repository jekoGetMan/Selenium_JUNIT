import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

    private WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }
    private By heading = By.xpath("//h1[text()='Join GitHub']");
    private By userNameField = By.xpath("//*[@id='user_login']");
    private By emailField = By.xpath("//*[@id='user_email']");
    private By passwordField = By.xpath("//*[@id='user_password']");
    private By signUpButton = By.xpath("//*[@id='signup_button']");
    private By mainError = By.xpath("//div[@class='flash flash-error my-3']");
    private By userNameError = By.xpath("//*[@id=\"signup-form\"]/auto-check[1]/dl/dd[2]");
    private By emailError = By.xpath("(//dd[@class='error'])[2]");
    private By passwordError = By.xpath("//*[@id='signup-form']/password-strength/dl/dd[2]");

    public SignUpPage typeUserName(String username){
        driver.findElement(userNameField).sendKeys(username);
        return this;
    }

    public SignUpPage typePassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public SignUpPage typeEmail(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage registerWithInvalidCreds(String username, String email, String password){
        this.typeUserName(username);
        this.typeEmail(email);
        this.typePassword(password);
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public String getHeadingText(){
        return driver.findElement(heading).getText();
    }

    public String getMainErrorText(){
        return driver.findElement(mainError).getText();
    }

    public String getUsernameErrorText(){
        return driver.findElement(userNameError).getText();
    }

    public String getPasswordErrorText(){
        return driver.findElement(passwordError).getText();
    }

    public String getEmailErrorText(){
        return driver.findElement(emailError).getText();
    }

}
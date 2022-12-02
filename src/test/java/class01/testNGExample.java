package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNGExample {

    public static WebDriver driver;
    // write down all the pre conditions for a test case
    @BeforeMethod
    public void SetupBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    //TEST1
    //goto syntax HRMS
    //enter the username and password, verify that you logged it
    //close the browser
    @Test
    public void LoginFunctionality() {
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        logIn.click();
    }
    //TEST2
    //goto syntax HRMS
    //verify the login button is there
    //close the browser
    @Test
    public void LoginBtnVerification(){
        WebElement logIn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        System.out.println(logIn.isDisplayed());
    }

}

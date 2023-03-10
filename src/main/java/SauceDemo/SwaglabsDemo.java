package SauceDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class SwaglabsDemo {
    static WebDriver driver;

    public void urlPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
//        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
         driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("./Screen/Homepage.png"));
    }

    public void login() {
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
         driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        TakesScreenshot ts=(TakesScreenshot)driver;
        File file= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("./Screen/login.png"));

    }

    public void AddToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    public void Cart(){
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
    }

    public void CheckOut() {
        driver.findElement(By.id("checkout")).click();
    }

    public void Information() {
        driver.findElement(By.id("first-name")).sendKeys("Sandeep");
        driver.findElement(By.id("last-name")).sendKeys("Mondal");
        driver.findElement(By.id("postal-code")).sendKeys("700124");
        driver.findElement(By.id("continue")).click();
    }

    public void Overview() {
        driver.findElement(By.id("finish")).click();
    }

    public void BackToHome() throws InterruptedException {
        driver.findElement(By.id("error")).click();

    }

    public void Logout() throws InterruptedException {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

    public void Quit() throws InterruptedException {
        driver.quit();
    }
}

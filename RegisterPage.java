package regautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //Thread.sleep(2000);
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.className("female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Malti");
        driver.findElement(By.id("LastName")).sendKeys("Chumber");
        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select (Day);
        select.selectByIndex(29);

        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        Select select1 = new Select(Month);
        select1.selectByIndex(11);

        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));
        Select select2 = new Select(Year);
        select2.selectByVisibleText("1989");
        Thread.sleep(2000);

        driver.findElement(By.id("Email")).sendKeys("malti03chumber@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Unify Testing");
        driver.findElement(By.id("Password")).sendKeys("Rainbow123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Rainbow123");
        driver.findElement(By.id("register-button")).click();
        //Thread.sleep(2000);
        WebDriverWait RegisterPage = new WebDriverWait(driver,30);

        driver.findElement(By.className("ico-logout")).click();

        Thread.sleep(3000);

        driver.close();



    }
}

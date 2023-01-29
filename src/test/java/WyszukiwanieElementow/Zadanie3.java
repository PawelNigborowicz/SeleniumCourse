package WyszukiwanieElementow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement signIn = driver.findElement(By.className("hide_xs"));
        signIn.click();
        WebElement emailAddress = driver.findElement(By.className("account_input"));

        emailAddress.sendKeys("test@test.com");

        WebElement create = driver.findElement(By.id("SubmitCreate"));
        create.click();


    }
}

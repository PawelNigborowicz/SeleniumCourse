package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie4 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://mystore-testlab.coderslab.pl//index.php?controller=authentication&create_account=1");

        //Wyszukiwanie elementu social title za pomoca xPath
        WebElement socialTitle = driver.findElement(By.xpath("//input[@id='field-id_gender-1']"));
        socialTitle.click();

        //Wyszukiwanie pola First name za pomoca xPath
        WebElement firstName = driver.findElement(By.xpath("//input[@id='field-firstname']"));
        firstName.sendKeys("Pawel");

        //Wyszukiwanie pola Last name za pomoca xPath
        WebElement lastName = driver.findElement(By.xpath("//input[@id='field-lastname']"));
        lastName.sendKeys("Nigborowicz");

        //Wyszukiwanie pola Email za pomoca xPath
        WebElement email = driver.findElement(By.xpath("//input[@id='field-email']"));
        email.sendKeys("test@test.pl");

        //Wyszukiwanie pola Password za pomoca xPath
        WebElement password = driver.findElement(By.xpath("//input[@id='field-password']"));
        password.sendKeys("12345");

        //Wyszukiwanie przycisku SHOW za pomoca xPath
        WebElement show = driver.findElement(By.xpath("//button[@data-action='show-password']"));
        show.click();

        //Wyszukiwanie pola Birthdate za pomoca xPath
        WebElement birthdate = driver.findElement(By.xpath("//input[@id='field-birthday']"));
        birthdate.sendKeys("05/16/1992");

        driver.close();


    }
}

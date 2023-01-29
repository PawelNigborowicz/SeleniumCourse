package Konfiguracja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb"));
        acceptCookiesButton.click();

        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Hello world!");
        element.submit();
        driver.quit();



    }


}

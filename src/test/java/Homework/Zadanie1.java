package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadanie1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // 1. Wejdz na strone glowna.

        driver.get("https://mystore-testlab.coderslab.pl/index.php");

        // 2. Przejdz do opcji "Sign in"

        WebElement signIn = driver.findElement(By.className("user-info"));
        signIn.click();

        // 3. Wybierz opcje "No account? Create one here"

        WebElement createAccount = driver.findElement(By.className("no-account"));
        createAccount.click();

        // 4. Za pomoca metod nawigacyjnych przejdz do strony glownej.

        driver.navigate().back();
        driver.navigate().back();

        // Zamknij okno przegladarki

        driver.close();
    }
}

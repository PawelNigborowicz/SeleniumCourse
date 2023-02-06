package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAccount {


    public static void createNewAccount(Person person) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.manage().window().maximize();

        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span"));
        signIn.click();

        WebElement createAccount = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
        createAccount.click();

        WebElement socialTitle = driver.findElement(By.id("field-id_gender-1"));
        socialTitle.click();

        WebElement firstName = driver.findElement(By.id("field-firstname"));
        firstName.sendKeys(person.firstName);

        WebElement lastName = driver.findElement(By.id("field-lastname"));
        lastName.sendKeys(person.lastName);

        WebElement email = driver.findElement(By.id("field-email"));
        email.sendKeys(person.email);

        WebElement password = driver.findElement(By.id("field-password"));
        password.sendKeys(person.password);

        WebElement save = driver.findElement(By.xpath("//*[@id=\"customer-form\"]/footer/button"));
        save.click();

        WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]"));
        myAccount.click();

        WebElement addressBlock = driver.findElement(By.id("address-link"));
        addressBlock.click();

        WebElement fieldAddress = driver.findElement(By.id("field-address1"));
        fieldAddress.sendKeys(person.address);

        WebElement zipCode = driver.findElement(By.id("field-postcode"));
        zipCode.sendKeys(person.zipCode);

        WebElement fieldCity = driver.findElement(By.id("field-city"));
        fieldCity.sendKeys(person.city);

        WebElement country = driver.findElement(By.id("field-id_country"));
        country.click();

        WebElement uk = driver.findElement(By.xpath("//*[@id=\"field-id_country\"]/option[2]"));
        uk.click();

        WebElement saveAddress = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button"));
        saveAddress.click();


    }

    public static void createMultipleAccounts(int number) {

        for (int i = 0; i < number; i++) {
            Person p = new Person();
            NewAccount.createNewAccount(p);
        }


    }

}

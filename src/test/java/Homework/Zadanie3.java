package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie3 {

    public static void main(String[] args) {

        //Ustawienie sterownika przegladarki
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        //Tworzenie nowego obiektu WebDriver
        WebDriver driver = new ChromeDriver();

        //Maksymalizacja okna przegladarki
        driver.manage().window().maximize();

        //Przejscie na strone formularza
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

        //Lokalizowanie pola First name
        WebElement firstName = driver.findElement(By.id("first-name"));
        //Wypelnienie pola First name
        firstName.sendKeys("Karol");

        //Lokalizowanie pola Last name
        WebElement lastName = driver.findElement(By.id("last-name"));
        //Wypelnienie pola Last name
        lastName.sendKeys("Kowalski");

        //Lokalizowanie radio buttona Male
        WebElement radioMale = driver.findElement(By.name("gender"));
        //Zaznaczenie radio buttona Male
        radioMale.click();

        //Lokalizowanie pola Date of birth
        WebElement dateOfBirth = driver.findElement(By.id("dob"));
        //Wpisanie daty urodzenia w polu Date of birth
        dateOfBirth.sendKeys("05/22/2010");

        //Lokalizowanie pola Address
        WebElement address = driver.findElement(By.id("address"));
        //Klikniecie w pole Address aby zamknac kalendarz
        address.click();
        //Wpisanie adresu w pole Address
        address.sendKeys("Prosta 51");


        //Lokalizowanie pola Email
        WebElement email = driver.findElement(By.id("email"));
        //Wpisanie adresu email w pole Email
        email.sendKeys("karol.kowalski@mailinator.com");

        //Lokalizowanie pola Password
        WebElement password = driver.findElement(By.id("password"));
        //Wpisanie hasla w pole Password
        password.sendKeys("Pass123");

        //Lokalizowanie pola Company
        WebElement company = driver.findElement(By.id("company"));
        //Wpisanie nazwy firmy w pole Company
        company.sendKeys("Coders Lab");

        //Lokalizowanie pola Comment
        WebElement comment = driver.findElement(By.id("comment"));

        //Wpisanie komentarza w pole Comment
        comment.sendKeys("To jest mój pierwszy automat testowy");

        //Lokalizowanie przycisku Submit
        WebElement submit = driver.findElement((By.id("submit")));
        //Wyslanie formularza
        submit.click();

        //Zamkniecie okna przegladarki
        driver.close();
    }
}

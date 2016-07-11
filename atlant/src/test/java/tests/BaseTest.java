package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by kobyl on 11.07.2016.
 */
public class BaseTest {
    private static String URL = "https://www.google.com.ua/";
    public static By inputLocator = By.xpath("//input[@id='lst-ib']");
    public static By searchButtonLocator = By.xpath("//button[@name 'btnG')]");
    private static String requestString = "Cats";
    public static void main(String[] args){
        WebDriver driver = new EdgeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //test run
        driver.get(URL);
        WebElement input = driver.findElement(inputLocator);
        input.clear();
        input.sendKeys(requestString);

        WebElement searchButton = driver.findElement(searchButtonLocator);
        searchButton.click();
        //close driver
        driver.quit();
    }
}

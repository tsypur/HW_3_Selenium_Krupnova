package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class App
{
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.get("http://users.bugred.ru/user/login/index.html");
        WebElement webElement = driver.findElement(By.name("name"));
        webElement.click();
        webElement.sendKeys("testik7878");

        WebElement webElement1 = driver.findElement(By.name("email"));
        webElement1.click();
        webElement1.sendKeys("testik7878@yandex.ru");

        WebElement webElement2 = driver.findElement(By.xpath("(//input[@name='password'])[2]"));
        webElement2.click();
        webElement2.sendKeys("123321");

        WebElement webElement3 = driver.findElement(By.name("act_register_now"));
        webElement3.click();
        webElement3.submit();


    }
}

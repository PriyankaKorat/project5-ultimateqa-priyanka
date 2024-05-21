package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UltimateQaMultiBrowser {
    static WebDriver driver;
    static String browser = "Chrome";
    static String baseUrl = "https://courses.ultimateqa.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        //Open base url
        driver.get(baseUrl);
        //Print the title of the page
        System.out.println("The title of the page is :" + driver.getTitle());
        //Print the current url
        System.out.println("The current url is :" + driver.getCurrentUrl());
        //Print the page source
        System.out.println("The page source is :" + driver.getPageSource());
        //click on sign link
        driver.findElement(By.linkText("Sign In")).click();
        //Print the current url
        System.out.println("The current url is :" + driver.getCurrentUrl());
        //Enter the email to field
        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("Test123@gmail.com");
        //Enter the password to field
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("test123");
        //Click on sign in button
        driver.findElement(By.className("button")).click();
        //Navigate to the baseurl
        driver.get(baseUrl);
        //Navigate to forward page
        driver.navigate().forward();
        //baseurl
        driver.get(baseUrl);
        //refresh
        driver.navigate().refresh();
        //close browser
        driver.quit();

    }
}
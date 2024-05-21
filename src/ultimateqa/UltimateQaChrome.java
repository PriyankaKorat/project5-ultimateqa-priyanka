package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQaChrome {
    public static void main(String[] args) {
        //Set up Chrome browser
        WebDriver driver = new ChromeDriver();
        System.out.println(driver);
        //Open Url
        String baseurl = "https://courses.ultimateqa.com/";
        driver.get(baseurl);
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
        driver.get(baseurl);
        //Navigate to forward page
        driver.navigate().forward();
        //baseurl
        driver.get(baseurl);
        //refresh
        driver.navigate().refresh();
        //close browser
        driver.quit();

    }
}

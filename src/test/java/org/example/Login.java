package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();


        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the login page
            driver.get("https://www.google.com"); // Replace with your login page URL

            // Maximize the browser window
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("cisco.com");
            

            // Locate the username and password fields and login button
//            WebElement username = driver.findElement(By.id("username")); // Change as per your page
//            WebElement password = driver.findElement(By.id("password")); // Change as per your page
//            WebElement loginButton = driver.findElement(By.id("loginButton")); // Change as per your page

            // Enter credentials
//            username.sendKeys("yourUsername");
//            password.sendKeys("yourPassword");
//
//            // Click the login button
//            loginButton.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
 //           driver.quit();
        }
    }
}

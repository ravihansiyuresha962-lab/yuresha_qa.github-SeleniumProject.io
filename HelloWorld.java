package sampleapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\setup\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
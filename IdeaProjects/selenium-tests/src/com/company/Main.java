package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.PlumaDriver;
import org.openqa.selenium.chrome.PlumaOptions;

public class Main {
    public static void main(String[] args) {
        // Driver Configuration
        System.setProperty("webdriver.pluma.driver","C:\\Users\\poya0\\Desktop\\Documents\\git\\plumadriver\\plumadriver.exe");
        PlumaOptions options = new PlumaOptions();
        options.setRunScripts(true);
        WebDriver driver = new PlumaDriver(options);
        driver.get("http://127.0.0.1:5500/events.html");

        // Click test button
        WebElement testButton = driver.findElement(By.cssSelector("#test-button"));
        testButton.click();

        // Display event log
        WebElement eventLog = driver.findElement(By.cssSelector("#event-log"));
        System.out.println("EVENT LOG: " + eventLog.getText());

        driver.quit();
    }
}

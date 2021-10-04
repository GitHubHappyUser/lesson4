package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//1. Перенесите два сценария для CRM и два сценария из своего проекта из Selenium IDE в код проектов.
//2. Сдайте ссылки на оба репозитория преподавателю.

public class SetupBrowserExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox")
                // to start my browser in DOC container
                .addArguments("--disable-notifications")
                // to avoid web spam
                .addArguments("user-agent=Googlebot/2.1 (+http://www.google.com/bot.html)");
                // to be qualified like a Bot on Google
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        driver.manage().window().setSize(new Dimension(900,600));

        ((JavascriptExecutor) driver).executeScript("window.open");
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(0));

        Thread.sleep(5000);
        driver.quit();
    }
}

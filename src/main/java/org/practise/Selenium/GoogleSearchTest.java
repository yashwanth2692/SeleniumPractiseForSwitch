package org.practise.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class GoogleSearchTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

        //Click on Flight
        driver.findElement(By.xpath("(//span[text()='Flights'])[1]")).click();

        //Click the From tab and Choose Location
        driver.findElement(By.xpath("(//span[text()='From'])")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Give From Location
        driver.findElement(By.xpath("//span[text()='From']")).click();

        // Now enter "Hyderabad" in the **autosuggest box**, not the fromCity field
        WebElement input = driver.findElement(By.xpath("//input[@placeholder='From']"));
        input.sendKeys("Hyderabad");
        Thread.sleep(2000); // wait for dropdown to appear

        // Now click on "Rajiv Gandhi International Airport"
        driver.findElement(By.xpath("//p[contains(text(),'Rajiv Gandhi International Airport')]")).click();

        //Give To Location
        driver.findElement(By.xpath("//span[text()='To']")).click();

        // Now enter "Hyderabad" in the **autosuggest box**, not the fromCity field
        WebElement input1 = driver.findElement(By.xpath("//input[@placeholder='To']"));
        input1.sendKeys("Bengaluru");
        Thread.sleep(2000); // wait for dropdown to appear

        // Now click on "Rajiv Gandhi International Airport"
        driver.findElement(By.xpath("//p[contains(text(),'Bengaluru International Airport')]")).click();

        // Select Date from Calendar
        driver.findElement(By.xpath("//div[@aria-label='Tue Jul 01 2025']//p[text()='1']")).click();

        // Selecting Passengers
        driver.findElement(By.xpath("//span[text()='Travellers & Class']")).click();
        driver.findElement(By.xpath("(//div[@class='appendBottom20']//li[text()='2'])[1]")).click();
        driver.findElement(By.xpath("//button[text()='APPLY']")).click();

        // Click the Checkbox
        // driver.findElement(By.xpath("//span[@class='commonCheckbox flights sizeSm primaryCheckbox ']")).click();
        driver.findElement(By.xpath("//a[text()='Search']")).click();

        driver.findElement(By.id("bookbutton-RKEY:89da9127-ef39-46a7-8925-b68c3c60a8c1:24_0")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("(//div[@class='makeFlex spaceBetween center cta-container']//button[@class='lato-black button buttonPrimary buttonBig fontSize14'])[1]")).click();

        driver.quit();
    }
}

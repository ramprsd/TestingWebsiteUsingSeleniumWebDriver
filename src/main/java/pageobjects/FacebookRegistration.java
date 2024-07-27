package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;

public class FacebookRegistration extends BaseCode {

    public static void clickNewRegistration() throws InterruptedException {

        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(3000);

    }

    public static void fillDetails() throws InterruptedException {

        driver.findElement(By.name("firstname")).sendKeys("Aaa");
        driver.findElement(By.name("lastname")).sendKeys("Bbb");
        driver.findElement(By.name("reg_email__")).sendKeys("AaaBbb@mail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("AaaBbb@mail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Apassword");

        WebElement bDay = driver.findElement(By.name("birthday_day"));
        Select date = new Select(bDay);
        date.selectByValue("2");

        WebElement bMon = driver.findElement(By.name("birthday_month"));
        Select mon = new Select(bMon);
        mon.selectByIndex(1);

        WebElement bYear = driver.findElement(By.name("birthday_year"));
        Select year = new Select(bYear);
        year.selectByVisibleText("2000");

        driver.findElement(By.xpath("//label[text()='Male']")).click();
        driver.findElement(By.name("websubmit")).click();


    }


}

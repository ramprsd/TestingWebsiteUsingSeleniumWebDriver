package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;

import java.util.List;

public class Project1pageObject extends BaseCode {

    public static void BasicAuth(){
        driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
    }

    public static void enterAuth(String user, String pass){
        String URL = "http://" + user + ":" + pass + "@" + "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);
    }

    public static void verifyAuth(){
        String expectedResult = "Basic Auth";
        String actualResult = driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText();

        //Assert.assertEquals(expectedResult,actualResult);

        if (expectedResult.equals(actualResult)){

            Assert.assertTrue(true);
            System.out.println("Login Success");
        }else{
            Assert.assertTrue(false);
            System.out.println("Failed");
        }

    }

    public static void selectDatePicker() throws InterruptedException {
        driver.navigate().to("https://www.globalsqa.com/demo-site/datepicker/");
        Thread.sleep(2000);
        driver.findElement(By.id("DropDown DatePicker")).click();

    }

    public static void fillDate(String d, String m,String y) throws InterruptedException {

          WebElement frm = driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/datepicker/dropdown-month-year.html']"));
          driver.switchTo().frame(frm);

        Thread.sleep(2000);

        driver.findElement(By.id("datepicker")).click();

        WebElement bYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select year = new Select(bYear);
        year.selectByVisibleText(y);

        WebElement bMon = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select mon = new Select(bMon);
        mon.selectByIndex(Integer.parseInt(m));

        driver.findElement(By.xpath("//a[text()='"+d+"']")).click();

    }

    public static void selectSlider() throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://www.globalsqa.com/demo-site/sliders/']")).click();
        Thread.sleep(2000);

        WebElement frm = driver.findElement(By.xpath("//iframe[@data-src='../../demoSite/practice/slider/colorpicker.html']"));
        driver.switchTo().frame(frm);

        Actions a = new Actions(driver);
        WebElement red = driver.findElement(By.xpath("//div[@id='red']/span"));
        WebElement green = driver.findElement(By.xpath("//div[@id='green']/span"));
        WebElement blue = driver.findElement(By.xpath("//div[@id='blue']/span"));

        a.dragAndDropBy(red,300,0).build().perform();
        a.dragAndDropBy(red,-100,0).build().perform();
        a.clickAndHold(red).moveByOffset(-100,0).build().perform();

        a.clickAndHold(green).moveByOffset(300,0).build().perform();
        a.clickAndHold(green).moveByOffset(-200,0).build().perform();

        a.clickAndHold(blue).moveByOffset(300,0).build().perform();
        a.clickAndHold(blue).moveByOffset(-275,0).build().perform();
    }

    public static void dragAndDrop(){
        driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
    }

    public static void dragAtoB(){
        Actions a = new Actions(driver);
        WebElement boxA = driver.findElement(By.id("column-a"));
        WebElement boxB = driver.findElement(By.id("column-b"));

        a.dragAndDrop(boxA,boxB).build().perform();
    }

    public static void selectFramesAndWindowsOption(){
        driver.findElement(By.partialLinkText("Windows")).click();
    }

    public static void clickiframe(){
        driver.findElement(By.id("iFrame")).click();
    }

    public static void clickHome(){
        driver.switchTo().frame("globalSqa");
        driver.findElement(By.xpath("//span[text()='Home']")).click();
    }
}

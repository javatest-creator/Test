package ru.yandex.market;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class UI_Test {

    private WebDriver driver;
    private ChromeOptions options;

    @BeforeClass
    public void FirstActions() {
        System.setProperty("webdriver.chrome.driver",
                "lib/chromedriver2.exe");
        options = new ChromeOptions();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.get("https://market.yandex.ru/");
    }

    @Test
    public void FirstTest()  {

        //"Электроника" Category choice by xpath (className)
        driver.findElement(By.xpath("//*[@class='_3Lwc_UVFq4']")).click();
        //"Мобильные телефоны" Category choice by linkText
        driver.findElement(By.linkText("Мобильные телефоны")).click();

        assert(driver.getTitle().equals("Мобильные телефоны — купить на Яндекс.Маркете"));

        //Use filter checkbox by producer (Apple)
        WebElement checkBox = driver.findElement(By.xpath("//*[@class='NVoaOvqe58']"));
        if (!checkBox.isSelected())
        {
            checkBox.click();
        }
        //Use filter radiobutton by condition (new)
        WebElement radioButton = driver.findElement(By.className("rCLpHJFFlJ"));
        radioButton.click();
        //Choice color (Gray)
        WebElement checkBox2 = driver.findElement(By.xpath("//*[@class='_3tj_7tz7C- _3TrmO99s6p']"));
        if (!checkBox2.isSelected())
        {
            checkBox2.click();
        }
        //Choice iphone 11 128 Gb
        driver.findElement(By.xpath("//a[contains(text(),'iPhone 11 128GB')]")).click();

        //Get window handlers as list
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        //Switch to new tab
        driver.switchTo().window(browserTabs .get(1));

        assert(driver.getTitle().equals("Смартфон Apple iPhone 11 128GB — купить по выгодной цене на Яндекс.Маркете"));
    }
    @AfterMethod
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
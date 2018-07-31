package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VikramHospital {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testVikramHospital() throws Exception {
    driver.get("http://www.vikraminternationalpatientcare.com/");
    driver.findElement(By.linkText("Neuro Sciences")).click();
    driver.findElement(By.xpath("//img[contains(@src,'http://www.vikraminternationalpatientcare.com/wp-content/uploads/2018/05/Untitled-4-3-logos-02.png')]")).click();
    driver.findElement(By.xpath("//img[contains(@src,'http://www.vikraminternationalpatientcare.com/wp-content/uploads/2018/05/Untitled-4-3-logos-03.png')]")).click();
    driver.findElement(By.linkText("English")).click();
    driver.findElement(By.linkText("internationalhelpdesk@vikramhospital.com")).click();
    driver.findElement(By.xpath("//div[@id='tm-main-section']/div/div/aside/div/div/div[2]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
      System.out.println("build triggers");
      System.out.println("------------");
    }
  }
}

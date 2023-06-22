package base;

import com.google.common.io.Files;
import helpers.PropsConfig;
import io.qameta.allure.Attachment;
import org.aeonbits.owner.ConfigFactory;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public abstract class BaseTest {

  public static final PropsConfig PROPS = ConfigFactory.create(PropsConfig.class);
  private static final Logger logger = LogManager.getLogger(BaseTest.class.getName());

  protected WebDriver driver;

  @BeforeClass
  public void setUp() {
    System.setProperty("webdriver.http.factory", "jdk-http-client");
    driver = Driver.getInstance().setWebDriver().getWebDriver();
    driver.manage().window().maximize();
    BasicConfigurator.configure();
    logger.info("Set up browser");
  }

  @BeforeMethod
  public void openWebsite() {
    driver.get(PROPS.UI_URL_BASE());
    logger.info("Open website " + driver.getCurrentUrl());
  }

  @AfterMethod
  public void tearDown() {
    driver.close();
    logger.info("Tear down browser");
  }

  @Attachment(value = "Page screenshot", type = "image/png")
  public byte[] saveScreenshot(WebDriver driver) throws IOException {
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screenshot,
        new File("./target/allure-results/screenshots//" + screenshot.getName()));
    return Files.toByteArray(screenshot);
  }
}

package base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

  private static final int TIMER = 15;
  private static final Logger logger = LogManager.getLogger(BasePage.class.getName());
  private final WebDriverWait wait;
  public WebDriver driver;
  protected Actions actions;

  public BasePage() {
    this.driver = Driver.getInstance().getWebDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(TIMER));
    actions = new Actions(driver);
  }

  public WebElement getElementByID(String locator) {
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
    return driver.findElement(By.id(locator));
  }

  public WebElement getElementByClassName(String locator) {
    wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));
    return driver.findElement(By.className(locator));
  }

  public WebElement getElementByXpath(String locator) {
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    return driver.findElement(By.xpath(locator));
  }

  public List<WebElement> getElementsByXpath(String locator) {
    return driver.findElements(By.xpath(locator));
  }

  public WebElement getElementByCssSelector(String locator) {
    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
    return driver.findElement(By.cssSelector(locator));
  }

  public List<WebElement> getElementsByCssSelector(String locator) {
    return driver.findElements(By.cssSelector(locator));
  }

  public void waitUntilElementToBeClickable(WebElement webElement) {
    wait.until(ExpectedConditions.elementToBeClickable(webElement));
  }

  public void waitUntilElementToBeInvisibility(String locator) {
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
  }
}

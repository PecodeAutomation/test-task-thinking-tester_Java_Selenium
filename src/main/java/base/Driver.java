package base;

import browser.ChromeBrowser;
import org.openqa.selenium.WebDriver;

public class Driver {

  private static Driver instance;
  private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
  private Driver() {
  }

  public static Driver getInstance() {
    instance = new Driver();
    return instance;
  }

  public Driver setWebDriver() {
    String remote = System.getProperty("runType", "local");
    if (remote.equalsIgnoreCase("remote")) {
      driver.set(new ChromeBrowser().getRemoteWebDriver());
    } else {
      driver.set(new ChromeBrowser().getLocalWebDriver());
    }
    return this;
  }

  public WebDriver getWebDriver() {
    return driver.get();
  }

  public void deleteWebDriver() {
    if (driver != null) {
      driver.get().quit();
    }
    driver = null;
  }
}

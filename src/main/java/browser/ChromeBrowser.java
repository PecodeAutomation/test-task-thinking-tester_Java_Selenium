package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class ChromeBrowser {

  private WebDriver driver;

  @Step
  public static ChromeOptions getChromeOptions() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-gpu");
    options.addArguments("--disable-popup-blocking");
    options.addArguments("--allow-failed-policy-fetch-for-test");
    options.addArguments("--disable-browser-side-navigation");
    options.addArguments("--disable-extensions");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--no-sandbox");
    options.addArguments("--incognito");
    options.addArguments("--remote-debugging-port=9222");
    options.addArguments("--crash-dumps-dir=/tmp");
    options.addArguments("--headless");
    options.addArguments("--disable-notifications");
    options.addArguments("--disable-popup-blocking", "true");
    options.addArguments("--disable-infobars");
    options.addArguments("--remote-allow-origins=*");
    Map<String, Object> prefs = new HashMap<String, Object>();
    prefs.put("credentials_enable_service", false);
    prefs.put("profile.password_manager_enabled", false);
    prefs.put("profile.default_content_setting_values.notifications", 2);
    options.setExperimentalOption("prefs", prefs);
    return options;
  }

  @Step
  public WebDriver getRemoteWebDriver() {
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--disable-gpu");
    chromeOptions.addArguments("--disable-popup-blocking");
    chromeOptions.addArguments("--allow-failed-policy-fetch-for-test");
    chromeOptions.addArguments("--disable-browser-side-navigation");
    chromeOptions.addArguments("--disable-extensions");
    chromeOptions.addArguments("--disable-dev-shm-usage");
    chromeOptions.addArguments("--no-sandbox");
    chromeOptions.addArguments("--incognito");
    chromeOptions.addArguments("--remote-debugging-port=9222");
    chromeOptions.addArguments("--crash-dumps-dir=/tmp");
    chromeOptions.addArguments("--headless");
    chromeOptions.addArguments("--disable-notifications");
    chromeOptions.addArguments("--disable-popup-blocking", "true");
    chromeOptions.addArguments("--disable-infobars");
    driver = WebDriverManager.chromedriver().capabilities(chromeOptions).create();
    driver.manage().window().setSize(new Dimension(1920, 1080));
    return driver;

  }

  @Step
  public WebDriver getLocalWebDriver() {
    WebDriverManager.chromedriver().capabilities(getChromeOptions()).setup();
    driver = new ChromeDriver();
    return driver;
  }

}

package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;

public class SeleniumCDP {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver();
        
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
//        devTools.send(Network.enable());
        
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}



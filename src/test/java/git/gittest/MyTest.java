package git.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyTest {
    public static void main(String[] args) {
    	
    	//Invoking Browser 
    	//Chrome - ChromeDriver exten-->Methods close get
    	//Firefox - FirefoxDriver -->methods close get
    	//safari SafariDriver -->methods close get
    	//WebDriver close get
    	//WebDrive methods + Chrome browser 
    	
    	
    	//chromedriver.exe--> chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\Selenium Drivers\\chromedriver.exe");
        

        // webdriver.chrome.driver-->value of path
        WebDriver driver = new ChromeDriver();
        
        //firefox Launch
        //geckodriver
        
        //webdriver.gecko.driver
//    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\pc\\Downloads\\Selenium Drivers\\geckodriver.exe");
//        WebDriver driver1 = new FirefoxDriver();
        
        //webdriver.gecko.driver
//    	System.setProperty("webdriver.edge.driver", "C:\\Users\\pc\\Downloads\\Selenium Drivers\\msedgedriver.exe");
//        WebDriver driver2 = new EdgeDriver();
        
        
        driver.get("https://astro.synilogictech.com");
       
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       driver.close();
//       driver.quit();
    }
}

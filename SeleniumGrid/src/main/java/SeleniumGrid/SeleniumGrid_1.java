package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid_1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//1) //initiate HUB from cmd
		//java -jar selenium-server-standalone-3.141.59.jar -role hub
		
		//2) //initiate node from cmd
		//java -Dwebdriver.chrome.driver="C:/Softwares/webDrivers/chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.1.21:4444/grid/register
		
		
		//3) //add selenium webdriver maven dependency in pom.xml
		/*
		 <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    	</dependency>
		 */
		
		//1. Define Desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		//2.Chrome Options definition
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl = "http://192.168.1.21:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);
		
		driver.get("www.google.com");
		System.out.println(driver.getTitle());

	}

}

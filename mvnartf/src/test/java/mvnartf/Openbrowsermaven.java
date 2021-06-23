package mvnartf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

//import org.testng.annotations.Test;

public class Openbrowsermaven {

public static void main(String[] args) {

//TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\COMPAQ\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver =new ChromeDriver();

//WebDriverWait wait = new WebDriverWait(driver, 40);

    driver.get("http://qatestingtips.com/");
	

}

}
package AutomationPckg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWeb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adrian\\Documents\\SeleniumProjects\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String Url="https://qainterview.pythonanywhere.com/";
        driver.get(Url);
        //TEST CASE 11212020 -------------------------------------------------------------------
        driver.findElement(By.id("number")).click(); //Finding Input Text 
        driver.findElement(By.id("number")).click(); // Setting the cursor in the input text area
        driver.findElement(By.id("number")).sendKeys("6"); // Providing Input 
        driver.findElement(By.id("getFactorial")).click(); // Clicking Calculate button 
        driver.findElement(By.id("number")).clear();
        driver.findElement(By.id("number")).sendKeys("-6"); // Entering Negative Value
        driver.findElement(By.id("getFactorial")).click(); // Clicking Calculate button 
        String result = driver.findElement(By.id("resultDiv")).getText();
        System.out.println(result);
        
        if (result =="Please enter an integer")
        {
        	 System.out.println(" TEST CASE PASSED");
        }
        
        else
        {
        	System.out.println(" TEST CASE FAILED");
        	
        }
        
	}

}

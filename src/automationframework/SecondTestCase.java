package automationframework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Jean\\CeleniumWebdriver\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//Navigate to google.
			driver.get("http://www.google.com");
			//Click the Google apps button.
			driver.findElement(By.id("gbwa")).click();
			//Thread.sleep(15000);
			//driver.findElement(By.xpath("//*[contains(text(), 'Google apps')]")).click();
			//Press the Drive icon.
			//driver.findElement(By.xpath("//span[@class='Rq5Gcb']/text()='Drive'")).click();
			//driver.findElement(By.xpath("//span[text()='Drive']")).click();
			//WebElement youtube = new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='YouTube']")));
			//youtube.click();
			driver.switchTo().frame(0);
			//driver.findElement(By.xpath("//span[text()='Drive']")).click();
			driver.findElement(By.xpath("//span[text()='YouTube']")).click();
			//driver.findElement(By.xpath("//div[@id='gbwa']/div[2]/ul[1]/li[6]/a")).click();
			}
		catch(Exception e){
			System.out.println("Something went wrong." + e);
		}
		finally {
		      System.out.println("The script is finished.");
	    }
	}

}

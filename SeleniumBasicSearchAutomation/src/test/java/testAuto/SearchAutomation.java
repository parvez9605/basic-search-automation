package testAuto;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.get("https://www.google.com/");
		
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys("TigerIT", Keys.ENTER);
		
		WebElement crossclick = driver.findElement(By.xpath("//*[@id=\"Rzn5id\"]/div/a[1]"));
		crossclick.click();
		
		WebElement contenttoclick = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3"));
		contenttoclick.click();

	}

}

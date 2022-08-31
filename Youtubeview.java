package Basicsofselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubeview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.navigate().to("https://www.youtube.com/");
		wd.manage().window().maximize();
		
	Thread.sleep(3000);
	WebElement newpage = wd.findElement(By.xpath("//*[text()='Reject all']"));
	newpage.click();
	//Thread.sleep(3000);
		WebElement vedios = wd.findElement(By.xpath("//input[@id='search']"));
		Thread.sleep(3000);
		vedios.sendKeys("cinestudiodindigul"+Keys.ENTER);
		
		
	}

}

package Basicsofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//wd.get("https://www.leafground.com/");
		wd.navigate().to("https://www.leafground.com/input.xhtml;jsessionid=node0ukfpmxhzochg1sr9jioo59o9w22781.node0");
		wd.manage().window().maximize();
		
		//Append
		WebElement append = wd.findElement(By.id("j_idt88:j_idt91"));
		append.sendKeys(", India");
		
		//cleartext
		WebElement cleartext = wd.findElement(By.id("j_idt88:j_idt95"));
		cleartext.clear();
		
		//Retrivetext
		WebElement retrive = wd.findElement(By.id("j_idt88:j_idt97"));
		String Retrivetext =retrive.getAttribute("value");
		System.out.println(Retrivetext);
		
		//Checkdisabledoption
		WebElement disabled = wd.findElement(By.id("j_idt88:j_idt93"));
		boolean Disabledfield =disabled.isEnabled();
		if(Disabledfield ==false) {
			System.out.println("The field is disabled");
		}else
			System.out.println("The field is not disabled");
		
	}

}

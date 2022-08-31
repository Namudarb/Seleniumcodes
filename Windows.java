package Basicsofselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//wd.get("https://www.leafground.com/");
		wd.navigate().to("https://www.leafground.com/window.xhtml");
		wd.manage().window().maximize();
		
		//single window
            /*  String oldwindow =     wd.getWindowHandle();
              WebElement open = wd.findElement(By.id("j_idt88:new"));
              open.click();
              Set<String> windows   =wd.getWindowHandles();
              for (String newwindow : windows) {
            	  wd.switchTo().window(newwindow);
            	  }
              
              System.out.println("You window opened");
              wd.close();*/
          
          //multiple window
              String oldwindow =     wd.getWindowHandle();
              WebElement open = wd.findElement(By.id("j_idt88:j_idt91"));
              open.click();
              Set<String> windows   =wd.getWindowHandles();
              int openedwindows=wd.getWindowHandles().size();
              System.out.println(openedwindows);
              
	}

}

package weekfour.dayone;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	     ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		Thread.sleep(5000);
		
        driver.switchTo().frame("iframeResult");
		
	     driver.findElementByXPath("/html/body/button").click();
		
        String alertText = driver.switchTo().alert().getText();
      
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
		
	    driver.switchTo().defaultContent();
	    
		driver.findElementById("tryhome").click();
		
		driver.navigate().to("");
	   
	      
		    
		    
			
			
			
		}
	}
		    
	



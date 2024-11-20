package weekfour.dayone;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertsAndFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	     ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	
		Thread.sleep(5000);
	
		
		driver.findElementById("accept-choices").click();
		
		Thread.sleep(5000);
		
		//driver.switchTo().frame(1);
		
		//driver.switchTo().frame("iframeResult");
		
		WebElement myframe = driver.findElementByXPath("//*[@id=\"iframeResult\"]");
		
		driver.switchTo().frame(myframe);
		
	    driver.findElementByXPath("/html/body/button").click();
	    
	    String alertText = driver.switchTo().alert().getText();
	    
	    System.out.println(alertText);
	    
	    if(alertText.equals("please enter your name:")) 
	    {	
	    	System.out.println("pass");
	    	
	    }else {
	    	System.out.println("fail");
	    
	    }
	    driver.switchTo().alert().accept();
	    
	    driver.switchTo().alert().sendKeys("kavitha");
	    
	    driver.switchTo().alert().accept();
	    
	    String applicationText = driver.findElementById("demo").getText();
	    
	    System.out.println(applicationText);
	    
	    if(applicationText.contains("kavitha")) {
	    	
	    	System.out.println("pass");
	    }else {
	    	System.out.println("fail");
	    	
	    }
	    driver.findElementByXPath("/html/body/button").click();
	    
	   driver.switchTo().alert().dismiss();
	    
	   driver.switchTo().defaultContent();
	    
	   driver.findElementById("tryhome").click();
	    
	  driver.navigate().refresh();
	    
	   driver.navigate().back();
	    
	  driver.navigate().forward();
	    
	  driver.navigate().to("");
	    
	    
	    
		
		
		
	}
}

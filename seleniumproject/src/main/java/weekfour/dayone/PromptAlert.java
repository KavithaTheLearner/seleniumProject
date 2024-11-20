package weekfour.dayone;

import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage() .window().maximize();
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(5000);
		
		
		driver.switchTo().frame("iframeResult");

		driver.findElementByXPath("/html/body/button").click();
		
		
		driver.switchTo().alert().sendKeys("kavitha");
		
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		
		driver.switchTo().alert().accept();
		
		
		String applicationText = driver.findElementById("demo").getText();
		
		System.out.println(applicationText);
		if(applicationText.contains("kavitha"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
			
		}
		
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("/html/body/button").click();
		
		driver.switchTo().alert().sendKeys("kavitha");
		
		String alertBox = driver.switchTo().alert().getText();
		System.out.println(alertBox);
		
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
		String applicationText1 = driver.findElementById("demo") .getText();
		if(applicationText1.contains("kavitha")){
		
			System.out.println("pass");
		}else
		{
			System.out.println("fail");
		
		}
		
		driver.switchTo().defaultContent();
		
		driver.findElementById("tryhome").click();
		 
		driver.navigate().to("");
		}	
		
		
	}



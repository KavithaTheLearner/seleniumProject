package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.irctc.co.in.");
		driver.findElementByLinkText("REGISTER").click();
		
		Thread.sleep(5000);
		
        driver.findElementByName("userName").sendKeys("Kavithamurugesan1995");
        driver.findElementById("usrPwd").sendKeys("Kavitha13");
        driver.findElementById("cnfUsrPwd").sendKeys("Kavitha13");
        
       driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[2]/span").click();
       
       driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li/span").click();
       
        driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("anukutty");
        Thread.sleep(5000);
        
        driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
    
        Thread.sleep(5000);
        
        driver.findElementById("firstName").sendKeys("Kavitha");
        driver.findElementById("lastname").sendKeys("murugesan");
        driver.findElementById("lastname").sendKeys("murugesan");
        driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").sendKeys("04-09-1996");
        //driver.findElementByClassName("ui-state-default ng-tns-c58-17 ui-state-active ng-star-inserted");
        driver.findElementByLinkText("4").click();
        driver.findElementByXPath("//*[@id=\"married\"]/label").click();
        //driver.findElementByXPath(//*[@id="married"]/label);
        driver.findElementById("email").sendKeys("Kavithamurugesan1995@gmail.com");
        driver.findElementById("mobile").sendKeys("8945673457");
        driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]/span").click();
       
        Thread.sleep(5000);
        
        driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
        driver.findElementById("resAddress1").sendKeys("133kalayanstreet");
        driver.findElementById("resAddress2").sendKeys("kalyan");
        driver.findElementById("resAddress3").sendKeys("mg");
        driver.findElementById("resPhone").sendKeys("8945673457");
        driver.findElementByXPath("//*[@id=\"no\"]/div/div[2]/span").click();
        driver.findElementById("offAddress1").sendKeys("15hennurcrossroadhennur");
        driver.findElementById("offAddress2").sendKeys("hennur");
        driver.findElementById("offAddress3").sendKeys("2ndstreetroad");
        driver.findElementById("offPhone").sendKeys("8945673457");
        
        
        
        
        
        
        
        
        
    
        
        
	}

}

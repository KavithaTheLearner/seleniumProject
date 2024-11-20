package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class FtrIRCTCSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.ftr.irctc.co.in/ftr/");
		driver.findElementByLinkText("New User? Signup").click();
		driver.findElementByName("userId").sendKeys("Kavitha_murugesan13");
        driver.findElementById("password").sendKeys("Murugesan13");
        driver.findElementById("cnfPassword").sendKeys("Murugesan13");
        driver.findElementByName("secAnswer").sendKeys("Anu");
        driver.findElementById("dateOfBirth").click();
        //driver.findElementById("ui-datepicker-calendar");
        driver.findElementByLinkText("5").click();
        driver.findElementById("gender1").click();
        driver.findElementById("maritalStatus0"). click();
        driver.findElementById("email").sendKeys("kavitha.Murugesan13@gmail.com");
        driver.findElementById("fname").sendKeys("kavitha");
        driver.findElementById("lname").sendKeys("murugesan");
        driver.findElementById("flatNo").sendKeys("210");
        driver.findElementById("street").sendKeys("shamana layout");
        driver.findElementById("area").sendKeys("lingarajapuram");
        
        driver.findElementByName("mobile").sendKeys("8965432895");
        Thread.sleep(5000);
        //driver.findElementbyXpath("//html/body").sendkeys(Keys.PAGE_DOWN);
       
        driver.findElementByXPath("//*[@id=\"sameAddresses1\"]").click();
        
        driver.findElementById("flatNoOffice").sendKeys("110");
        driver.findElementById("streetOffice").sendKeys("kalyan");
        driver.findElementById("areaOffice").sendKeys("mg nagar");
        driver.findElementById("mobileOffice").sendKeys("8976543288");
        
     
	}

}

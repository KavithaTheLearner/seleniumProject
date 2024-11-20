package weekone;

import org.openqa.selenium.chrome.ChromeDriver;

public class PhptravelsRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.org/register.php");
	    driver.findElementById("inputFirstName").sendKeys("Kavitha");
	    driver.findElementById("inputLastName").sendKeys("Anupkarthik");
	    driver.findElementByName("email").sendKeys("kavitha.anupkarthik@gmail.com");
	    driver.findElementByName("phonenumber").sendKeys("66550211");
	    driver.findElementByName("companyname").sendKeys("Tata");
	    driver.findElementByName("address1").sendKeys("46 Mount Street Upper");
	    driver.findElementByName("address2").sendKeys("sandyford");
	    driver.findElementByName("city").sendKeys("Dublin");
	    driver.findElementByName("state").sendKeys("manchester");
	    driver.findElementByName("postcode").sendKeys("D14A44");
	    driver.findElementByName("country").sendKeys("ireland");
	    driver.findElementById("customfield2").sendKeys("9876543");
	    driver.findElementById("inputNewPassword1").sendKeys("Kavitha13");
	    driver.findElementById("inputNewPassword2").sendKeys("Kavitha13");
	    
	   
	    
	    
		
	}

}

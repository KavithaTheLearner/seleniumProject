package weekone;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import sports.BasketBall;

public class IndianfrrogovForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BasketBall.rules();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		
		driver.findElementByLinkText("Sign Up (Registration)").click();
		
		driver.findElementById("u_id").sendKeys("Kavitha13");
		
		driver.findElementById("u_pwd").sendKeys("Anupkarthik@13");
		
		driver.findElementById("u_repwd").sendKeys("Anupkarthik@13");
		
	 	WebElement secQuestion =  driver.findElementById("u_secques");
		
		Select sel = new Select(secQuestion);
		
		//sel.selectByIndex(2);
		
		//sel.selectByValue("5");
		
		sel.selectByVisibleText("What is the name of the hospital where you were born?");
		
		driver.findElementByName("u_name").sendKeys("Kavitha");
		driver.findElementByName("u_dob").sendKeys("9/12/1996");
		driver.findElementByName("u_designation").sendKeys("teacher");
		driver.findElementByName("u_emailid").sendKeys("Kavitha.anupkarthik@gmail.com");
		driver.findElementByName("u_mobile").sendKeys("9148862834");
		driver.findElementByName("u_phone").sendKeys("9148862839");
		driver.findElementByName("u_nationality").sendKeys("India");
		driver.findElementByName("name").sendKeys("Golden Haven");
		driver.findElementByName("capacity").sendKeys("7");
		driver.findElementById("address").sendKeys("101 Golden Gate Ave, Sunnyvale");
		driver.findElementByName("email").sendKeys("goldenheaven67@gmail.com");
		driver.findElementByName("mcontact").sendKeys("9148862834");
		driver.findElementByName("contact").sendKeys("35316458800");
		driver.findElementByName("name_o").sendKeys("kavitha");
		driver.findElementByName("address_o").sendKeys("101 Gate Ave, Sunnyvale");
		driver.findElementByName("emailid_o").sendKeys("goldenheaven67@gmail.com");
		driver.findElementByName("phoneno_o").sendKeys("35316458800");
		driver.findElementByName("mobile_o").sendKeys("9148862834");

		
		
		
		
	}

}

package weekfive;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SixthTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	       
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); 

        driver.get("https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		
        driver.findElementByLinkText("Sign Up (Registration)").click();
		Thread.sleep(5000);
		
		driver.findElementById("u_id").sendKeys("KavithaAnup16");
		
		driver.findElementById("u_pwd").sendKeys("Murugan@123");
		
		driver.findElementById("u_repwd").sendKeys("Murugan@123");
		
	 	WebElement secQues =  driver.findElementById("u_secques");
		
		Select entr = new Select(secQues);
		
		entr.selectByValue("2");
		
		driver.findElementById("u_secans").sendKeys("seventhday hospital");
		
		driver.findElementByName("u_name").sendKeys("Kavitha");
		
		WebElement gen =  driver.findElementById("u_gender");
		
		Select click = new Select(gen);
		
		click.selectByVisibleText("Female");
		
		driver.findElementByName("u_dob").sendKeys("12/11/1996");
	
 		driver.findElementByName("u_designation").sendKeys("Student");
		
		driver.findElementByName("u_emailid").sendKeys("Kavithamurugan@gmail.com");
		
		driver.findElementByName("u_mobile").sendKeys("9876124345");
		
		driver.findElementByName("u_phone").sendKeys("987654321");
		
		 WebElement  nation =driver.findElementByName("u_nationality");
		 
		 Select fre = new Select(nation);
		  
		 fre.selectByVisibleText("INDIA");
		
		driver.findElementByName("name").sendKeys("Empire Hotel");
		
		driver.findElementByName("capacity").sendKeys("7");
		
		driver.findElementById("address").sendKeys("shanthi road 5th cross");
		Thread.sleep(3000);
		
		WebElement state = driver.findElementById("state");
		
		Select plc = new Select(state);
		
		plc.selectByVisibleText("KARNATAKA");
		Thread.sleep(3000);
		
		WebElement city = driver.findElementByName("city_distr");
		
		Select dis = new Select(city);
		
		dis.selectByVisibleText("BENGALURU");
		Thread.sleep(3000);
		
		WebElement acc =driver.findElementById("acco_type");
		
		Select rm = new Select(acc);
		
		rm.selectByVisibleText("Bed and Breakfast") ;
		
		WebElement grade = driver.findElementById("star_rat");
		
		Select pck = new Select(grade);
		
		pck.selectByValue("5s");
		
		driver.findElementByName("email").sendKeys("empirehotel@gmail.com");
		
		driver.findElementByName("mcontact").sendKeys("976543278");
		
		driver.findElementByName("contact").sendKeys("987651234");
		
		driver.findElementByName("name_o").sendKeys("kavitha");
		
		driver.findElementByName("address_o").sendKeys("shanthi road 5th cross");
		
        WebElement str = driver.findElementById("state_o");
		
		Select pick= new Select(str);
		
		pick.selectByValue("15");
		Thread.sleep(3000);
		
        WebElement disct = driver.findElementByName("citydistr_o");
		
		Select confir= new Select(disct);
		
		confir.selectByValue("18D");
		Thread.sleep(3000);
		
		
		driver.findElementByName("emailid_o").sendKeys("empirehotel@gmail.com");
		
		driver.findElementByName("phoneno_o").sendKeys("912345678");
		
		driver.findElementByName("mobile_o").sendKeys("987612345");

		driver.findElementByName("add").click();
	
        driver.findElementByName("name_o").sendKeys("francina");
		
		driver.findElementByName("address_o").sendKeys("kamanahali road");
		
        WebElement fan= driver.findElementById("state_o");
		
		Select sel= new Select(fan);
		
		sel .selectByValue("15");
		Thread.sleep(3000);
		
        WebElement cty = driver.findElementByName("citydistr_o");
		
		Select cnfm= new Select(cty);
		
		cnfm.selectByValue("29D");
		Thread.sleep(3000);
		
		
		driver.findElementByName("emailid_o").sendKeys("franciabc@gmail.com");
		
		driver.findElementByName("phoneno_o").sendKeys("61234789");
		
		driver.findElementByName("mobile_o").sendKeys("634527819");

		driver.findElementByName("add").click();
		
		
      driver.findElementByName("name_o").sendKeys("meera");
		
		driver.findElementByName("address_o").sendKeys("chikballapur main road");
		
        WebElement ste= driver.findElementById("state_o");
		
		Select chse= new Select(ste);
		
		chse .selectByValue("15");
		Thread.sleep(3000);
		
        WebElement ditr = driver.findElementByName("citydistr_o");
		
		Select dn= new Select(ditr);
		
		dn.selectByValue("8D");
		Thread.sleep(3000);
		
		
		driver.findElementByName("emailid_o").sendKeys("meeabc@gmail.com");
		
		driver.findElementByName("phoneno_o").sendKeys("720198543");
		
		driver.findElementByName("mobile_o").sendKeys("72435612");

        driver.quit();
	}

}

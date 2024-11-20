package weekfive;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		       
		        ChromeDriver driver = new ChromeDriver();
		      
		        driver.manage().window().maximize(); 

		      
		        driver.get("https://www.irctc.co.in/nget/train-search");

		        //driver.findElementByLinkText(" HOLIDAYS ").click();
		         driver.findElementByXPath(" /html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a").click();
		         Thread.sleep(8000);
		         
		        driver.findElementByLinkText("Stays").click();
		        Thread.sleep(5000);
		        
		       // driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]").click();
		      driver.findElementByLinkText("Lounge").click();
		      Thread.sleep(5000);
		      
		       //driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span").click();
		        
                  Set<String> windowId = driver.getWindowHandles();

		          for (String Id : windowId) {
		            
		       driver.switchTo().window(Id);
		                
		          
		        }
		        Thread.sleep(5000);
		        
		        driver.findElementById("sidebarCollapse").click();
		        Thread.sleep(3000);
		        
		        driver.findElementByLinkText("Book Your Coach/Train").click();
		        
		        Set<String> windowhandle = driver.getWindowHandles();

		         for (String handle: windowhandle) {
		            
		       driver.switchTo().window(handle);
		        
		         }
		         
		         Thread.sleep(5000);
		         
		         driver.findElementByLinkText("New User? Signup").click();

		         driver.findElementByName("userId").sendKeys("Kavitha_murugan");
		         
		         driver.findElementById("password").sendKeys("Murugan123");
		         
		         driver.findElementById("cnfPassword").sendKeys("Murugan123");
		         
		         WebElement securityQuestion =  driver.findElementById("secQstn");
		 		
		 		Select sel = new Select(securityQuestion);
		 		
		 		sel. selectByValue("1");
		 		
		 		 driver.findElementByName("secAnswer").sendKeys("st johns high school");
		 		 
		 		 driver.findElementById("dateOfBirth").click();
		 		 
		 		 
		 		 
                WebElement Month =  driver.findElementByClassName("ui-datepicker-month");
		 		
		 		Select confirm = new Select(Month);
		 		
		 		confirm. selectByValue("");
		         
               WebElement year =  driver.findElementByClassName("ui-datepicker-year");
		 		
		 		Select choose = new Select(year);
		 		
		 		choose. selectByVisibleText("1998");

		 		driver.findElementByLinkText("13").click();
		 		Thread.sleep(5000);
		 		
		 		 driver.findElementById("gender1").click();
		 		 
		         driver.findElementById("maritalStatus0"). click();
		         
		         driver.findElementById("email").sendKeys("kavitha.Murugan@gmail.com");
		         
		         WebElement occupation =  driver.findElementById("occupation");
			 		
			 		Select ent = new Select(occupation);
			 		
			 		ent. selectByVisibleText("Student");
		         
		         
		         driver.findElementById("fname").sendKeys("kavitha");
		         
		         driver.findElementById("mname").sendKeys("Anup");
		         
		         driver.findElementById("lname").sendKeys("Karthik");
		         
		          WebElement nation = driver.findElementById("natinality");
		          
		         Select pick = new Select(nation);
		         
		         pick. selectByVisibleText( "Indian"  );
		         
		         driver.findElementById("flatNo").sendKeys("15");
		         
		         driver.findElementById("street").sendKeys("henur layout");
		         
		         driver.findElementById("area").sendKeys("mg nagar");
		         
		         WebElement country =  driver.findElementById("country");
			 		
			 		Select con = new Select(country);
			 		
			 		con. selectByVisibleText("India");
			 		
				driver.findElementByName("mobile").sendKeys("9876543221");
			        
		         driver.findElementById("pincode").sendKeys("560084",Keys.TAB);
		         
		         
		          WebElement cityName =  driver.findElementById("city");
			 		
			 		Select see = new Select(cityName);
			 		
			       see. selectByVisibleText("Bangalore");
			 		Thread.sleep(3000);
			 		
                WebElement stateName =  driver.findElementById("state");
			 		
			 		Select sele = new Select(stateName);
			 		
			 		sele. selectByVisibleText("KARNATAKA");
			 		Thread.sleep(3000);
			 		
			 	  WebElement post =  driver.findElementById("postOffice");
			 		
			 		Select off= new Select(post);
			 		
			 		off. selectByVisibleText("Kacharakanahalli B.O");
			 		
			 		//driver.findElementById("sameAddresses1").click();
			 		driver.findElementByXPath("//html/body").sendKeys("Keys.PAGE_DOWN");
			        
			      driver.findElementByXPath("//*[@id=\"sameAddresses1\"]").click();
			        
			        driver.findElementById("flatNoOffice").sendKeys("78");
			        
			        driver.findElementById("streetOffice").sendKeys("linga");
			        
			        driver.findElementById("areaOffice").sendKeys("henur cross");
			        
                    WebElement coun=  driver.findElementByName("countryOffice");
			 		
			 		Select tt = new Select(coun);
			 		
			 		tt. selectByValue("94");
			 		
			        
			        driver.findElementById("mobileOffice").sendKeys("9876543221");
			        
			        driver.findElementById("pincodeOffice").sendKeys("560006");
			        
                   WebElement city =  driver.findElementById("cityOffice");
			 		
			 		Select cy = new Select(city);
			 		
			        cy. selectByVisibleText("Bangalore");
			 		Thread.sleep(3000);
			 		
                   WebElement stName =  driver.findElementById("stateOffice");
			 		
			 		Select sta = new Select(stName);
			 		
			 		sta. selectByVisibleText("KARNATAKA");
			 		Thread.sleep(3000);
			 		
			 	   WebElement psOff =  driver.findElementById("postOfficeOffice");
			 		
			 		Select pst= new Select(psOff);
			 		
			 		pst. selectByVisibleText("Hulsur Bazaar S.O");
			 		
			         
			     driver.quit();
			 	
	}
	

}	
		
	



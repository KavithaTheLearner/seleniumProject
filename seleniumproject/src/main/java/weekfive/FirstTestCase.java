package weekfive;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	       
	        ChromeDriver  driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();

	      
	        driver.get("https://www.irctc.co.in/nget/train-search");

	      
	         driver.findElementByLinkText("REGISTER").click();
	         Thread.sleep(5000);

	         
	         driver.findElementByName("userName").sendKeys("kavithaMurugesan");
	         
	         driver.findElementById("usrPwd").sendKeys("Kavitha123");
	         
	         driver.findElementById("cnfUsrPwd").sendKeys("Kavitha123");
	         
	         driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[2]/span").click();
	         
	         driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[2]/span").click();
	          
	          driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("vijay");
	          Thread.sleep(5000);
	          
	          driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown").click();
		         
             driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
	         
	         
	         driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
	 	    
	        Thread.sleep(5000);
	        
	        driver.findElementById("firstName").sendKeys("Kavitha");
	        
	        driver.findElementById("lastname").sendKeys("murugesan");
	        
	        driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]/span").click();
	        
	        driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").click();
	        
	       WebElement mnth = driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]");
	       
	       Select sel = new Select(mnth);
	       
	       sel .selectByVisibleText("June");
	       
	       WebElement year = driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]");
	      
	       Select yar =new Select(year);
	       
	       yar .selectByValue("1994");
	       
	       driver.findElementByLinkText("5").click();
	       Thread.sleep(3000);
	    
	       driver.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[5]/p-dropdown/div/div[2]/span").click();
	       
	        driver.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[6]/li/span").click();
	        
	        driver.findElementByXPath("//*[@id=\"married\"]/label").click();

            driver.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[8]/select").click();
	       
            driver.findElementById("email").sendKeys("Kavithamurugesan@gmail.com");
            
            driver.findElementById("mobile").sendKeys("9742653409");
            
            driver.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[13]/select").click();
            
            driver.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[2]/div/div/div[13]/select/option[106]").click();
            
            Thread.sleep(5000);

            driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
	     
            driver.findElementById("resAddress1").sendKeys("201henurstreet");
            
            driver.findElementById("resAddress2").sendKeys("henur bandae");
            
            driver.findElementById("resAddress3").sendKeys("henur cross");
            
            driver.findElementByName("resPinCode").sendKeys("560085");
            
            driver.findElementById("resState").sendKeys("Karnataka");
            Thread.sleep(3000);
            
            WebElement  city = driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[5]/select");
            
            Select  off = new Select(city);
            
            off.selectByVisibleText("Bangalore");
            
          WebElement pstoff = driver.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select");
            
           Select clk = new Select(pstoff);
            
           clk. selectByValue("Hosakerehalli B.O");
            Thread.sleep(8000);
            
           driver.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[5]/select/option[2]").click();
	       Thread.sleep(4000);
	       
          driver.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select").click();
          
          driver.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[7]/select/option[4]").click();
          
          driver.findElementById("resPhone").sendKeys("9742653260");
          
   		 driver.findElementByXPath("//*[@id=\\\"no\\\"]/div/div[2]/span").click();
   		
   		 driver.findElementByXPath("/html/body/app-root/app-home/div[3]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[2]/p-tabview/div/div/p-tabpanel[3]/div/div/div[12]/span[1]/input").click();
   		 
	
	
	}	


}

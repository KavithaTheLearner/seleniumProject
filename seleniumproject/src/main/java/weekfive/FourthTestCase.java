package weekfive;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FourthTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

	       
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); 

      
        driver.get("https://www.irctc.co.in/nget/train-search");

       
         driver.findElementByXPath(" /html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a ").click();
         Thread.sleep(5000);
         
        driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]").click();
     
        driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span").click();
        Thread.sleep(5000);
        
          Set<String> wndoId = driver.getWindowHandles();

          for (String hee: wndoId) {
            
          driver.switchTo().window(hee);
                
          
        }
        Thread.sleep(5000);
        
        driver.findElementById("sidebarCollapse").click();
        Thread.sleep(3000);
        
        driver.findElementByLinkText("Hotels").click();
        
        Set<String> scrn = driver.getWindowHandles();

        for (String winId: scrn) {
           
        driver.switchTo().window(winId);
       
        }
        Thread.sleep(3000);
        
        driver.findElementByLinkText("Login").click();
        Thread.sleep(3000);
        
        driver.findElementById("GuestUser-tab").click();
        
        driver.findElementByXPath("//*[@id=\"GuestUser\"]/div/form/ul/li[1]/input").sendKeys("kavi123@gmail.com");
        
        driver.findElementByXPath("//*[@id=\"GuestUser\"]/div/form/ul/li[2]/input").sendKeys("9742653260");
        
        driver.findElementByXPath("//*[@id=\"GuestUser\"]/div/form/ul/li[3]/button").click();
        Thread.sleep(5000);
        
        driver.findElementByXPath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[1]/input").sendKeys("Bangalore");
        Thread.sleep(8000);
        
        driver.findElementByXPath("//*[@id=\"autofillId\"]/ul/li[3]/a/div/p").click();
        driver.findElementByXPath("//*[@id=\"autofillId\"]/ul/li[3]/a/div/p/small").click();
      Thread.sleep(6000);
      
       driver.findElementByXPath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[2]/input").click();
        Thread.sleep(8000);
        
       driver.findElementByXPath("/html/body/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[1]").click();
       
       driver.findElementByXPath("/html/body/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[5]/td[4]").click();
	Thread.sleep(5000);
	
	    driver.findElementByXPath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[3]/input").click();
	    Thread.sleep(5000);
	    
	   driver.findElementByXPath("/html/body/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[1]").click();
	   Thread.sleep(5000);
	   
	  driver.findElementByXPath("/html/body/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[5]/td[5]").click();
	  Thread.sleep(3000);
	  
	 // driver.findElementByXPath("/html/body/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[1]/bs-datepicker-navigation-view/button[3]/span").click();
	  
	  //driver.findElementByXPath("/html/body/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[5]/td[5]").click();
	  
	    driver.findElementByXPath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[4]/input").click();
	    Thread.sleep(3000);
	   
	    WebElement room =  driver.findElementByXPath("//*[@id=\"collapseBasic\"]/div/ul/li[1]/select");
 		
 		Select entr = new Select(room);
 		
 		entr.selectByValue("1");
	
	
	   WebElement adut = driver.findElementByXPath("//*[@id=\"collapseBasic\"]/div/ul/li[2]/select");
	
	  Select pick = new Select(adut);
	  pick.selectByValue("3");
	  
	  driver.findElementByXPath("//*[@id=\"collapseBasic\"]/div/div[2]/button").click();
	  
	  driver.findElementByXPath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[5]/button").click();
	  
	 // driver.findElementByXPath("//*[@id=\"hotelContainer\"]/div[1]/a/div/div[2]/h2/a/span").click();
	  Thread.sleep(3000);
	  
	  String hotelName = driver.findElementByXPath("//*[@id=\"hotelContainer\"]/div[1]/a/div/div[2]/h2/a/span").getText();
	  Thread.sleep(8000);
	  
	  System.out.println(hotelName);
	  
	  String hotelPrice = driver.findElementByXPath("//*[@id=\"hotelContainer\"]/div[1]/a/div/div[3]/div/div[2]/div[1]").getText();
	  Thread.sleep(5000);
	  
	  System.out.println(hotelPrice);
	  
	  Set<String> hotel = driver.getWindowHandles();

      for (String winId: hotel) {
         
      driver.switchTo().window(winId);
      
      }
      Thread.sleep(3000);
     driver.findElementByLinkText("Continue to Book").click();
      
     // driver.findElementByXPath("/html/body/app-root/app-hotel-details/div[4]/div/div/div[3]/div[1]/div/div[3]/a").click();
      Thread.sleep(3000);
      
      driver.findElementByXPath("//*[@id=\"GuestUser-tab\"]").click();
      
      driver.findElementByXPath("//*[@id=\"GuestUser\"]/div/form/ul/li[1]/input").sendKeys("kavi123@gmail.com");
      
      driver.findElementByXPath("//*[@id=\"GuestUser\"]/div/form/ul/li[2]/input").sendKeys("9742653260");
      
      WebElement tle = driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[1]/select");
      Select nme =new Select(tle);
      nme.selectByValue("2");
      
      driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[2]/input").sendKeys("kavitha");
      Thread.sleep(5000);
      
      driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[3]/input").sendKeys("Murugan");
      
      WebElement place = driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[5]/select");
      Select ste = new Select(place);
      ste .selectByValue("KA");
      
      WebElement gst = driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[8]/select");
	  Select num = new Select(gst);
	  num.selectByVisibleText("No");
	  
	  driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	  
	  driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/button").click();
	  Thread.sleep(5000);
	  
	  driver.findElementByXPath("/html/body/app-root/app-passenger-summary/div[4]/div/div[1]/form/div/div/label").click();
	  
	  driver.findElementByXPath("/html/body/app-root/app-passenger-summary/div[4]/div/div[1]/button[2]").click();
	  
	  driver.findElementByXPath("//*[@id=\"otpModal\"]/div/div/div[2]/form/div[1]/input").click();
	  
	  Thread.sleep(5000);
	  
     // string otp = driver.findElementByXPath(hotelPrice)
	

	 // driver.quit()
      
	}
}


package weekfive;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FifthClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		Thread.sleep(5000);
       ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); 

      
        driver.get("https://www.irctc.co.in/nget/train-search");

       
         driver.findElementByXPath(" /html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a ").click();
         Thread.sleep(5000);
         
        driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]").click();
        
        
        driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span").click();
        
          Set<String> windowHan= driver.getWindowHandles();

          for (String den : windowHan) {
            
        driver.switchTo().window(den);
                
          
        }
        Thread.sleep(5000);
        
        driver.findElementById("sidebarCollapse").click();
        Thread.sleep(3000);
        
       driver.findElementByLinkText("Hotels").click();
        
        Set<String> windowId = driver.getWindowHandles();

        for (String scrnId: windowId) {
           
        driver.switchTo().window(scrnId);
       
        }
        Thread.sleep(3000);
        
        driver.findElementByLinkText("Login").click();
        Thread.sleep(3000);
        
        driver.findElementById("GuestUser-tab").click();
        
        driver.findElementByXPath("//*[@id=\"GuestUser\"]/div/form/ul/li[1]/input").sendKeys("kavithamurugan123@gmail.com");
        
        driver.findElementByXPath("//*[@id=\"GuestUser\"]/div/form/ul/li[2]/input").sendKeys("9876543214");
        Thread.sleep(5000);
        
        driver.findElementByXPath("//*[@id=\"GuestUser\"]/div/form/ul/li[3]/button").click();
        Thread.sleep(5000);
        
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[1]/input").sendKeys("Goa");
		Thread.sleep(8000);
		
		driver.findElementByXPath("//*[@id=\"autofillId\"]/ul/li[4]/a/div/p").click();
		Thread.sleep(10000);
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[2]/input").click();
		Thread.sleep(7000);
		
		driver.findElementByXPath("/html/body/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[5]/td[5]").click();
		Thread.sleep(7000);
		
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[3]/input").click();
		Thread.sleep(8000);
		
		driver.findElementByXPath("/html/body/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[5]/td[6]/span").click();
	    Thread.sleep(8000);
	    
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[4]/input").click();
	    Thread.sleep(8000);
	   
	    WebElement place =  driver.findElementByXPath("//*[@id=\"collapseBasic\"]/div/ul/li[1]/select");
 		Select rom = new Select(place);
 		rom.selectByValue("1");
	
	
	   WebElement member = driver.findElementByXPath("//*[@id=\"collapseBasic\"]/div/ul/li[2]/select");
	  Select sel = new Select(member);
	  sel.selectByValue("3");
	  
	  driver.findElementByXPath("//*[@id=\"collapseBasic\"]/div/div[2]/button").click();
	  
	 driver.findElementByXPath("/html/body/app-root/app-home/div[1]/div[2]/app-home-hotel-search/div/div/div/form/div/div[5]/button").click();
	 Thread.sleep(5000);
	
	 driver.findElementByXPath("/html/body/app-root/app-hotel-details/div[4]/div/div/div[1]/h1").click();
	Thread.sleep(10000);
	
	String hotelName = driver.findElementByXPath("/html/body/app-root/app-hotel-details/div[4]/div/div/div[1]/h1").getText();
	  Thread.sleep(8000);
	  
	  System.out.println(hotelName);
	  
	 String hotelPrice = driver.findElementByXPath("/html/body/app-root/app-hotel-details/div[4]/div/div/div[3]/div[1]/div/div[1]/div[1]/div/span[2]").getText();
	  Thread.sleep(5000);
	  
	  System.out.println(hotelPrice);
	
	
	 Set<String> scrnId = driver.getWindowHandles();

     for (String page: scrnId) {
        
     driver.switchTo().window(page);
    
     }
    Thread.sleep(2000);
    
     driver.findElementByLinkText("Continue to Book").click();
	  Thread.sleep(30000);
	  
	  driver.findElementById("GuestUser-tab").click();
	 Thread.sleep(5000);
	  
	  driver.findElementByXPath("//*[@id=\"GuestUser\"]/div/form/ul/li[1]/input").sendKeys("kavithamurugan123@gmail.com");
      
     driver.findElementByXPath("//*[@id=\"GuestUser\"]/div/form/ul/li[2]/input").sendKeys("9876543214");
      Thread.sleep(5000);
      
      WebElement tle = driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[1]/select");
      Select nme =new Select(tle);
      nme.selectByValue("2");
      
      driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[2]/input").sendKeys("kavitha");
      Thread.sleep(7000);
      
      driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[3]/input").sendKeys("Murugesan");
      
      WebElement ste = driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[5]/select");
      Select stat = new Select(ste);
      stat .selectByValue("KA");
      Thread.sleep(5000);
      
      WebElement gss = driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[8]/select");
	  Select gst = new Select(gss);
	  gst.selectByValue("yes");
	  Thread.sleep(5000);
	  
	  driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[9]/input").sendKeys("7865");
	  
	  driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[10]/input").sendKeys("wipro");
	  
	  driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[11]/input").sendKeys("bhl road ");
	  
	  driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	  
	  driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/button").click();
	  
	  String gstNum= driver.findElementByXPath("/html/body/app-root/app-passenger-detail/div[4]/div/div[1]/div[1]/form/div/div[9]/div/div") .getText();
		if(gstNum.contains("Please Enter Valid GST Number")){
		
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		
		}
	  
	  driver.findElementByXPath("/html/body/app-root/app-passenger-summary/div[4]/div/div[1]/form/div/div/label").click();
	  
	
	  driver.quit();
	}
	

}

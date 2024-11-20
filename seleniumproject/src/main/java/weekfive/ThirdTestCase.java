package weekfive;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThirdTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	       
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); 

      
        driver.get("https://www.irctc.co.in/nget/train-search");

       
         driver.findElementByXPath(" /html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a ").click();
         Thread.sleep(3000);
         
       // driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]").click();
          driver.findElementByLinkText("Stays").click();
          Thread.sleep(5000);
          
          driver.findElementByLinkText("Lounge").click();
          Thread.sleep(5000);
     
       // driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span").click();
        
          Set<String> wId= driver.getWindowHandles();

          for (String sec : wId) {
            
        driver.switchTo().window(sec);
                
          
        }
        Thread.sleep(5000);
        
        driver.findElementById("sidebarCollapse").click();
        Thread.sleep(3000);
        
        driver.findElementByLinkText("Charter").click();
       Thread.sleep(3000);
       
        driver.findElementById("enquiry-tab").click();
        Thread.sleep(3000);
        
        driver.findElementByName("name").sendKeys("kavitha");
        
        driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[2]/input").sendKeys("abcdefg");
        
        driver.findElementByName("address").sendKeys("majestic main road near sik board");
        
        driver.findElementByName("mobile").sendKeys("98765432");
        
        driver.findElementByName("email").sendKeys("kavithaanup@gmail.com");
        
       WebElement reqst =  driver.findElementByName("requestFor");
       
       Select sel = new Select(reqst);
       
       sel . selectByVisibleText("Saloon Charter");
       
       driver.findElementByName("originStation").sendKeys("bangalore");
       
       driver.findElementByName("destnStation").sendKeys("goa");
       
       driver.findElementByName("checkInDate").click();
       
       driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/thead/tr[1]/th[2]").click();
       
       driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[3]/td[2]/span").click();
       
       driver.findElementByName("checkOutDate").click();
       
       driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/thead/tr[1]/th[2]").click();
       
       driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[3]/td[5]/span").click();
        
       driver.findElementByName("durationPeriod").sendKeys("3days");
       
       driver.findElementByName("coachDetails").sendKeys("C1,C2,AC coach");
       
       driver.findElementByName("numPassenger").sendKeys("2");
       
       driver.findElementByName("numPassenger").sendKeys("2");
       
       driver.findElementByName("charterPurpose").sendKeys("catering ,gourmet dining, enterainment");
       
       driver.findElementByName("services").sendKeys("meals,wifi");
       
       driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button").click();
       
       String numText = driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[4]/span").getText();
       
       if(numText.contains("Mobile no. not valid")) {
    	   System.out.println("pass");
       }
       else {
    	   System.out.println("fail");
       }
       driver.quit();
       
	}

}

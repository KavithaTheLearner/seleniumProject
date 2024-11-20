package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SscGovRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ssc.gov.in/");
		
		driver.manage().window().maximize();
		
		driver.get("https://ssc.gov.in/candidate-portal/one-time-registration/personal-details");
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("/html/body/app-root/app-layout/app-header/nav/div/div/div[2]/button").click();
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("/html/body/app-root/app-layout/app-home/app-banner-and-authentication/app-login/div/div/div[2]/div[2]/app-candidate/form/div[4]/div[2]/div/p[2]").click();
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(5000);
		
	    driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-home-page/div/div/div[4]/div/button").click();
	   
	    Thread.sleep(5000);
	    
	    driver.findElementByName("selected").click();
	    
	    driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[1]/div[2]/input").sendKeys("948882833156");
	   
	    driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[1]/div[3]/input").sendKeys("948882833156");
	    Thread.sleep(5000);
	    
	   
	    driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[3]/div[1]/input").sendKeys("ms Kavitha M");
	    Thread.sleep(5000);
	    
	    driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[3]/div[2]/input").sendKeys("ms kavitha m");
	   Thread.sleep(5000);
	  
	    driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[4]/div[1]/div/div[1]/input").click();
	    Thread.sleep(5000);
	    driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[4]/div[2]/input").sendKeys("kavi");
	    Thread.sleep(5000);
	    driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[4]/div[3]/input").sendKeys("kavi");
	    
	    driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
	    Thread.sleep(5000);
	       
        driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[7]/div[1]/input").sendKeys("R murugesan");
	    Thread.sleep(5000);
	    
        driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[7]/div[2]/input").sendKeys("R murugesan");
	    
        driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		
    	//	driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[6]/div[1]/mat-form-field/div[1]/div[2]/div[2]/mat-datepicker-toggle/button/span[4]").click();
    	//	driver.findElementByXPath("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[3]/td[4]/button/span[1]").click();
    		
    	//	driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[6]/div[2]/mat-form-field/div[1]/div[2]/div[2]/mat-datepicker-toggle/button/span[4]").click();
    		
    	//
    		
    	driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[7]/div[1]/input").sendKeys("Mr murugesan");
    		
        driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[7]/div[2]/input").sendKeys("Mr murugesan");
    		
    	driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[8]/div[1]/input").sendKeys("Mrs dhamayanthi");
    		
    	driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[8]/div[2]/input").sendKeys("Mrs dhamayanthi");
    		
    	driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[10]/div[1]/input").sendKeys("13345567");
    		
    	driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[10]/div[2]/input").sendKeys("13345567");
    		
    	driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[13]/div/div/div[1]/div[1]/div/input").sendKeys("9542356782");
    		
    	driver.findElementByXPath("/html/body/app-root/app-candidate-layout/div/main/app-one-time-registration/app-personal-details/div/div/div[2]/div/div/form/div[14]/div[1]/div[1]/div[1]/div[1]/div/input").sendKeys("kavitha1995@gmail.com");
	   
	    
	    
       
	}

}

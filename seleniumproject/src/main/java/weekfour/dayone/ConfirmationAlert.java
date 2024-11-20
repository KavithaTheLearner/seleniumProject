package weekfour.dayone;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 ChromeDriver driver =new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	 Thread.sleep(5000);
	 
	 
	 driver.switchTo().frame("iframeResult");
	 
	 driver.findElementByXPath("/html/body/button").click();
	 
	 String alertText = driver.switchTo().alert().getText();
	 System.out.println(alertText);
	 
	 
	 driver.switchTo().alert().accept();
	 
	 String applicationTextforok =driver.findElementById("demo").getText();
	 if (applicationTextforok.contains("You pressed OK!")) {
		 System.out.println("pass");
	 }else {
		 System.out.println("fail");
	 }
	 
	 
	 driver.navigate().refresh();
     Thread.sleep(5000); 


     driver.switchTo().frame("iframeResult");

   
     driver.findElementByXPath("/html/body/button").click();

  
     driver.switchTo().alert().dismiss();

     
     String applicationTextForCancel = driver.findElementById("demo").getText();
     if (applicationTextForCancel.contains("You pressed Cancel!")) {
         System.out.println("Pass");
     } else {
         System.out.println("Fail");
     }


     driver.switchTo().defaultContent();

  
     driver.findElementById("tryhome").click();

  
     driver.get("");
     
    
 }

}
	



package LoginTestcase;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import LoginPageObj.PageObj;

public class Login {
	WebDriver d;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver103\\chromedriver.exe");
	  d=new ChromeDriver();
	  
	  d.get("https://www.phptravels.net/login");
	  
	  d.manage().window().maximize();
	  
	  PageFactory.initElements(d, PageObj.class);
	  PageObj.email.sendKeys("user@phptravels.com");
	  PageObj.pswd.sendKeys("demouser");
	  PageObj.submit.click();
	 /* 
	  PageObj.email(d).sendKeys("user@phptravels.com");
	  PageObj.pswd(d).sendKeys("demouser");
	  PageObj.submit(d).click();
	  */
	  /*
	  
	  d.findElement(By.name("email")).sendKeys("user@phptravels.com");

	  d.findElement(By.name("password")).sendKeys("demouser");
	  
	  d.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
 */
 }
} 

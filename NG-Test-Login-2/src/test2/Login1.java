package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login1 {

	@Test
	public void t_02_validate_login_zero_app() throws InterruptedException {
		
		//URL
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");

//Login Fail

		WebElement UserName2 = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) form:nth-child(1) div.wow.fadeIn:nth-child(3) div.form-group:nth-child(1) label.pure-material-textfield-outlined.float-none > input:nth-child(1)"));
		UserName2.sendKeys("unvalid@user.com");
		WebElement Password2 = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) form:nth-child(1) div.wow.fadeIn:nth-child(3) div.form-group:nth-child(2) label.pure-material-textfield-outlined.float-none > input:nth-child(1)"));
		Password2.sendKeys("12345");
		WebElement Login2 = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) form:nth-child(1) > button.btn.btn-primary.btn-lg.btn-block.loginbtn:nth-child(4)"));
		Login2.click();
		Thread.sleep(1000);
		UserName2.clear();
		Password2.clear();
		Thread.sleep(2000);
		System.out.println("Login Fail");


//Login Successful

		
		
//Email
		
		
		WebElement Email = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) form:nth-child(1) div.wow.fadeIn:nth-child(3) div.form-group:nth-child(1) label.pure-material-textfield-outlined.float-none > input:nth-child(1)"));
		
		
//Change number symbol in Email "tech#@mailpoof.com" to the same as in SingUp Test
// 
		Email.sendKeys("tech150@mailpoof.com");
		WebElement Password1 = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) form:nth-child(1) div.wow.fadeIn:nth-child(3) div.form-group:nth-child(2) label.pure-material-textfield-outlined.float-none > input:nth-child(1)"));
		Password1.sendKeys("Qwerty123");
		WebElement Login1 = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) form:nth-child(1) > button.btn.btn-primary.btn-lg.btn-block.loginbtn:nth-child(4)"));
		Thread.sleep(2000);
		Login1.click();
		Thread.sleep(3000);
		
//Logout
		
		WebElement Arrow = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]"));
		Arrow.click();
		Thread.sleep(3000);
		WebElement Logout = driver.findElement(By.linkText("Logout"));
		Logout.click();
		Thread.sleep(5000);
		
	    
	// Test
	// Check point
			  
				String expectedTitle = "Login";
			    String actualTitle = driver.getTitle();
			    Assert.assertEquals(actualTitle, expectedTitle);
			    
    //Quit
			    driver.quit();
			    System.out.println("Done");

	}

}

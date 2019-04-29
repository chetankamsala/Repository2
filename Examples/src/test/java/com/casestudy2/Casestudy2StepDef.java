package com.casestudy2;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Casestudy2StepDef {
	WebDriver driver;
	@Given("Larry instances the web driver to open browser")
	public void larry_instances_the_web_driver_to_open_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\sele\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
	    
	}

	@And("Larry opens the app by using testmeapp url")
	public void larry_opens_the_app_by_using_testmeapp_url() {
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
	    
	}

	@And("Larry enters the valid credentials and clicks on login button")
	public void larry_enters_the_valid_credentials_and_clicks_on_login_button(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		String s=list.get(0).get("name");
		String s1=list.get(0).get("pwd");
		
		 driver.findElement(By.id("userName")).sendKeys(s);
		 driver.findElement(By.id("password")).sendKeys(s1);
		 driver.findElement(By.name("Login")).click();
	    
	}

	@And("Home page is displayed and Larry cliks on desired Product")
	public void home_page_is_displayed_and_Larry_cliks_on_desired_Product() {
		WebElement s = driver.findElement(By.id("myInput"));
		 s.sendKeys("Hand bag");
		 driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/center/a")).click();
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	   
	}

	@And("Larry clicks on Add to cart and proceeds to pay")
	public void larry_clicks_on_Add_to_cart_and_proceeds_to_pay() {
driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement radio=driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label"));
		radio.click();
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	}

	@And("Larry selects the desired bank for payment")
	public void larry_selects_the_desired_bank_for_payment() {
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	    
	}

	@And("Larry proceeds for payment and signout from the app")
	public void larry_proceeds_for_payment_and_signout_from_the_app() {
	   
	}


}

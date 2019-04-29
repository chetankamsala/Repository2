package com.testmeapp;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class TestMeAppStepDef {
	WebDriver driver;
	@Given("Tester creates WebDriver Instance")
	public void tester_creates_WebDriver_Instance() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\sele\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	@And("opens the url")
	public void opens_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
	}

	@And("enters the credentials and login")
	public void enters_the_credentials_and_login(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		String s=list.get(0).get("name");
		String s1=list.get(0).get("pwd");
		
		 driver.findElement(By.id("userName")).sendKeys(s);
		 driver.findElement(By.id("password")).sendKeys(s1);
		 driver.findElement(By.name("Login")).click();
	}

	@And("enter value in search and click find details button")
	public void enter_value_in_search_and_click_find_details_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 WebElement s = driver.findElement(By.id("myInput"));
		 s.sendKeys("HeadPhone");
		 //driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Head Phone");
			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
			String message=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
			Assert.assertEquals(message,"Shopping Cart");
			driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	}

@Then("add the product to cart and checkout")
public void add_the_product_to_cart_and_checkout() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	//Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement radio=driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label"));
	radio.click();
	driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	//Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	String message2=driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/h2")).getText();
	Assert.assertEquals(message2,"Login to continue");
}

@Then("proceed to payment")
public void proceed_to_payment() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	String message3=driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/h2")).getText();
	Assert.assertEquals(message3,"Amount - 3500");
	//Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	String message4=driver.findElement(By.xpath("/html/body/b/section/div/div/div/div[2]/p")).getText();
	Assert.assertEquals(message4,"Your order has been confirmed");
	//Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

@And("signout from the TestMeApp")
public void signout_from_the_TestMeApp() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.close();
}




}

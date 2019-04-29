package com.casestudy3;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Casestudy3StepDef {
	WebDriver driver;
	@Given("Alex instances the web driver to open browser")
	public void alex_instances_the_web_driver_to_open_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\sele\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@And("He opens the app by using testmeapp url")
	public void he_opens_the_app_by_using_testmeapp_url() {
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
	    
	}

	@And("He enters the valid admin credentials and clicks on login button")
	public void he_enters_the_valid_admin_credentials_and_clicks_on_login_button(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		String s=list.get(0).get("name");
		String s1=list.get(0).get("pwd");
		
		 driver.findElement(By.id("userName")).sendKeys(s);
		 driver.findElement(By.id("password")).sendKeys(s1);
		 driver.findElement(By.name("Login")).click();
		 driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/button/span")).click();
		 
	}

	@And("adds category")
	public void adds_category(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		String s2=list.get(0).get("Category Name");
		String s3=list.get(0).get("Category description");
		driver.findElement(By.xpath("//*[@id=\"catgName\"]")).sendKeys(s2);
		driver.findElement(By.xpath("//*[@id=\"catgDesc\"]")).sendKeys(s3);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")).click();
		driver.findElement(By.xpath("//a[@href='adminHome.htm']")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[3]/button/span")).click();
		String s4=list.get(0).get("cat");
		String s5=list.get(0).get("sub");
		String s6=list.get(0).get("abc");
		
		driver.findElement(By.xpath("//*[@id=\"subCatgId\"]")).sendKeys(s4);
		driver.findElement(By.xpath("//*[@id=\"subCatgName\"]")).sendKeys(s5);
		driver.findElement(By.xpath("//*[@id=\"subCatgDesc\"]")).sendKeys(s6);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")).click();
		driver.findElement(By.xpath("//a[@href='adminHome.htm']")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"categorydropid\"]")).sendKeys("CATEGORIES");
		driver.findElement(By.xpath("//*[@id=\"prodid\"]")).sendKeys("JABRA");
		driver.findElement(By.xpath("//*[@id=\"priceid\"]")).sendKeys("$25000");
		driver.findElement(By.xpath("//*[@id=\"quantityid\"]")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys("JABRA-1.08");
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("product with awesome bass");
		WebElement img = driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/span/div/div/div/input"));
	     img.sendKeys("C:\\Users\\chetan.kamsala\\Downloads\\scan0016 (1).jpg");
	     driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
		
	   
	}

	@Then("close the application")
	public void close_the_application() {
		driver.findElement(By.xpath("//a[@href='adminHome.htm']")).click();
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
		driver.close();
	    
	}



}

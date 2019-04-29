package com.casestudy4_1;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class case4_1sdef {
	WebDriver driver;
	@Given("Admin enters username and password in testme app")
	public void admin_enters_username_and_password_in_testme_app(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		System.setProperty("webdriver.chrome.driver","C:\\sele\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		//List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		String s=list.get(0).get("username");
		String s1=list.get(0).get("password");
	    driver.findElement(By.id("userName")).sendKeys(s);
		driver.findElement(By.id("password")).sendKeys(s1);
	}

	@And("Admin clicks on login button")
	public void admin_clicks_on_login_button() {
		driver.findElement(By.name("Login")).click();
	}
	
	@And("adds categor")
	public void adds_categor(io.cucumber.datatable.DataTable dataTable) {
		//List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		
		//List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/button/span")).click();
		List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		String s2=list.get(0).get("cat name");
		String s3=list.get(0).get("cat desp");
		driver.findElement(By.xpath("//*[@id=\"catgName\"]")).sendKeys(s2);
		driver.findElement(By.xpath("//*[@id=\"catgDesc\"]")).sendKeys(s3);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")).click();
		driver.findElement(By.xpath("//a[@href='adminHome.htm']")).click();
	}

	@And("adds sub category")
	public void adds_sub_category(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[3]/button/span")).click();
		List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		String s4=list.get(0).get("cate name");
		String s5=list.get(0).get("sub cate name");
		String s6=list.get(0).get("sub cate desp");
		driver.findElement(By.xpath("//*[@id=\"subCatgId\"]")).sendKeys(s4);
		driver.findElement(By.xpath("//*[@id=\"subCatgName\"]")).sendKeys(s5);
		driver.findElement(By.xpath("//*[@id=\"subCatgDesc\"]")).sendKeys(s6);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")).click();
		driver.findElement(By.xpath("//a[@href='adminHome.htm']")).click();
	}

	@And("adds products")
	public void adds_products(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/span")).click();
		List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);
		String s7=list.get(0).get("category name");
		driver.findElement(By.xpath("//*[@id=\"categorydropid\"]")).sendKeys(s7);

		//List<Map<String,String>> list = dataTable.asMaps(String.class, String.class);

		String s8=list.get(0).get("product name");
		driver.findElement(By.xpath("//*[@id=\"prodid\"]")).sendKeys(s8);
		String s12=list.get(0).get("price");
		String s9=list.get(0).get("quantity");
		String s10=list.get(0).get("brand");
		String s11=list.get(0).get("description");
		driver.findElement(By.xpath("//*[@id=\"priceid\"]")).sendKeys(s12);
		driver.findElement(By.xpath("//*[@id=\"quantityid\"]")).sendKeys(s9);
		driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys(s10);
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys(s11);
		WebElement img = driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/span/div/div/div/input"));
		 img.sendKeys("C:\\Users\\chetan.kamsala\\Downloads\\scan0016 (1).jpg");
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
	}
	
	/*@And("signout from the app")
	public void signout_from_the_app() {
		driver.findElement(By.xpath("//a[@href='adminHome.htm']")).click();
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
		//driver.close();
	}*/

}

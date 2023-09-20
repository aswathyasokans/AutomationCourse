package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	
public void intializebrowser()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ASWATHY ASOKAN\\Eclipse_work_space\\AutomationCourse\\src\\main\\java\\com\\obsqura\\AutomationCourse\\Resource\\chromedriver.exe" );
	driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.manage().window().maximize();
}
public void driverclose()
{
	//driver.close();
	driver.quit();
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Base base=new Base();	
             base.intializebrowser();
             base.driverclose();             }

}

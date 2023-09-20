package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void webLocators()
	{
		WebElement showmessagebutton=driver.findElement(By.id("button-one"));
		WebElement clearfix=driver.findElement(By.className("clearfix"));
		WebElement showmessagebuttonusingcssselector=driver.findElement(By.cssSelector("button#button-one"));
		WebElement clearfixsection=driver.findElement(By.cssSelector("section.clearfix"));
		WebElement  showmessagecssselectorattribute=driver.findElement(By.cssSelector("button[id=button-one]"));
		WebElement checkeddemo=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement checked=driver.findElement(By.partialLinkText("Checkbox"));	
		WebElement showmesagexpath=driver.findElement(By.xpath("//button[@class='navbar-toggler']"));
		WebElement showmwssagecontains=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement checkbox=driver.findElement(By.xpath("//a[starts-with(@href,'radio-button-demo.php')]"));
		WebElement checkboxstart=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement andbutton=driver.findElement(By.xpath("//button[(@class='btn btn-primary' and @id='button-one')]"));
		WebElement showmessageor=driver.findElement(By.xpath("//button[@id='button-one' or @button[text()='Show Message']]"));
		
		
				
		WebElement yourmessage=driver.findElement(By.xpath("//div[contains(@id,'message-one')]"));
		WebElement message=driver.findElement(By.xpath("//div[contains(@id,'message-two')]"));
		WebElement submitform=driver.findElement(By.xpath("//button[contains(@ class,'btn btn-primary')]"));
		
		WebElement checkeddemolinktext=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement submit=driver.findElement(By.partialLinkText("Simple Form "));
		WebElement Radiobutton=driver.findElement(By.partialLinkText("Radio Buttons"));
		WebElement selectinput=driver.findElement(By.partialLinkText("Select "));
		
		WebElement radiobutton=driver.findElement(By.xpath("//a[starts-with(@href,'radio-button-demo.php')]"));
		WebElement selectinputstartswith=driver.findElement(By.xpath("//a[starts-with(@href,'radio-button-demo.php')]"));
		WebElement formsubmit=driver.findElement(By.xpath("//a[starts-with(@href,'radio-button-demo.php')]"));
		
		WebElement entermessage=driver.findElement(By.xpath("//label[text()='Enter Message']"));
		WebElement enteravalue=driver.findElement(By.xpath("//label[text()='Enter value A']"));
		WebElement enterbvalue=driver.findElement(By.xpath("//label[text()='Enter value B']"));
		
		WebElement gettotaland=driver.findElement(By.xpath("//button[@class='btn btn-primary' and @id='button-two']"));
		
		driver.navigate().to("https://parabank.parasoft.com");
		WebElement privacryparabank=driver.findElement(By.xpath("//p[@class='copyright' or @p[text()='Parasoft. All right resverved.']]"));
		WebElement expriencethedifferent=driver.findElement(By.xpath("//p[@class='caption' or p[text()='Experience the difference']]"));
		WebElement formlogin=driver.findElement(By.xpath("//form[@name='login' or@action='/parabank/login.htm']"));
		
		WebElement usernamelogin=driver.findElement(By.xpath("//input[@class='input'  and @name='username']"));
		WebElement passwordlogin=driver.findElement(By.xpath("//input[@class='input' and @ name='password']"));
		WebElement loginparabank=driver.findElement(By.xpath("//input[@class='button' and @value='Log In']"));
		
		WebElement parentofatmservice=driver.findElement(By.xpath("//li[@class='captionone']/.."));
		WebElement parentofoilservice=driver.findElement(By.xpath("//li[@class='captiontwo']/.."));
		WebElement latestnewsparent=driver.findElement(By.xpath("//li[@class='captionthree']/.."));
		
		driver.navigate().to("https://www.amazon.in");
		WebElement amazonlogo=driver.findElement(By.id("nav-logo-sprites"));
		WebElement amazonselectyouraddress=driver.findElement(By.id("glow-ingress-line2"));
		WebElement amazonsearch=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement amazonen=driver.findElement(By.id("icp-nav-flyout"));
		WebElement amazonhellosign=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		driver.navigate().to("https://demo.guru99.com/v1/");
		WebElement loginguru99=driver.findElement(By.name("btnLogin"));
		WebElement resetguru99=driver.findElement(By.name("btnReset"));
	
		driver.navigate().to("https://automationpanda.com");
		WebElement heading=driver.findElement(By.cssSelector("h2.site-description"));
		WebElement searchfield=driver.findElement(By.cssSelector("input.search-field"));
		WebElement homelink=driver.findElement(By.cssSelector("a.home-link"));
		
		WebElement homemenuitem=driver.findElement(By.cssSelector("li#menu-item-8"));
		WebElement asidetag=driver.findElement(By.cssSelector("aside#wp_tag_cloud-3"));
		WebElement email=driver.findElement(By.cssSelector("p#subscribe-email"));
		
		WebElement homemenuitemattribute=driver.findElement(By.cssSelector("li[id=menu-item-8]"));
		WebElement emailattribute=driver.findElement(By.cssSelector("p[id=subscribe-email]"));
		WebElement asidetagattribute=driver.findElement(By.cssSelector("aside[id=wp_tag_cloud-3]"));
		
		driver.navigate().to("https://wallpapers.com/");
		WebElement navigation=driver.findElement(By.className("navgation"));
		WebElement stmarker=driver.findElement(By.className("st-marker"));
		WebElement searchform=driver.findElement(By.className("search-form"));
		WebElement megasplash=driver.findElement(By.className("mega-splash"));
		WebElement mt2=driver.findElement(By.className("mt-2"));
		
		WebElement privacy=driver.findElement(By.linkText("Privacy Policy"));
		WebElement contactus=driver.findElement(By.linkText("Contact Us"));
		WebElement faqs=driver.findElement(By.linkText("FAQs"));
		WebElement disclimer=driver.findElement(By.linkText("Disclaimer"));
		
		WebElement navxpath=driver.findElement(By.xpath("//nav[@class='navgation']"));
		WebElement divserachform=driver.findElement(By.xpath("//div[@class='search-form']"));
		WebElement divflex=driver.findElement(By.xpath("//div[@class='d-flex']"));
		WebElement picture=driver.findElement(By.xpath("//picture[@class='mega-splash']"));
		WebElement awesompletelist=driver.findElement(By.xpath("//ul[@id='awesomplete_list_2']"));
			 
	
	}
	

	private WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locator=new Locators();
		locator.intializebrowser();
		locator.webLocators();
		locator.driverclose();

	}

}
 
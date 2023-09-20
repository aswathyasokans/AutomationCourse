package com.obsqura.AutomationCourse;

public class NavigationCommands extends Base {
	public void navigation()
	{
		driver.navigate().to("https://www.toolsqa.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh(); 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands navigationcommands=new NavigationCommands();
		navigationcommands.intializebrowser();
		navigationcommands.navigation();
		navigationcommands.driverclose();
		
		}

}

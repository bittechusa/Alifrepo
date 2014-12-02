package JannatAlif;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook 
{
	public static void main(String[] args) 
	{
		FirefoxDriver x=new FirefoxDriver();
		x.get("http://www.facebook.com");
		x.getTitle();
		x.quit();
	}
}

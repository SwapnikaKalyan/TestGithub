package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programexecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver bo=new ChromeDriver();
bo.get("https://www.redbus.in/");
bo.manage().window().maximize();
String Name=bo.getTitle();
System.out.println(Name);
String URL=bo.getCurrentUrl();
System.out.println(URL);
String Page=bo.getPageSource();
System.out.println(Page);

//Navigation Commands
bo.navigate().to("https://www.facebook.com/");
bo.navigate().back();
bo.navigate().forward();
bo.navigate().refresh();
bo.close();




	}
}

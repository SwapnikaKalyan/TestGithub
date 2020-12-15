package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver do2=new ChromeDriver();
		
		do2.get("https://www.seek.co.nz/");
		
		String Url=do2.getCurrentUrl();
		System.out.println(Url);
		
		//String PageSource=do2.getPageSource();
		//System.out.println(PageSource);
		
		String Title=do2.getTitle();
		System.out.println(Title);
		
		String WindowHandle=do2.getWindowHandle();
		System.out.println(WindowHandle);
		
	  // int a=do2.hashCode();
	   //System.out.println(a);
	
	  // do2.manage();
		
		do2.navigate();
		
		do2.close();
	}

}

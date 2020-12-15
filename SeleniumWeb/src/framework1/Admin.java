package framework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {
void TC5_Logout() {
	System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver bo=new ChromeDriver();
	bo.get("http://apps.qaplanet.in/hrm/login.php");
	bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
	bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
	bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	bo.findElement(By.xpath("//body/div[@id='option-menu-bar']/ul[@id='option-menu']/li[3]/a[1]")).click();
	System.out.println(bo.getTitle());
	if(bo.getTitle().equals("OrangeHRM")) {
		System.out.println("Pass");
	}
	else{
		System.out.println("Fail");
		
	}
	bo.close();

}	
}


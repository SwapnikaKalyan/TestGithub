package MavenGrpId_1.MavenArtId_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminTest {
	
	WebDriver bo;
	String buildpath= "http://apps.qaplanet.in/hrm/login.php";

	
	@Test(enabled=true, priority=5, groups="admin")
	 void TC5() {
			bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
			bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
			bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
			bo.findElement(By.xpath("//body/div[@id='option-menu-bar']/ul[@id='option-menu']/li[3]/a[1]")).click();
			System.out.println(bo.getTitle());
			Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	 }
		
	  @BeforeMethod
	  void buildexecution(){
		  System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
			bo=new ChromeDriver();
			bo.get(buildpath);
		  
	  }
	  @AfterMethod
	  void buildclose(){
		  bo.close();
				
	  

}
}

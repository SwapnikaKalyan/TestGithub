package MavenGrpId_1.MavenArtId_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver bo;
	String buildpath= "http://apps.qaplanet.in/hrm/login.php";
  @Test(enabled=true, priority=1, groups="login")
  public void TC1() {
		bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(bo.getTitle());
		//org.testng.Assert.assertEquals(bo.getTitle(), "OrangeHRM");
		Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	  
  }
  
  @Test(enabled=true, priority=2, groups="login")
  void TC2() {
		bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText());
		Assert.assertEquals(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText(), "Invalid Login");
  }
  
  @Test(enabled=true, priority=3, groups="login")
  void TC3(){
		bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText());
		Assert.assertEquals(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText(), "Invalid Login");
  }
  
  @Test(enabled=true, priority=4, groups="login")
  void TC4(){
		bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText());
		Assert.assertEquals(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText(), "Invalid Login");
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




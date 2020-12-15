package testNG_Framework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Framework {
  @Test
  public void TC1_Valid_Login() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(bo.getTitle());
		//org.testng.Assert.assertEquals(bo.getTitle(), "OrangeHRM");
		Assert.assertEquals(bo.getTitle(), "OrangeHRM");
		
		/*if(bo.getTitle().equals("OrangeHRM")) {
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
			
		}*/
		bo.close();  
  }
  @Test
  void TC2_Invalid_Password(){
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText());
		Assert.assertEquals(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText(), "Invalid Login");
		/*if(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText().equals("Invalid Login")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}*/

		bo.close();
	}
  
  @Test
  void TC3_Invalid_Username(){
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText());
		Assert.assertEquals(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText(), "Invalid Login");
		/*if(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText().equals("Invalid Login")) {
			System.out.println("Pass");	
		}
		else {
			System.out.println("Fail");
		}*/
		bo.close();

	}
  
  @Test
  void TC4_Invalid_Username_and_Password() {
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText());
		Assert.assertEquals(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText(), "Invalid Login");
		/*if(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText().equals("Invalid Login")){
			System.out.println("Pass");	
		}
		else {
			System.out.println("Fail");
		}*/
		bo.close();
	}
  
  @Test
  void TC5_Logout() {
		System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		bo.findElement(By.xpath("//body/div[@id='option-menu-bar']/ul[@id='option-menu']/li[3]/a[1]")).click();
		System.out.println(bo.getTitle());
		Assert.assertEquals(bo.getTitle(), "OrangeHRM");
		/*if(bo.getTitle().equals("OrangeHRM")) {
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
			
		}*/
		bo.close();

	}	

}

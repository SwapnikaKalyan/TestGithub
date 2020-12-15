package framework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
WebDriver bo;
String buildpath="http://apps.qaplanet.in/hrm/login.php";
void TC1_Valid_Login(){
	System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	bo=new ChromeDriver();
	bo.get(buildpath);
	bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
	bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
	bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	System.out.println(bo.getTitle());
	if(bo.getTitle().equals("OrangeHRM")) {
		System.out.println("Pass");
	}
	else{
		System.out.println("Fail");
		
	}
	bo.close();
}

void TC2_Invalid_Password(){
	System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	bo=new ChromeDriver();
	bo.get(buildpath);
	bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
	bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab");
	bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	System.out.println(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText());
	if(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText().equals("Invalid Login")) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}

	bo.close();
}

void TC3_Invalid_Username(){
	System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	bo=new ChromeDriver();
	bo.get(buildpath);
	bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet");
	bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
	bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	System.out.println(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText());
	if(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText().equals("Invalid Login")) {
		System.out.println("Pass");	
	}
	else {
		System.out.println("Fail");
	}
	bo.close();

}


void TC4_Invalid_Username_and_Password() {
	System.setProperty("webdriver.chrome.driver", "E:\\Swapnika\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	bo=new ChromeDriver();
	bo.get(buildpath);
	bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet");
	bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab");
	bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	System.out.println(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText());
	if(bo.findElement(By.xpath("//tbody/tr[5]/td[2]/strong[1]/font[1]")).getText().equals("Invalid Login")){
		System.out.println("Pass");	
	}
	else {
		System.out.println("Fail");
	}
	bo.close();
}



}

	



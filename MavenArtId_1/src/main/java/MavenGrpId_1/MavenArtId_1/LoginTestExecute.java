package MavenGrpId_1.MavenArtId_1;

import org.testng.annotations.Test;

public class LoginTestExecute {
	
	@Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTest obj=new LoginTest();
		obj.buildexecution();
		obj.TC1();
		obj.TC2();
		obj.TC3();
		obj.TC4();
		obj.buildclose();

	}

}

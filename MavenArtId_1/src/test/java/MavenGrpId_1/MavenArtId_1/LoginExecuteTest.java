package MavenGrpId_1.MavenArtId_1;

import org.testng.annotations.Test;

public class LoginExecuteTest {
	
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LoginTest obj=new LoginTest();

obj.buildexecution();
obj.TC1();
obj.buildclose();

obj.buildexecution();
obj.TC2();
obj.buildclose();

obj.buildexecution();
obj.TC3();
obj.buildclose();

obj.buildexecution();
obj.TC4();
obj.buildclose();

	}

}

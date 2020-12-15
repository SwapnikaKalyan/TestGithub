package framework1;

public class Frameworkexecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login lg=new Login();
		lg.TC1_Valid_Login();
		lg.TC2_Invalid_Password();
		lg.TC3_Invalid_Username();
		lg.TC4_Invalid_Username_and_Password();
		Admin Adm=new Admin();
		Adm.TC5_Logout();
		

	}

}

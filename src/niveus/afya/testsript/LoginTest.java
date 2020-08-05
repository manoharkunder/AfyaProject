package niveus.afya.testsript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.niveus.objecRepository.Carddetails;
import com.niveus.objecRepository.LoginPage;
import com.niveus.objecRepository.Registeration;

import afya.genericlib.Base;
import afya.genericlib.FileLib;

public class LoginTest  extends Base
{
	public LoginPage logp;
	public Registeration registerp;
	public Carddetails card;
	FileLib flib = new FileLib();

	@Test
	public void loginPageTest() throws Exception {
		System.out.println("browser is launhed");
		System.out.println("enter the url sucesfully");
		logp = PageFactory.initElements(driver, LoginPage.class);
		card = PageFactory.initElements(driver, Carddetails.class);
		
		   logp.login(flib.getExcelData(
		  "./src/com/niveus/Afya/testdata/Afyacredential.xlsx", "credential", 3,
		  0),flib.getExcelData("./src/com/niveus/Afya/testdata/Afyacredential.xlsx",
		  "credential", 1, 1)); 
		   System.out.println("sucessfully logedin");
	}

}

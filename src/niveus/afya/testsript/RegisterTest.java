package niveus.afya.testsript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.niveus.objecRepository.Carddetails;
import com.niveus.objecRepository.LoginPage;
import com.niveus.objecRepository.ProfilePage;
import com.niveus.objecRepository.Registeration;

import afya.genericlib.Base;
import afya.genericlib.FileLib;
import afya.genericlib.Utility;

public class RegisterTest extends Base {
	public LoginPage logp;
	public Registeration registerp;
	public Carddetails card;
	FileLib flib = new FileLib();
     public ProfilePage propage;
     Utility util=new Utility();
	@Test
	public void RegistrationTest() throws Exception {
		System.out.println("browser is launhed");
		System.out.println("enter the url sucesfully");
		logp = PageFactory.initElements(driver, LoginPage.class);
		card = PageFactory.initElements(driver, Carddetails.class);
		registerp = PageFactory.initElements(driver, Registeration.class);
		propage=PageFactory.initElements(driver, ProfilePage.class);

		int initialrowno = 1;
		int finalrowno = 7;
		int initiacolno = 0;
		int finalcolumnno = 10;
		
		for (initialrowno = 1; initialrowno < finalrowno; initialrowno++) 
		{
			
			
			for (initiacolno = 0; finalcolumnno >= initiacolno;)

			{
				logp.getregisteration().click();
                  
				registerp.userRegisteration(
						flib.getExcelData("./src/com/niveus/Afya/testdata/Crdentila for Afya web.xlsx", "Data",
								initialrowno, initiacolno),
						flib.getExcelData("./src/com/niveus/Afya/testdata/Crdentila for Afya web.xlsx", "Data",
								initialrowno, initiacolno + 1),
						flib.getExcelData("./src/com/niveus/Afya/testdata/Crdentila for Afya web.xlsx", "Data",
								initialrowno, initiacolno + 2),
						flib.getExcelData("./src/com/niveus/Afya/testdata/Crdentila for Afya web.xlsx", "Data",
								initialrowno, initiacolno + 3),
						flib.getExcelData("./src/com/niveus/Afya/testdata/Crdentila for Afya web.xlsx", "Data",
								initialrowno, initiacolno + 4),
						flib.getExcelData("./src/com/niveus/Afya/testdata/Crdentila for Afya web.xlsx", "Data",
								initialrowno, initiacolno + 5),
						flib.getExcelData("./src/com/niveus/Afya/testdata/Crdentila for Afya web.xlsx", "Data",
								initialrowno, initiacolno + 6),
						flib.getExcelData("./src/com/niveus/Afya/testdata/Crdentila for Afya web.xlsx", "Data",
								initialrowno, initiacolno + 7),
						flib.getExcelData("./src/com/niveus/Afya/testdata/Crdentila for Afya web.xlsx", "Data",
								initialrowno, initiacolno + 8),
						flib.getExcelData("./src/com/niveus/Afya/testdata/Crdentila for Afya web.xlsx", "Data",
								initialrowno, initiacolno + 9),
						flib.getExcelData("./src/com/niveus/Afya/testdata/Crdentila for Afya web.xlsx", "Data",
								initialrowno, initiacolno + 10));
				card.cardDetails("4242424242424242", "Test", "12", "123", "20");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	             util.hoverMouse(driver, propage.getProfilehov());  
	             propage.getSignOut().click();
	              
                   }
                   
                   
			}
          
		}
		
}

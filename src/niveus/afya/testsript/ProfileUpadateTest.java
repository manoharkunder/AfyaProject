package niveus.afya.testsript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.niveus.objecRepository.Carddetails;
import com.niveus.objecRepository.LoginPage;
import com.niveus.objecRepository.ProfilePage;
import com.niveus.objecRepository.Registeration;

import afya.genericlib.Base;
import afya.genericlib.FileLib;
import afya.genericlib.Utility;

public class ProfileUpadateTest  extends Base
{

	public LoginPage logp;
	public ProfilePage profile;
	public Registeration registerp;
	public Carddetails card;
	FileLib flib = new FileLib();
	Utility util=new Utility();
	
	@Test
	public void updateProfileInformation() throws Exception
	{
		logp=PageFactory.initElements(driver, LoginPage.class);
         logp.login(flib.getExcelData("./src/com/niveus/Afya/testdata/Afyacredential.xlsx", "credential", 5, 0), flib.getExcelData("./src/com/niveus/Afya/testdata/Afyacredential.xlsx", "credential", 5, 1));		
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         Thread.sleep(5000);
         profile=PageFactory.initElements(driver, ProfilePage.class);
        util.moveToElement(driver, profile.getProfilehov());  
   
       profile.updateProfile("Madukhar", "Acharya", "11111999", "Female", "good patient in upupi");
	}

}

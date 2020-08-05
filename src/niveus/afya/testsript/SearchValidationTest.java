package niveus.afya.testsript;


import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.niveus.objecRepository.Carddetails;
import com.niveus.objecRepository.FilterSection;
import com.niveus.objecRepository.HomePage;
import com.niveus.objecRepository.LoginPage;
import com.niveus.objecRepository.Registeration;

import afya.genericlib.Base;
import afya.genericlib.FileLib;

public class SearchValidationTest extends Base

{
	
	public LoginPage logp;
	public Registeration registerp;
	public Carddetails card;
	public HomePage homepge;
	public FilterSection filter;
	FileLib flib = new FileLib();
	
	
	@Test
	public void patientSearchTest() throws Exception
	{
     
		System.out.println("browser is launhed");
		System.out.println("enter the url sucesfully");	
		logp = PageFactory.initElements(driver, LoginPage.class);
		
		/*card = PageFactory.initElements(driver, Carddetails.class);
		filter = PageFactory.initElements(driver, FilterSection.class);*/
        
		logp.login(flib.getExcelData("./src/com/niveus/Afya/testdata/Afyacredential.xlsx", "credential", 6, 0),
				flib.getExcelData("./src/com/niveus/Afya/testdata/Afyacredential.xlsx", "credential", 6, 1));
       
		homepge = PageFactory.initElements(driver, HomePage.class);
		
		Thread.sleep(10000);
		
		homepge.getNewbtn().click();
		Thread.sleep(5000);
				
		homepge.getSpeciality().sendKeys(flib.getExcelData("./src/com/niveus/Afya/testdata/specilaities.xlsx", "spec", 5, 0),Keys.ENTER);
		
		Thread.sleep(2000);
		
		homepge.getChiefcomplaint().sendKeys(flib.getExcelData("./src/com/niveus/Afya/testdata/specilaities.xlsx", "spec", 2, 1));
		
		/*homepge.createNewpatient(flib.getExcelData("./src/com/niveus/Afya/testdata/specilaities.xlsx", "spec", 5, 0),
				flib.getExcelData("./src/com/niveus/Afya/testdata/specilaities.xlsx", "spec", 2, 1));*/
		
		homepge.getNewpatient().click();
		
		Thread.sleep(10000);
		
		//filter.getFilter().click();
		
		//filter.getAllchat().click();
		
		
		
		homepge.getChatsesion().click();
		
        		
		homepge.getTextarea().sendKeys("hello  how are u");
		
		homepge.getSendbutton().click();
		
		homepge.getSearch().sendKeys("");
		}
	
}

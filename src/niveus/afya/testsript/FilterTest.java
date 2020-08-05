package niveus.afya.testsript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.niveus.objecRepository.Carddetails;
import com.niveus.objecRepository.FilterSection;
import com.niveus.objecRepository.HomePage;
import com.niveus.objecRepository.LoginPage;
import com.niveus.objecRepository.Registeration;

import afya.genericlib.Base;
import afya.genericlib.FileLib;

public class FilterTest extends Base{
       
	public LoginPage logp;
	public Registeration registerp;
	public Carddetails card;
	public HomePage homepge;
	public FilterSection filter;
	FileLib flib = new FileLib();
	
	@Test
	public void filterValidationTest() throws Exception
	{
		System.out.println("browser is launhed");
		System.out.println("enter the url sucesfully");
		logp = PageFactory.initElements(driver, LoginPage.class);
		card = PageFactory.initElements(driver, Carddetails.class);
		filter = PageFactory.initElements(driver, FilterSection.class);

		logp.login(flib.getExcelData("./src/com/niveus/Afya/testdata/Afyacredential.xlsx", "credential", 5, 0),
				flib.getExcelData("./src/com/niveus/Afya/testdata/Afyacredential.xlsx", "credential", 5, 1));

		homepge = PageFactory.initElements(driver, HomePage.class);
         Thread.sleep(12000);
		homepge.getNewbtn().click();
		homepge.createNewpatient(flib.getExcelData("./src/com/niveus/Afya/testdata/specilaities.xlsx", "spec", 5, 0),
				flib.getExcelData("./src/com/niveus/Afya/testdata/specilaities.xlsx", "spec", 2, 1));
		/*WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(filter.getFilter()));
*/		
		Thread.sleep(15000);
		filter.getFilter().click();
		filter.getAllchat().click();
        Thread.sleep(10000);
	    String newtime = filter.getTimeStamp().getText();
	    System.out.println(newtime);
		filter.getSorting().click();
		filter.getOldest().click();
	    String oldtime=filter.getTimeStamp().getText();
	    System.out.println(oldtime);
	     if(newtime.equals(oldtime))
	       System.out.println("unsucessfull");
	     else 
	    	 System.out.println("sucessfull");
	
}
	
}
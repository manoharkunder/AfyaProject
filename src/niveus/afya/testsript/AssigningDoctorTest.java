package niveus.afya.testsript;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.niveus.objecRepository.Carddetails;
import com.niveus.objecRepository.FilterSection;
import com.niveus.objecRepository.HomePage;
import com.niveus.objecRepository.LoginPage;
import com.niveus.objecRepository.Registeration;

import afya.genericlib.Base;
import afya.genericlib.FileLib;

public class AssigningDoctorTest extends Base {
	public LoginPage logp;
	public Registeration registerp;
	public Carddetails card;
	public HomePage homepge;
	public FilterSection filter;
	FileLib flib = new FileLib();

	@Test
	public void createNewPatientTest() throws Exception {

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
*/		Thread.sleep(15000);
		filter.getFilter().click();
		filter.getAllchat().click();
		Thread.sleep(10000);
		homepge.getChatsesion().click();
		Thread.sleep(4000);
		homepge.getTextarea().sendKeys("hello  how are u");
		homepge.getSendbutton().click();
		homepge.getPaperclip().click();
		
		
		/*
		   below is the code to  to  fetch the data from gallery and click on  the doccument icon
		 * /
/*		homepge.getDoc().click();
		
		Thread.sleep(5000);
		
		//create object of String selection class and pass the file path as argument
		StringSelection path = new StringSelection("C:\\Users\\user\\Downloads\\Afya copy issues (1).docx");

		//get the Toolkit of OS
		Toolkit tk = Toolkit.getDefaultToolkit();

		//get the clipboard to write the path
		Clipboard cb = tk.getSystemClipboard();

		//write the path to clipboard
		cb.setContents(path, null);

		//create object of Robot class to perform paste and enter opration
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
*/
		
		/*
		 *below is the code to click on the camera icon
		 */
		/*homepge.getCamera().click();
	    
		Robot robot = new Robot();
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);	
		Thread.sleep(7000);
		homepge.getCameraclick().click();
		homepge.getSendpic().click();
*/		
		
		
		homepge.getGallery().click();
		
		
	Thread.sleep(5000);
		
		//create object of String selection class and pass the file path as argument
		StringSelection path = new StringSelection("C:\\Users\\user\\Downloads\\Afya copy issues (1).docx");

		//get the Toolkit of OS
		Toolkit tk = Toolkit.getDefaultToolkit();

		//get the clipboard to write the path
		Clipboard cb = tk.getSystemClipboard();

		//write the path to clipboard
		cb.setContents(path, null);

		//create object of Robot class to perform paste and enter opration
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}

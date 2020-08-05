package com.niveus.objecRepository;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import afya.genericlib.Utility;

public class ProfilePage {
	WebDriver driver;
	Utility ut =new Utility();
	
	@FindBy(xpath="//div[@class='drp ant-dropdown-trigger']")
	private WebElement proflehover;
	
	public WebElement  getProfilehov()
	{
		return proflehover;
	}
	
	@FindBy(xpath="//li[text()='sign out']")
	private WebElement sigout;
	
	public WebElement getSignOut()
	
	{
		 return sigout;
	}
	
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	public WebElement getFname()
	
	{
		return fname;
	}
	
	@FindBy(id="last_name")
    private WebElement lname;
	
	public WebElement getLastname()
	{
		return lname;
	}

	@FindBy(id="dob")
	private WebElement  dobid;
	
	public WebElement getDobirth()
	{
		return dobid;
	}
	
	@FindBy(xpath="//div[@class='ant-select-selector']")
	private WebElement gnder;
	
	public  WebElement getGender()
	{
		return gnder;
	}
	
	@FindBy(xpath="//div[text()='Male']")
	private  WebElement genmale;
	
	public WebElement getGenMale()
	{
		return genmale;
	}
	@FindBy(xpath="//div[text()='Female']")
	private WebElement genFemale;
	
	public WebElement getFemale()
	{
		return genFemale;
	}
	@FindBy(xpath="//div[text()='Choose not to specify']")
	private WebElement  notspecify;
	
	public WebElement getGenNotspecify()
	{
		return  notspecify;
	}
	@FindBy(xpath="//input[@placeholder='Phone number']")
	private WebElement phono;
	
	public WebElement getPhoneNO()
	{
		return phono;
	}
	
	@FindBy(xpath="//textarea[@id='bio']")
	private WebElement bio;
	
	public WebElement getBioData()
	{
		return bio;
	}
	@FindBy(xpath="//button[@type='submit' and text()='Update Information']")
	private WebElement updatebtn;
	
	public WebElement getUpdatebtn()
	{
		return  updatebtn;
	}
	
	
	public void updateProfile(String firstname,String lastName,String dateofbirth,String gender,String biodata) throws Exception
	{
		/*Thread.sleep(5000);
       Actions act=new Actions(driver);
       act.doubleClick(fname).perform();*/
      /*  fname.clear();*/
	
		fname.sendKeys(firstname);
	
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
/*
		lname.clear();*/
		lname.sendKeys(lastName);
		

		/*dobid.clear();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
*/
		/*Thread.sleep(5000);
		WebElement dclear = driver.findElement(By.xpath("//span[@class='ant-picker-suffix']"));
		ut.moveToElement(driver, dclear);*/
		
		dobid.sendKeys(dateofbirth,Keys.ENTER);
		gnder.click();
		 Thread.sleep(4000);

		if(gender.equals("Male"))
		{
			genmale.click();
		}
		else if(gender.equals("Female"))
		{
			genFemale.click();
		}
		else
		{
			notspecify.click();
		}
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         Thread.sleep(4000);
 /*       phono.clear();
		phono.sendKeys(phonenumber);*/

       //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
/*       bio.clear();
*/       bio.sendKeys(biodata);
       updatebtn.click();
		
		
		
	}
	
}

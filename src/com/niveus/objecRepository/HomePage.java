package com.niveus.objecRepository;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	@FindBy(xpath = "//a[@href='/chatcenter']")
	
	private WebElement chats;

	public WebElement getChat() {
		return chats;
	}

	@FindBy(xpath = "//a[@href='/profile']")
	private WebElement myprofile;

	public WebElement getProfile()

	{
		return myprofile;
	}

	@FindBy(xpath = "//span[@class='anticon anticon-menu-fold']")
	private WebElement fold;

	public WebElement getWindowfold() {
		return fold;
	}

	@FindBy(xpath = "//button[@type='button']/span[text()='NEW']")
	private WebElement buttonnew;

	public WebElement getNewbtn() {
		return buttonnew;
	}

	@FindBy(id = "speciality")
	private WebElement spec;

	public WebElement getSpeciality() {
		return spec;
	}

	@FindBy(id = "chiefcomplaint")
	private WebElement chief;

	public WebElement getChiefcomplaint() {
		return chief;
	}

	@FindBy(xpath = "//button[@type='button']/span[text()='Create a new chat']")
	private WebElement createnew;

	public WebElement getNewpatient() {
		return createnew;
	}

	@FindBy(xpath = "//button[@type='button']/span[text()='Create a new chat']/ancestor::span//span[text()='Cancel']")
	private WebElement cancel;

	public WebElement getCanclbtn() {
		return cancel;

	}

	@FindBy(xpath = "//input[@placeholder='Search..']")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath = "//li[@id='active_chat_Session_item']")
	private WebElement chatsession;

	public WebElement getChatsesion() {
		return chatsession;

	}

	@FindBy(xpath = "//div[@id='textArea']/preceding-sibling::div/input[@type='text']")
	private WebElement textare;

	public WebElement getTextarea() {
		return textare;
	}

	@FindBy(xpath = "//img[@src='/static/sendicon.3d7dfaf1.svg']")
	private WebElement btnsend;

	public WebElement getSendbutton() {
		return btnsend;
	}

	@FindBy(xpath = "//span[@class='anticon anticon-paper-clip']")
	private WebElement paperclip;

	public WebElement getPaperclip() {
		return paperclip;
	}

	@FindBy(xpath = "//span[@aria-label='more']")
	private WebElement moreoptions;

	public WebElement getMoreoptions() {
		return moreoptions;
	}

	@FindBy(xpath = "//div[@class='videoimage___2uNRD']")
	private WebElement videocal;

	public WebElement getVideocall() {
		return videocal;
	}
	
   @FindBy (xpath="//ul[@class='listitem___3W6PA']/li[3]")
   private WebElement doccument;
   
   public WebElement getDoc()
   {
	   return doccument;
   }
   
   @FindBy(xpath="//ul[@class='listitem___3W6PA']/li[2]")
   private WebElement Camera;
   
   public WebElement getCamera()
   {
	   return Camera;
   }
   
   @FindBy(xpath="//button[@type='button']/span[@aria-label='camera']")
   private WebElement click;
   
   public WebElement getCameraclick()
   {
	   return click;
   }
	
   @FindBy(xpath="//span[@aria-label='send']")
   private WebElement sendpic;
   
   public WebElement getSendpic()
   {
	   return sendpic;
   }
   
   @FindBy(xpath="//ul[@class='listitem___3W6PA']/li[1]")
   private WebElement photo;
   
   public WebElement getGallery()
   {
	   return photo;
   }
   
   
	public void createNewpatient(String speciality, String chiefcompliant) 
	{
		spec.sendKeys(speciality, Keys.ENTER);
		chief.sendKeys(chiefcompliant);
		createnew.click();
	}
}

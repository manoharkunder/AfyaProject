package com.niveus.objecRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
WebDriver driver;
@FindBy(id="userName")
private WebElement username;

@FindBy(id="password")
private WebElement pwd;

@FindBy(xpath="//span[text()='login']")
private WebElement logbtn;

@FindBy(xpath="//span[text()='auto log-in']/preceding-sibling::span//input")
private WebElement autolog;

@FindBy(xpath="//span[@role='img' and contains(@class,'password-icon')]")
private WebElement pwdview;

@FindBy(xpath="//a[text()='Register account']")
private WebElement register;


public WebElement getregisteration()
{
	return register;
}

public WebElement getpswdview()
{
	return pwdview;
}
public WebElement getautolog()
{
	return autolog;
}
public WebElement getUsername()
{
	return username;
}
public WebElement getpassword()
{
	return pwd;
}
public WebElement getloginbtn()
{
	return logbtn;
}

public void login(String email,String password)
{
	username.sendKeys(email);
	pwd.sendKeys(password);
	/*below is for auto logi*/
	// autolog.click();
	pwdview.click();
	logbtn.click();
}
}
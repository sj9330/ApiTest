package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseLayer.BaseClass;
import com.utilsLayer.UtilsClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement emailid;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;
	
	@FindBy(name="Passwd")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next1;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void typeEmailIdAndClickOnNext(String email)
	{
		UtilsClass.enterData(emailid, email);
		UtilsClass.clickOnElement(next);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void typePassword(String pass)
	{	
		UtilsClass.enterData(password, pass);
		
	}
	
	public void clickOnNext()
	{
		UtilsClass.clickOnElement(next1);
	}
	
	
	
	

	
}

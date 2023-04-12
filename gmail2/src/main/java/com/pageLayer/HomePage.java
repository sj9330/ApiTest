package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseLayer.BaseClass;
import com.utilsLayer.JavaScript;
import com.utilsLayer.UtilsClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//div[@class='aAu arN']")
	private WebElement createLabel1;
	
	@FindBy(xpath="//input[@class='xx']")
	private WebElement labelName;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement create;
	
	@FindBy(xpath="//div[@class='pM aj0']")
	private WebElement sel;
	
	@FindBy(xpath="//div[text()='Edit']")
	private WebElement edit;
	
	@FindBy(xpath="//input[@class='xx']")
	private WebElement clear;
	
	@FindBy(xpath="//input[@class='xx']")
	private WebElement rename;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="//*[text()='Label2']")
	private WebElement verify;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCreateLabel()
	{
		UtilsClass.clickOnElement(createLabel1);
	}
	
	public void createNewLabel(String l)
	{
		UtilsClass.enterData(labelName, l);
		UtilsClass.clickOnElement(create);
	}
	
	public void editLabel ()
	{
		JavaScript.clickOnEditElement(sel);
		UtilsClass.clickOnElement(edit);
	}
	
	public void clearLabel()
	{
		UtilsClass.clearElement(clear);
	}
	
	public void renameLabel(String l)
	{
		UtilsClass.enterData(rename, l);
		UtilsClass.clickOnElement(save);
	}
	public String verifyLabel()
	{
		return verify.getText();
	}
	
}

package com.utilsLayer;

import org.openqa.selenium.WebElement;

import com.baseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	public static void enterData(WebElement wb, String value)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.sendKeys(value);
		}
	}
	
	public static void clickOnElement(WebElement wb)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.click();
		}
	}
	
	public static void clearElement(WebElement wb)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.clear();
		}
	}
}

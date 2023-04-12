package com.utilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.baseLayer.BaseClass;

public class JavaScript extends BaseClass {

	public static void clickOnEditElement(WebElement wb)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", wb);
	}
}

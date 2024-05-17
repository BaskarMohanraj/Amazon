package com.Reusable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Base.Base_Class;

public class Reusable_Class extends Base_Class {

	
	public void Toclick(WebElement eleck) {
		
		eleck.click();
	}

	public void Enterval(WebElement elesend, String value) {
		
		elesend.sendKeys(value);	
		
	}
	
	public void toEnter() throws AWTException {
	
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void DownKey() throws AWTException {
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public void MouseHover(WebElement ele1) {
		
		Actions act = new Actions(driver);
		act.moveToElement(ele1).build().perform();
	}
	
	public void RightClick(WebElement ele2) {
		
		Actions act = new Actions(driver);
		act.contextClick().build().perform();
	}
	
	public void alertAccpetance() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
	}
	
	public void alertInput(String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		
		}
	
	public void takeScreenshot(String value) throws IOException {

	TakesScreenshot sht = (TakesScreenshot) driver;
	File source = sht.getScreenshotAs(OutputType.FILE);
	File destn = new File(value);
	FileUtils.copyFile(source, destn);
	
	}	
	
	public void toScrollDown(WebElement ele4) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele4);
				
	}
	
	public void toScrollUp(WebElement ele5) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollItoView(false);", ele5);	

	}
	
	public void forWindowshandle() {
		
		Set<String> handles = driver.getWindowHandles();
		List<String> wind = new ArrayList<String>();
		wind.addAll(handles);
		driver.switchTo().window(wind.get(1));
	}
	
	public void selectDropDown(WebElement ele4, String value) {
		
		Select dwn = new Select(ele4);
		dwn.selectByValue(value);
	}
	
	
	
	
	
	}
	
	
	


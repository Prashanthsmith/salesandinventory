package com.salesandinventory.generic;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
/**
 * 
 * @author prashanth
 *
 */

public class WebdriverUtility {
	/**
	 * This method will help to maximize the browser.
	 * @param driver
	 */
	public void toMaximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * This method will help to maximize the browser.
	 * @param driver
	 */
	public void toMinimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	/**
	 * This method will wait until elements in the page gets loaded.
	 * @param driver
	 * @param duration
	 */
	public void implicitlyWait(WebDriver driver,int duration) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	/**
	 * This method will wait until url of the page gets load.
	 * @param driver
	 * @param duration
	 * @param url
	 */
	public void explicitelyWait(WebDriver driver, int duration, String url) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.urlContains(url));
	}
	/**
	 * This method will wait until title of the page gets load.
	 * @param driver
	 * @param duration
	 * @param title
	 */
	public void waitUntilTitleLoads(WebDriver driver, int duration,String title) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.titleContains(title));
	}
	/**
	 * This method will wait until element in the page gets loaded.
	 * @param driver
	 * @param duration
	 * @param element
	 */
	public void waituntilElementToBeClickable(WebDriver driver, int duration,WebElement element) {

		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * This method will ignore the noSuchElementException and continue the execution.
	 * @param driver
	 * @param duration
	 */
	public void ignoreNoSuchELementException(WebDriver driver, int duration) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.ignoring(NoSuchElementException.class);
	}
	/**
	 * This method helps to stop execution  based on the user customization.
	 * @param element
	 * @throws InterruptedException
	 */
	public void customWait(WebElement element) throws InterruptedException {
		int count=0;
		while(count<20) {
			try {
				element.click();
				break;
			}
			catch (Exception e) {
				Thread.sleep(1000);
			}
			count++;
		}
	}
	/**
	 * This method helps to handle drop down by selecting  elements based on index.
	 * @param element
	 * @param index
	 */

	public void selectDropDown(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * This method helps to click on element in the drop down based on the value
	 * @param element
	 * @param value
	 */
	public void selectDropDown(WebElement element, String value) {
		Select s =new Select(element);
		s.selectByValue(value);
	}
	/**
	 * This method helps to click on the element in the drop down based on the visible text
	 * @param visibletext
	 * @param element
	 */
	public void selectDropDown(String visibletext,WebElement element) {
		Select s =new Select(element);
		s.selectByVisibleText(visibletext);
	}
	/**
	 * This method helps to mousehover to the element.
	 * @param driver
	 * @param element
	 */

	public void moveToElement(WebDriver driver, WebElement element) {
		Actions a =new Actions(driver);
		a.moveToElement(element).click().perform();
	}
	/**
	 * This method helps to right click on the element.
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver, WebElement element) {
		Actions a= new Actions(driver);
		a.contextClick(element).perform();
	}
	/**
	 * This method helps to click on enter button.
	 * @param driver
	 * @param elemet
	 */
	public void clickOnEnterKey(WebDriver driver,WebElement elemet) {
		Actions a =new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
	}

	/**
	 * This method helps to switch the frame based on the index.
	 * @param driver
	 * @param index
	 */
	public void switchFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method helps to switch the frame based on the id.
	 * @param driver
	 * @param id
	 */

	public void switchFrame(WebDriver driver, String id) {
		driver.switchTo().frame(id);
	}

	/**
	 * This method helps to switch the frame based on the element.
	 * @param driver
	 * @param element
	 */
	public void switchFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * This method helps to take screenshots.
	 * @param driver
	 * @param screenshotname
	 * @return
	 */
	public static String takeScreenShot(WebDriver driver, String screenshotname) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+screenshotname+".png");
		try {
			Files.copy(src, dest);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return screenshotname;
	}
	/**
	 * This method is used to scroll to particular element.
	 * @param driver
	 * @param element
	 */
	public void scrollToparticularElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView",element);
	}
	/**
	 * This method helps to switch the window based on the title.
	 * @param driver
	 * @param expectedTitle
	 */
	public void switchWindowBasedOnTitle(WebDriver driver, String expectedTitle) {
		Set<String> set = driver.getWindowHandles();
		for (String str : set) {

			driver.switchTo().window(str);
			String title = driver.getTitle();
			if(title.contains(expectedTitle)) {
				break;
			}

		}
	}
	/**
	 * This method helps to switch the window based on the url.
	 * @param driver
	 * @param expectedurl
	 */
	public void switchWindowBasedOnUrl(WebDriver driver,String expectedurl) {
		Set<String> set = driver.getWindowHandles();
		for (String str : set) {
			driver.switchTo().window(str);
			String url = driver.getCurrentUrl();
			if(url.contains(expectedurl)) {
				break;
			}
		}
	}
	/**
	 * This method helps to switch windows
	 * @param driver
	 */
	public void switchWindow(WebDriver driver) {
		Set<String> set = driver.getWindowHandles();
		for (String str : set) {
			driver.switchTo().window(str);
		}
	}
	/**
	 * This method helps to click on 'OK' button on alert pop up.
	 * @param driver
	 * @param exceptedmsg
	 */
	public void acceptAlertPopup(WebDriver driver,String exceptedmsg) {
		Alert a = driver.switchTo().alert();
		if(a.getText().contains(exceptedmsg)) {
			System.out.println("Alert message is verified");
		}
		else
			System.out.println("Alert message is not verified");
		a.accept();
	}
	/**
	 * This method helps to click on 'Cancel' button on alert pop up.
	 * @param driver
	 * @param exceptedmsg
	 */
	public void dismissAlertPopup(WebDriver driver, String exceptedmsg ) {
		Alert a = driver.switchTo().alert();
		if(a.getText().contains(exceptedmsg)) {
			System.out.println("Alert message is verified");
		}
		else
			System.out.println("Alert message is not verified");
		a.dismiss();
	}
	/**
	 * This mrthod helps to switch to  it's parent frame.
	 * @param driver
	 */
	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	/**
	 * This method helps to switch to main frame from any frame.
	 * @param driver
	 */
	public void switchToMainFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	/**
	 * This element is used to drag and drop.
	 * @param driver
	 * @param src
	 * @param dest
	 */
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest);
	}
	/**
	 * This method used to press enter button. 
	 * @param driver
	 * @throws AWTException
	 */
	public void enterPress(WebDriver driver) throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	/**
	 * This method used to release enter key.
	 * @param driver
	 * @throws AWTException
	 */
	public void enterRelease(WebDriver driver) throws AWTException {
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	/**
	 * This method is used to scroll the page;
	 * @param driver
	 */
	public void scrollBarActions(WebDriver driver) {
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,800","");
	}
	/**
	 * This method is used to scroll until perticular element is found.
	 * @param driver
	 * @param element
	 */
	public void scrollByAction(WebDriver driver, WebElement element) {
		JavascriptExecutor j=(JavascriptExecutor) driver;
		int y=element.getLocation().getY();
		j.executeScript("window.scrollBy(0,"+y+")", element);
		
	}


}

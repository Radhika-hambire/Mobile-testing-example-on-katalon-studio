package com.my.keywords.android

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.AppiumDriver

import internal.GlobalVariable

public class ScrollToElement {
	AppiumDriver driver;

	ScrollToElement() {
		this.driver = MobileDriverFactory.getDriver()
	}

	//	private scrollEntireList() {
	//		// very specific to android and the type of element that makes up your dropdowns
	//		ArrayList listElement = driver.findElementsByClassName("android.widget.Button").text();
	//		TouchAction touchAction = new TouchAction(driver)
	//		for (int i = 0; i<listElement.size(); i++) {
	//			String textItem = ((MobileElement)listElement[i]).getText()
	//			println ('Array Element of index number ' + i + ' is : ' + textItem)
	//		}
	//		def bottomElement = listElement[listElement.size() - 1]
	//		def topElement = listElement[0]
	//		// Press and scroll from the last element in the list all the way to the top
	//		touchAction.press(bottomElement).moveTo(topElement).release().perform();
	//	}
	@Keyword
	def boolean scrollListToElementWithText(String elementText) {
		boolean isElementFound = false;
		while (isElementFound == false) {
			// very specific to android and the type of element that makes up your dropdowns "android.widget.Button"
			ArrayList listElement = driver.findElementsByClassName("android.widget.Button")
			for (int i = 0; i<listElement.size(); i++) {
				String textItem = ((MobileElement)listElement[i]).getText()
				println ('Array Element is : ' + textItem)
				if (textItem == elementText) {
					println ('*** Inside Function..!!')
					isElementFound = true
					TouchAction touchAction = new TouchAction(driver)
					def bottomElement = listElement[listElement.size() - 1]
					def topElement = listElement[0]
					touchAction.press(bottomElement).moveTo(topElement).release().perform();
					return true
				}
			}
			println ('******Scrolling method call.....')
			//			TouchAction touchAction = new TouchAction(driver)
			//			def bottomElement = listElement[listElement.size() - 1]
			//			def topElement = listElement[0]
			//			touchAction.press(bottomElement).moveTo(topElement).release().perform();
		}
	}
}
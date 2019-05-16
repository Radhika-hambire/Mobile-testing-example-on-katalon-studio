package com.my.keywords.android

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction
import io.appium.java_client.AppiumDriver

import internal.GlobalVariable

public class ScrollToTextElement {
	AppiumDriver driver;
	ScrollToTextElement() {
		this.driver = MobileDriverFactory.getDriver()
	}

	@Keyword
	def boolean scrollListToElementWithText(String elementText) {
		boolean isElementFound = false;
		while (isElementFound == false) {
			// very specific to android and the type of element that makes up your dropdowns
			ArrayList listElement = driver.findElementsByClassName("android.view.View")
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
		}
	}
}

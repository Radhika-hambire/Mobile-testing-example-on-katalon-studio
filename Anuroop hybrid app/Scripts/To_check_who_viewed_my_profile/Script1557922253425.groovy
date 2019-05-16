import com.detroitlabs.katalonmobileutil.touch.Scroll as Scroll
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Window as Window
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Mobile.startApplication('/home/iauro-qa004/Katalon Studio/Anuroop hybrid app/AndroidApp/android-debug.apk', true)

Mobile.comment('Enter username')

Mobile.setText(findTestObject('Login/Username'), 'MB07120121', 0)

Mobile.takeScreenshot('/home/iauro-qa004/Katalon Studio/Anuroop hybrid app/AndroidApp/screenshot.png')

Mobile.comment('Enter password')

Mobile.setText(findTestObject('Login/Password'), 'anuroop50', 0)

Mobile.delay(5)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

KeywordLogger log = new KeywordLogger()

log.logInfo('----------------------------- Page Information : ' + driver.getPageSource())

Mobile.getAttribute(findTestObject('Login/Login'), 'text', 0)

Mobile.comment('Click on Login button')

Mobile.tap(findTestObject('Login/Login'), 0)

Mobile.waitForElementPresent(findTestObject('Home Page/Choose a type of match'), 0)

Mobile.waitForElementPresent(findTestObject('Home Page/More'), 0)

Mobile.tap(findTestObject('Home Page/More'), 0)

Mobile.delay(1)

Mobile.waitForElementPresent(findTestObject('More Page/Who Viewed my Profile'), 0)

Mobile.tap(findTestObject('More Page/Who Viewed my Profile'), 0)

CustomKeywords.'com.my.keywords.android.ScrollToElement.scrollListToElementWithText'(' | 2 Day(S) Ago Shruti Sabnis FI09187167174 Age 26 | Brahmin , Deshastha Rigwedi B.H.M.S, From M.U.H.S University, Nashik. | Graduate Resid @ MIT HOSPITAL , AURANGABAD | ₹ 2,16,000/Year Home - Aurangabad, India Work - Aurangabad, India')

Mobile.waitForElementPresent(findTestObject('More Page/BackButton_who_viewed_my_profile'), 0)

Mobile.tap(findTestObject('More Page/BackButton_who_viewed_my_profile'), 0)


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.logging.KeywordLogger

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Homepage/Page_Demo Web Shop/div_Categories'), 0)


KeywordLogger log = new KeywordLogger()


WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Demo Web Shop/a_Books'),'Books')
log.logInfo('Books Product Category is present')

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Demo Web Shop. Books/a_Computers'),'Computers')
log.logInfo('Computers Product Category is present')

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Demo Web Shop. Computers/a_Electronics'),'Electronics')
log.logInfo('Electronics Product Category is present')

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Demo Web Shop. Electronics/a_Apparel  Shoes'),'Apparel & Shoes')
log.logInfo('Apparel & Shoes Product Category is present')

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Demo Web Shop. Apparel  Shoes/a_Digital downloads'),'Digital downloads')
log.logInfo('Digital downloads Product Category is present')

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Demo Web Shop. Digital downloads/a_Jewelry'),'Jewelry')
log.logInfo('Jewelry Product Category is present')

WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_Demo Web Shop. Jewelry/a_Gift Cards'),'Gift Cards')
log.logInfo('Gift Cards Product Category is present')

WebUI.takeScreenshot()

WebUI.closeBrowser()


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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.appURL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Demo Web Shop/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Shopping Cart/Page_Demo Web Shop. Login/input_Email_Email'), GlobalVariable.userID)

WebUI.setEncryptedText(findTestObject('Object Repository/Shopping Cart/Page_Demo Web Shop. Login/input_Password_Password'), 
    'M2QPTmdpEDqAc7bqT3oqOA==')

WebUI.click(findTestObject('Object Repository/Shopping Cart/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))

WebUI.click(findTestObject('Shopping Cart/Page_Demo Web Shop/a_Computers'))

WebUI.click(findTestObject('Shopping Cart/Cart/Page_Demo Web Shop. Computers/div_Desktops'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Shopping Cart/Product/AddToCart_btn'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Shopping Cart/Page_Demo Web Shop. Build your own cheap computer/input_Qty_add-to-cart-button-72'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shopping Cart/Page_Demo Web Shop. Build your own cheap computer/p_The product has been added to your shopping cart'), 
    0)

message = WebUI.getText(findTestObject('Object Repository/Shopping Cart/Page_Demo Web Shop. Build your own cheap computer/p_The product has been added to your shopping cart'))

KeywordLogger log = new KeywordLogger()

log.logInfo(message)

WebUI.takeScreenshot()

WebUI.closeBrowser()


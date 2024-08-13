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

WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Login/input_Email_Email'), GlobalVariable.userID)

WebUI.setEncryptedText(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Login/input_Password_Password'), 'M2QPTmdpEDqAc7bqT3oqOA==')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop/span_Shopping cart'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Shopping Cart/input_Remove_removefromcart'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Shopping Cart/input_I agree with the terms of service and_f529a0'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Shopping Cart/button_Checkout'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Checkout/select_Select countryUnited StatesCanadaAfg_dd1e54'), 
//  '6', true)
//WebUI.setText(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Checkout/input_City_BillingNewAddress.City'), 
//  'Canberra')
//WebUI.setText(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Checkout/input_Address 1_BillingNewAddress.Address1'), 
//  'test')
//WebUI.setText(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Checkout/input_Zip  postal code_BillingNewAddress.Zi_77bd94'), 
//  '1234')
//WebUI.setText(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Checkout/input_Phone number_BillingNewAddress.PhoneNumber'), 
//  '2829989')
//WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Checkout/input_Fax number_button-1 new-address-next-_2f210c'))
WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Shopping Cart/Continue_btn'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Shopping Cart/Continue_btn'), 
    2)

//WebUI.mouseOver(findTestObject('Checkout/Page_Demo Web Shop. Shopping Cart/Continue_btn'))
WebUI.click(findTestObject('Object Repository/Checkout/Pickup/Page_Demo Web Shop. Checkout/input_Fax number_PickUpInStore'))

WebUI.click(findTestObject('Object Repository/Checkout/ContinueBtn/Page_Demo Web Shop. Checkout/input__button-1 new-address-next-step-button'))

WebUI.click(findTestObject('Object Repository/Checkout/ContinueBtn/Page_Demo Web Shop. Checkout/input__button-1 payment-method-next-step-button'))

WebUI.click(findTestObject('Object Repository/Checkout/ContinueBtn/Page_Demo Web Shop. Checkout/input__button-1 payment-info-next-step-button'))

WebUI.click(findTestObject('Object Repository/Checkout/ContinueBtn/Page_Demo Web Shop. Checkout/input__button-1 confirm-order-next-step-button'))

//WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Checkout/input__button-1 shipping-method-next-step-button'))
//WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Checkout/input__button-1 shipping-method-next-step-button'))
//WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Checkout/input__button-1 shipping-method-next-step-button'))
//WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Checkout/input__button-1 shipping-method-next-step-button'))
WebUI.click(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Checkout/div_Your order has been successfully processed'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Page_Demo Web Shop. Checkout/strong_Your order has been successfully processed'), 
    0)

orderNum = WebUI.getText(findTestObject('Object Repository/Checkout/ContinueBtn/Page_Demo Web Shop. Checkout/OrderNumber_text'))

KeywordLogger log = new KeywordLogger()

log.logInfo(orderNum)

WebUI.takeScreenshot()

WebUI.closeBrowser()


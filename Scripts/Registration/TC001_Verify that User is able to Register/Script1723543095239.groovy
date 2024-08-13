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

WebUI.click(findTestObject('Object Repository/Registration/Page_Demo Web Shop/a_Register'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Demo Web Shop. Register/input_Gender_Gender'))

WebUI.setText(findTestObject('Object Repository/Registration/Page_Demo Web Shop. Register/input_First name_FirstName'), 
    'Nitesh')

myEmailAddress = (('thisismyaddress' + System.nanoTime()) + '@test.com')

passWord = "nitesh123"

WebUI.setText(findTestObject('Object Repository/Registration/Page_Demo Web Shop. Register/input_Last name_LastName'), 'TestAutomation')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Demo Web Shop. Register/input_Email_Email'), myEmailAddress)

WebUI.setEncryptedText(findTestObject('Object Repository/Registration/Page_Demo Web Shop. Register/input_Password_Password'), 
    'M2QPTmdpEDqAc7bqT3oqOA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration/Page_Demo Web Shop. Register/input_Confirm password_ConfirmPassword'), 
    'M2QPTmdpEDqAc7bqT3oqOA==')

WebUI.click(findTestObject('Object Repository/Registration/Page_Demo Web Shop. Register/input__register-button'))

WebUI.doubleClick(findTestObject('Object Repository/Registration/Page_Demo Web Shop. Register/div_Your registration completed'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Demo Web Shop. Register/div_Your registration completed'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Registration/Page_Demo Web Shop. Register/registration_success_message'),2)

confirmation = WebUI.getText(findTestObject('Object Repository/Registration/Page_Demo Web Shop. Register/registration_success_message'))

KeywordLogger log = new KeywordLogger()

log.logInfo(confirmation)
log.logInfo('LoginId: '+myEmailAddress)
log.logInfo('Password: '+passWord)


WebUI.takeScreenshot()

WebUI.closeBrowser()



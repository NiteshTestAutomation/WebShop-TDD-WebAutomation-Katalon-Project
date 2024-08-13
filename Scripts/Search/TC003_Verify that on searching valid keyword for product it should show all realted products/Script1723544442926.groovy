import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.swing.plaf.TextUI as TextUI
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
import groovy.swing.factory.TextArgWidgetFactory as TextArgWidgetFactory
import internal.GlobalVariable as GlobalVariable
import org.eclipse.persistence.jpa.jpql.Assert as Assert
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Search/Page_Demo Web Shop/input_You have no items in your shopping cart_q'), 
    'Camera')

WebUI.click(findTestObject('Object Repository/Search/Page_Demo Web Shop/input_You have no items in your shopping ca_bc5dba'))

String text = WebUI.getText(findTestObject('Search/Page_Demo Web Shop. Search/a_Digital SLR Camera 12.2 Mpixel'))

if (text.contains('Camera')) {
    print('Showing all Camera resultset ')

   
}
WebUI.takeScreenshot()

WebUI.closeBrowser()


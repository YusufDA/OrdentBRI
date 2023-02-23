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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://gym-master.apps.ocp-dev.bri.co.id/login')

WebUI.setEncryptedText(findTestObject('null'), 'uBK22oCU349fsKMqxRooBg==')

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/System Mangement/input_Username - Copy'), 'BA_MAYAN_C')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/System Mangement/button_Sign In'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/System Mangement/a_System Management'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/System Mangement/svg_Pending_border reject icon'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/System Mangement/input_Reasons for rejection 2'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/System Mangement/button_Reject 2'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/System Mangement/span_Close'))


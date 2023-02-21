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

WebUI.mouseOver(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/Tab Left Fund Transfer'))

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/Tab Left Fund Transfer'))

WebUI.mouseOverOffset(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/Tab Left Fund Transfer'), 30, 0)

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/Tab Left BRI to BRI'))

WebUI.click(findTestObject('Checker Role/Page_BRICaMS Cash  Trade/Tab Left Transfer History'))

WebUI.click(findTestObject('Checker Role/Page_BRICaMS Cash  Trade/ID a_IFT57335 Detail Click'))

WebUI.click(findTestObject('Checker Role/Page_BRICaMS Cash  Trade/span_Approve'))

WebUI.click(findTestObject('Signer Role/Pop up Not Approve/span_Cancel'))

WebUI.click(findTestObject('Checker Role/Page_BRICaMS Cash  Trade/span_Approve'))

WebUI.click(findTestObject('Signer Role/Page_BRICaMS Cash  Trade/span_Approve Task'))

WebUI.verifyElementVisible(findTestObject('Checker Role/Page_BRICaMS Cash  Trade/button_Close setelah approve'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Checker Role/Page_BRICaMS Cash  Trade/button_Close setelah approve'))


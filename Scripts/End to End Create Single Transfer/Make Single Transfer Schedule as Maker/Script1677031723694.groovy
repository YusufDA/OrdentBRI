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

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/Tab Left Make a Transfer'))

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/Pop Out Single Transfer'))

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/Pop Up button_Next Create New Transfer BRI to BRI'))

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/Drop down Select Sender Account Number'))

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/div_DEDY YUSUF SILABAN - 037901005847535'))

WebUI.delay(3)

WebUI.setText(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/input_Beneficiary Account Number_receiverAccountNumber'), 
    '020618000070503')

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/button_Next Create Single Transfer'))

WebUI.setText(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/input_Amount_amount Single Transfer'), '260000')

WebUI.click(findTestObject('Maker Role/Transaction Schedule/Page_BRICaMS Cash  Trade/Schedule input_Amount_transactionScheduleType'))

WebUI.setText(findTestObject('Maker Role/Transaction Schedule/Page_BRICaMS Cash  Trade/Input Pick Date ddMMYYYY'), '02/03/2023')

WebUI.click(findTestObject('Maker Role/Transaction Schedule/Page_BRICaMS Cash  Trade/Select Time Dropdown'))

WebUI.click(findTestObject('Maker Role/Transaction Schedule/Page_BRICaMS Cash  Trade/Select Time 10.00'))

WebUI.setText(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/textarea_Remark_remark'), 'Remaks Automaton')

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/button_Next Create Single Transfer'))

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/span_Save  Send for Approval Create Single Transfer'))

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/span_Cancel Pop up Send Transaction for Approval'))

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/span_Save  Send for Approval Create Single Transfer'))

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/span_Submit Pop up Send Transaction for Approval'))

WebUI.verifyElementVisible(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/button_Close Pop up Done'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Maker Role/Page_BRICaMS Cash  Trade/button_Close Pop up Done'))

detail1 = WebUI.getText(findTestObject('Maker Role/Transaction detail/Page_BRICaMS Cash  Trade/div_Transaction IDIFT57339'))

String substring = detail1.substring(detail1.indexOf('IFT'))

System.out.println('global1: ' + GlobalVariable.taskId)

System.out.println(substring)

GlobalVariable.taskId = substring

System.out.println('global2: ' + GlobalVariable.taskId)


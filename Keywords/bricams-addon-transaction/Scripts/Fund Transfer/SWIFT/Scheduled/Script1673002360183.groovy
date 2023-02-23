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

WebUI.setText(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/input_Username_focusring-1 hoverring-primar_45f28b'), 
    'CU_ROSNEFT_M')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/input_Password_focusring-1 hoverring-danger_1ac90e'), 
    'uBK22oCU349fsKMqxRooBg==')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/button_Fund Transfer'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/button_BRI to Other'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/button_Make a Transfer'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/input_Create New Transfer - BRI to Other Ba_41ea91'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/input_SWIFT_SWIFT'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/svg_Select_arrowSelect'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/div_testing LN - HERRY MUJIYONO  001901000574402'))

WebUI.setText(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/input_Bank CodeSWIFT Code_headlessui-combob_653417'), 
    'CENAIDJAXXX')

WebUI.setText(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/input_Bank CodeSWIFT Code_headlessui-combob_653417'), 
    'CENAIDJAXXX' + Keys.ENTER)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/div_Select_react-select__indicators css-1wy0on6'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/div_Testing Tesla 2  12312412312214'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/input_Beneficiary Email (Optional)'), 
    'Test@mail.co')

WebUI.setText(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/input_Country_react-select-6-input'), 
    'United States' + Keys.ENTER)

WebUI.setText(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/textarea_District 7'), 
    'District 7')

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/button_Next_1'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/div_option NZD focused, 1 of 15. 15 results_61ac9d'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/input_Currency_react-select-8-input'), 
    'USD' + Keys.ENTER)

WebUI.setText(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/input_USD_DEBITAMOUNT'), 
    '30')

not_run: WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/input_Pick Date_date'), 
    '20-01-2023' + Keys.ENTER)

WebUI.setText(findTestObject('null'), '07:00' + Keys.ENTER)

WebUI.scrollToElement(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/svg_Select_arrowSelect'), 
    0)

WebUI.delay(3)

WebUI.setText(findTestObject('null'), 'Family Support/Living Expenses' + 
    Keys.ENTER)

WebUI.setText(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/textarea_Remark'), 
    'Remark')

WebUI.setText(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/textarea_remark (1)'), 
    'remark')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/button_Next22'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/button_Save  Send for Approval'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/button_Submit22'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Fund Transfer/SWIFT/Page_BRICaMS Cash  Trade/Page_BRICaMS Cash  Trade/button_Done'))


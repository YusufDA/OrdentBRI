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

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/input_Username'), 'BA_MAYAN_M')

WebUI.setEncryptedText(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/input_Password'), 'uBK22oCU349fsKMqxRooBg==')

WebUI.delay(3)

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/span_Sign In'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/button_Master'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/a_Company Management'))

WebUI.refresh()

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/a_ADHI KARYA'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/button_Edit'))

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/EditForm/input_Company Transaction Limit_CompanyLimitAmount-1'), 
    '100,000,000')

WebUI.selectOptionByLabel(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/EditForm/select_Select currency.IDRUSDJPYSGDSARHKDGBPCNYNZDSEKAEDNOKEURCHFCADAUD'), 
    'IDR', false)

WebUI.setText(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/EditForm/input_Group Name_group_name'), 
    'Ordent Bandung')

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/input_STP_stpTransactional_nonSTP'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/input_Non-STP_ml-2 cursor-pointer Verifier'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/button_Save  Send for Approval'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/button_Close'))


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

WebUI.setText(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Master/Company Management/Create Group/Reject/input_Username_focusring-1 hoverring-primar_45f28b'), 
    'BA_BARCO')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Master/Company Management/Create Group/Reject/input_Password_focusring-1 hoverring-danger_1ac90e'), 
    'uBK22oCU349fsKMqxRooBg==')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Master/Company Management/Create Group/Reject/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Master/Company Management/Create Group/Reject/button_Master'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Master/Company Management/Create Group/Reject/div_Company Management'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Master/Company Management/Create Group/Reject/span_Groups'))

WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Master/Company Management/Create Group/Reject/Page_BRICaMS Cash  Trade/a_SEHAT SELALU 2'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Master/Company Management/Create Group/Reject/button_Reject'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Master/Company Management/Create Group/Reject/input_Reasons for rejection_rounded text-pr_591c66'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Master/Company Management/Create Group/Reject/button_Reject_1'))

WebUI.click(findTestObject('Object Repository/Page_BRICaMS Cash  Trade/Master/Company Management/Create Group/Reject/button_Close'))


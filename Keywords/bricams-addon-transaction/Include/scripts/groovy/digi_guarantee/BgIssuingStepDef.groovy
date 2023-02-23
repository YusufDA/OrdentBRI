package digi_guarantee
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class BgIssuingStepDef {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@When("User Input BgIssuing tab satu (.*)")
	def User_input_BgIssuing_tab_satu (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Create/Tab1'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User Input BgIssuing tab satudua (.*)")
	def User_input_BgIssuing_tab_satudua (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Create/Tab1.2'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User Input BgIssuing tab dua (.*)")
	def User_input_BgIssuing_tab_dua (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Create/Tab2'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@And("User Input BgIssuing tab duadua (.*)")
	def User_input_BgIssuing_tab_duadua (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Create/Tab2.2'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User Input BgIssuing tab tiga (.*)")
	def User_input_BgIssuing_tab_tiga (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Create/Tab3'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}


	@And("User Input BgIssuing tab empat (.*)")
	def User_input_BgIssuing_tab_empat (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Create/Tab4'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User Input BgIssuing tab lima (.*)")
	def User_input_BgIssuing_tab_lima (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Create/Tab5'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("BgIssuing CREATED")
	def BgIssuing_CREATED() {
		WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Button Save Approve'), FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Button Done Save'), FailureHandling.STOP_ON_FAILURE)
	}
	@Then("BgIssuing SaveasDraf")
	def BgIssuing_SaveasDraf() {
		WebUI.click(findTestObject('Page_BRICaMS Cash  Trade/Digi Guarantee/BG Issuing/Create/Page5/Button Save as Draf'),
				FailureHandling.STOP_ON_FAILURE)
	}

	@And("User Input BgIssuing tab tigadua (.*)")
	def User_input_BgIssuing_tab_tigadua (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Create/Tab3.2'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User Input BgIssuing tab tigatiga (.*)")
	def User_input_BgIssuing_tab_tigatiga (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Create/Tab3.3'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User Input BgIssuing tab tigaempat (.*)")
	def User_input_BgIssuing_tab_tigaempat (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Create/Tab3.4'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	//approve
	@When("User Approve BgIssuing (.*)")
	def User_Approve_BgIssuing (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Approval/Approval'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("BgIssuing Terapprove ")
	def BgIssuing_Terapprove () {

	}

	//reject
	@When("User Reject BgIssuing (.*)")
	def User_Reject_BgIssuing (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Approval/Reject'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("BgIssuing Tereject ")
	def BgIssuing_Tereject () {
	}
	//rework
	@When("User Rework BgIssuing (.*)")
	def User_Rework_BgIssuing (String cell) {
		WebUI.callTestCase(findTestCase('Digi Guarantee/Bg Isuuing/Approval/Rework'), [('cell'):cell], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("BgIssuing Terework ")
	def BgIssuing_Terework () {
	}
}
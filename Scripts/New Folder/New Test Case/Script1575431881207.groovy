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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://sp2013:8090/')

WebUI.click(findTestObject('Object Repository/Page_  -/span__k-numeric-wrap k-state-default k-stat_6154bd'))

WebUI.setText(findTestObject('Object Repository/Page_  -/input__expFromInput'), '3')

WebUI.click(findTestObject('Object Repository/Page_  -/input__k-formatted-value experience-filter-_f71459'))

WebUI.setText(findTestObject('Object Repository/Page_  -/input__expToInput'), '11')

WebUI.click(findTestObject('Page_  -/input__k-formatted-value experience-filter-_f71459'))

WebUI.click(findTestObject('Object Repository/Page_  -/li_'))

WebUI.click(findTestObject('Object Repository/Page_  -/div_'))

WebUI.click(findTestObject('Object Repository/Page_  -/li_ _1'))

WebUI.click(findTestObject('Object Repository/Page_  -/div_ (1)'))

WebUI.click(findTestObject('Object Repository/Page_  -/li_'))

WebUI.click(findTestObject('Object Repository/Page_  -/div_  _1'))

WebUI.click(findTestObject('Object Repository/Page_  -/li__1'))

WebUI.click(findTestObject('Object Repository/Page_  -/input__k-input'))

WebUI.click(findTestObject('Object Repository/Page_  -/li_ _1_2'))

WebUI.click(findTestObject('Object Repository/Page_  -/span_'))

WebUI.closeBrowser()


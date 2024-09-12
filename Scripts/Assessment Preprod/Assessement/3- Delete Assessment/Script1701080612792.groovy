import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium as KatalonWebDriverBackedSelenium
import static com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium.*
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import static org.junit.Assert.*
import java.util.concurrent.Callable as Callable
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

'----------------------------------------------------'

'This test case script is generated by Katalon Studio'

'Generated date: 02-Oct-2023 10:22:45 AM'

'File path: C:\\Users\\Ayman\\Downloads\\Selenium Test Cases\\All test cases\\Assessment.side'

'Generated by: akamoun@masaratapp.com'

'----------------------------------------------------'
String baseUrl = 'https://preprod.ekareinc.com/#/login'

WebUI.openBrowser('')

WebUI.maximizeWindow()

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

'open |  |  | '
selenium.open('')

WebUI.delay(3)

'type | name=username | ayman1 | '
selenium.type('name=username', 'ayman1')

'type | name=password | Poiu//2222 | '
selenium.type('name=password', 'Poiu//2222')

'click | css=.btn-ekare |  | '
selenium.click('css=.btn-ekare')

WebUI.delay(3)

'click | css=.ng-scope:nth-child(1) > .ng-binding:nth-child(5) |  | '
selenium.click('css=.ng-scope:nth-child(1) > .ng-binding:nth-child(5)')

WebUI.delay(3)

'click | css=.col-sm-3:nth-child(2) > .btn-large |  | '
selenium.click('css=.col-sm-3:nth-child(2) > .btn-large')

WebUI.delay(3)

'click | css=.button-custom:nth-child(2) > svg |  | '
selenium.click('css=.button-custom:nth-child(2) > svg')

WebUI.delay(3)

'click | css=.cbtn-action:nth-child(2) |  | '
selenium.click('css=.cbtn-action:nth-child(2)')


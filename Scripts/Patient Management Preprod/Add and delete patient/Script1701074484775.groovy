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
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium
import static com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium.*

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.Keys
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import static org.junit.Assert.*
import java.util.concurrent.Callable
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

'----------------------------------------------------'
'This test case script is generated by Katalon Studio'
'Generated date: 02-Oct-2023 10:21:05 AM'
'File path: C:\\Users\\Ayman\\Downloads\\Selenium Test Cases\\All test cases\\Patient Management.side'
'Generated by: akamoun@masaratapp.com'
'----------------------------------------------------'

String baseUrl = "https://preprod.ekareinc.com/#/login"

WebUI.openBrowser('')

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"open |  |  | "
selenium.open("")

"type | name=username | ayman1 | "
selenium.type("name=username", "ayman1")

"type | name=password | Ekaretest@1 | "
selenium.type("name=password", "Ekaretest@1")

"click | css=.btn-ekare |  | "
selenium.click("css=.btn-ekare")

"pause | 3000 |  | "
Thread.sleep("3000")

"click | css=.col-md-2 > .ng-scope > img |  | "
selenium.click("css=.col-md-2 > .ng-scope > img")

"type | id=first_name | test | "
selenium.type("id=first_name", "test")

"type | id=last_name | test | "
selenium.type("id=last_name", "test")

"type | id=current_dob | 01/01/2000 | "
selenium.type("id=current_dob", "01/01/2000")

"type | id=mrn | abc123 | "
selenium.type("id=mrn", "abc123")

"click | css=.radio-inline:nth-child(1) > .ng-binding |  | "
selenium.click("css=.radio-inline:nth-child(1) > .ng-binding")

"click | css=.cbtn-action:nth-child(3) |  | "
selenium.click("css=.cbtn-action:nth-child(3)")

"click | css=.cbtn-action:nth-child(4) |  | "
selenium.click("css=.cbtn-action:nth-child(4)")

"click | css=.ng-scope:nth-child(1) > td .btn |  | "
selenium.click("css=.ng-scope:nth-child(1) > td .btn")

"click | css=.open .list-group-item-danger |  | "
selenium.click("css=.open .list-group-item-danger")

"click | css=.cbtn-action:nth-child(2) |  | "
selenium.click("css=.cbtn-action:nth-child(2)")

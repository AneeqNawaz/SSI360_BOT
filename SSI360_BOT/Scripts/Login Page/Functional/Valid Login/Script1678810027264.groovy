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

//****PRECONDITIONS****
// 1. Open Browser
WebUI.callTestCase(findTestCase('Test Cases/Browser/Open Browser'), null)
// 2. Verify Login page opened correctly
WebUI.callTestCase(findTestCase('Test Cases/Login Page/Common/Verify Login Page opened'), null, FailureHandling.STOP_ON_FAILURE)

//****ACTUAL TESTCASE****
//Input Valid Data and Click on Login
String userName = 'Object Repository/Login Page/input_username'
String password = 'Object Repository/Login Page/input_password'

WebUI.sendKeys(findTestObject(userName), GlobalVariable.userName)
WebUI.setEncryptedText(findTestObject(password), GlobalVariable.password)
WebUI.callTestCase(findTestCase('Test Cases/Login Page/Lookups/Click on Login Button'), null)

//****POST CONDITION****
// 1. Verify user logged-in successful
//WebUI.callTestCase(findTestCase('Test Cases/Login Page/Common/Verify User Logged-in'), null, FailureHandling.STOP_ON_FAILURE)
// 2. Navigate to Attendance Testcase
//WebUI.callTestCase(findTestCase('Test Cases/Attendance/Functional/Search MissingData Date'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Test Cases/Attendance/Common/Navigate to Attendance Page'), null, FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase('Test Cases/Attendance/Functional/Add Time Log'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Test Cases/Attendance/Functional/Read Data from sheet'), null, FailureHandling.STOP_ON_FAILURE)
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

//PRECONDITION
// 1.Navigate to Attendance Page
WebUI.callTestCase(findTestCase('Test Cases/Attendance/Common/Navigate to Attendance Page'), null, FailureHandling.STOP_ON_FAILURE)
// 2.Verify Attendance page Loaded
WebUI.callTestCase(findTestCase('Test Cases/Attendance/Common/Verify Attendance Page Loaded'), null, FailureHandling.STOP_ON_FAILURE)

//ACTUAL TEST CASE
//Input Valid Data and Click on Login
String startDate = 'Object Repository/My Attendance Page/Search Bar/input_StartDate'
String endDate = 'Object Repository/My Attendance Page/Search Bar/input_EndDate'

WebUI.callTestCase(findTestCase('Test Cases/Attendance/Lookups/Click on Search Dropdown Icon'), null)
WebUI.sendKeys(findTestObject(startDate), '03-10-2023')
WebUI.click(findTestObject(endDate))
WebUI.sendKeys(findTestObject(endDate), '03-10-2023')
WebUI.callTestCase(findTestCase('Test Cases/Attendance/Lookups/Click on Search Button'), null)
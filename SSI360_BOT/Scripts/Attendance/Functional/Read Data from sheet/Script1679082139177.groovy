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


String data = 'Data Files/Attendance Detail Sheet/AttendanceSheet'


//findTestData(data).getRowNumbers()
for(def rowNum=1;rowNum<=findTestData(data).getRowNumbers();rowNum++) { 
	GlobalVariable.Date = findTestData(data).getValue(1, rowNum)
	//WebUI.comment("Start Date is -> " + GlobalVariable.Date)
	GlobalVariable.logType = findTestData(data).getValue(2, rowNum)
	GlobalVariable.startTime = findTestData(data).getValue(3, rowNum)
	GlobalVariable.endTime = findTestData(data).getValue(4, rowNum)
		
	WebUI.callTestCase(findTestCase('Test Cases/Attendance/Functional/Search MissingData Date'), null, FailureHandling.STOP_ON_FAILURE)
	WebUI.callTestCase(findTestCase('Test Cases/Attendance/Functional/Add Time Log'), null, FailureHandling.STOP_ON_FAILURE)

}

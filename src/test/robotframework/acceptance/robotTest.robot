*** Settings ***
Documentation   This is first test
Library         com.selenium.test.testng.tests.SimpleTest
Library         com.selenium.test.testng.tests.PageObjectTest

Library         Selenium2Library


*** Test Cases ***
 Test 1
    [Documentation]  This is first test
    beforeTest
    testSearch
    afterTest


package com.selenium.test.testng.tests;

import com.selenium.test.modules.workflow.WorkflowModule;
import com.selenium.test.pages.LoginPage;
import com.selenium.test.pages.YouTubePage;
import com.selenium.test.pages.YouTubeSearchResultsPage;
import com.selenium.test.testng.listeners.ScreenShotOnFailListener;
import com.selenium.test.webtestsbase.WebDriverFactory;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

/**
 * Test demonstrates work with Page Object Pattern(https://code.google.com/p/selenium/wiki/PageObjects)
 */
@RobotKeywords
public class PageObjectTest {

    @RobotKeyword
    public void beforeTest() {
        WebDriverFactory.startBrowser(true);
    }


    @RobotKeyword
    public void testSearch() {
        String toSearch = "Selenium";
        YouTubePage youTubePage = new YouTubePage();
        youTubePage.insertSearchString(toSearch);
        YouTubeSearchResultsPage resultsPage = youTubePage.doSearch();
        assertTrue("No results were found on results page", resultsPage.hasResults());
    }

    @RobotKeyword
    @ArgumentNames({"login", "password"})
    public void authorization(String login, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.insertLogin(login);
        loginPage.insertPassword(password);
        loginPage.submitClick();
        loginPage.create();
    }




    @RobotKeyword
    public void afterTest() {
        WebDriverFactory.finishBrowser();
    }
}

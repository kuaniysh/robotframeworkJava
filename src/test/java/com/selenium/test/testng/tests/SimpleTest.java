package com.selenium.test.testng.tests;

import com.selenium.test.testng.listeners.ScreenShotOnFailListener;
import com.selenium.test.webtestsbase.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

@Listeners({ScreenShotOnFailListener.class})
public class SimpleTest {
    public void testFillGoogleForm() {
        WebDriverFactory.startBrowser(true);
        String toSearch = "Selenium";
        WebDriverFactory.getDriver().get("http://www.youtube.com");

    }
}

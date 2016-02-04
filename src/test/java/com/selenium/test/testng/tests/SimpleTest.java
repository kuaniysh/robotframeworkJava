package com.selenium.test.testng.tests;

import com.selenium.test.webtestsbase.WebDriverFactory;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.javalib.library.AnnotationLibrary;


import static org.junit.Assert.assertTrue;

@RobotKeywords
public class SimpleTest extends AnnotationLibrary {

    @RobotKeyword
    public void testPage() {
        WebDriverFactory.startBrowser(true);
        String toSearch = "Selenium";
        WebDriverFactory.getDriver().get("http://www.youtube.com");

    }
}

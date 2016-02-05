package com.selenium.test.pages;

import com.selenium.test.webtestsbase.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * User: Kuanysh Bekturganov
 * Date: 05.02.16.
 * Time: 11:19.
 */
public class LoginPage extends BasePage {

    private static final String PAGE_URL = "http://192.168.0.182:8080/Synergy/logout";

    @FindBy(xpath = ".//*[@id='ru_link']")
    private WebElement ruLink;

    @FindBy(xpath = ".//*[@id='kz_link']")
    private WebElement kzLink;

    @FindBy(xpath = ".//*[@id='en_link']")
    private WebElement enLink;

    @FindBy(xpath = ".//*[@id='login']")
    private WebElement login;

    @FindBy(xpath = ".//*[@id='pswd']")
    private WebElement password;

    @FindBy(xpath = ".//*[@id='submit_button']")
    private WebElement submitButton;

    @FindBy(xpath = ".//div[(contains(@class, 'bright-green') or contains(@class, 'brightgreen')) and text()='Создать']")
    private WebElement create;

    public LoginPage() {
        super(true);
    }

    @Override
    protected void openPage() {
        getDriver().get(PAGE_URL);
    }

    @Override
    public boolean isPageOpened() {
        return this.login.isDisplayed();
    }

    public void insertLogin(String login) {
        this.login.sendKeys(login);
    }

    public void insertPassword(String password) {
        this.password.sendKeys(password);
    }

    public void submitClick() {
        this.submitButton.click();
    }

    public void create(){
        create.click();
    }
}

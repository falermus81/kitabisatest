package com.testingcompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

public class BasePage {
    private RemoteWebDriver remoteWebDriver;

    public RemoteWebDriver getRemoteWebDriver () {
        return this.remoteWebDriver;
    }

    public BasePage elementClick(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(this.remoteWebDriver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        this.remoteWebDriver.findElement(by).click();
        return this;
    }

    public BasePage elementClear(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(this.remoteWebDriver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        this.remoteWebDriver.findElement(by).clear();
        return this;
    }

    public BasePage elementSendKeys(By by, String input) {
        WebDriverWait webDriverWait = new WebDriverWait(this.remoteWebDriver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        this.remoteWebDriver.findElement(by).sendKeys(input);
        return this;
    }

    public BasePage navigateBack() {
        this.remoteWebDriver.navigate().back();
        return this;
    }

    public BasePage navigateForward() {
        this.remoteWebDriver.navigate().forward();
        return this;
    }

    public BasePage navigateRefresh() {
        this.remoteWebDriver.navigate().refresh();
        return this;
    }

    public BasePage navigateTo(String url) {
        this.remoteWebDriver.navigate().to(url);
        return this;
    }

    public BasePage get(String url) {
        this.remoteWebDriver.get(url);
        return this;
    }

    public BasePage scrollToElement(By by) {
        WebDriverWait webDriverWait = new WebDriverWait(this.remoteWebDriver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        Actions actions = new Actions(this.remoteWebDriver);
        actions.moveToElement(this.remoteWebDriver.findElement(by));
        actions.perform();
        return this;
    }

    public BasePage(RemoteWebDriver remoteWebDriver) {
        this.remoteWebDriver = remoteWebDriver;
    }
}

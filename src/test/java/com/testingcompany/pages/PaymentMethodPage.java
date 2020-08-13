package com.testingcompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PaymentMethodPage extends BasePage {
    public By methodTransferBCA = By.xpath("//*[text()= \"Transfer BCA\"]");

    public PaymentMethodPage(RemoteWebDriver remoteWebDriver) {
        super(remoteWebDriver);
    }
}

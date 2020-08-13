package com.testingcompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NominalPage extends BasePage {
    public By contributionAmount = By.id("contribute_inputfield_amount-donation");
    public By buttonLanjutkanPembayaran = By.id("contribute_button_lanjutkan-pembayaran");

    public NominalPage(RemoteWebDriver remoteWebDriver) {
        super(remoteWebDriver);
    }
}

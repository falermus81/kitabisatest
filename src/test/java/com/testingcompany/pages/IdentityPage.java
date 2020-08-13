package com.testingcompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IdentityPage extends BasePage {
    public By fieldName = By.xpath("//*[@id=\"contribute-page\"]/form[2]/div[3]/div[2]/input");
    public By fieldEmail = By.xpath("//*[@id=\"contribute-page\"]/form[2]/div[3]/div[3]/input");
    public By buttonLanjutkanPembayaran = By.id("contribute_button_lanjutkan-pembayaran");

    public IdentityPage(RemoteWebDriver remoteWebDriver) {
        super(remoteWebDriver);
    }
}

package com.testingcompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CampaignPage extends BasePage {
    public By buttonDonasiSekarang = By.id("campaign-detail_button_donasi-sekarang");

    public CampaignPage(RemoteWebDriver remoteWebDriver) {
        super(remoteWebDriver);
    }
}

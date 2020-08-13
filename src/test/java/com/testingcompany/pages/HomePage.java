package com.testingcompany.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends BasePage {
    // Clicked when user select a campaign in home page
    public By containerCampaign = By.id("template_horizontal-image-slider");

    public HomePage(RemoteWebDriver remoteWebDriver) {
        super(remoteWebDriver);
    }
}

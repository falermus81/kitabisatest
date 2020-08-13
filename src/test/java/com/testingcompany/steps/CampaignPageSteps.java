package com.testingcompany.steps;

import com.testingcompany.pages.NominalPage;
import com.testingcompany.pages.PagePool;
import io.cucumber.java.en.And;

public class CampaignPageSteps {
    @And("User in Campaign Page donates immediately")
    public void userInCampaignPageDonatesImmediately() {
        PagePool.campaignPage.elementClick(PagePool.campaignPage.buttonDonasiSekarang);
        PagePool.nominalPage = new NominalPage(PagePool.campaignPage.getRemoteWebDriver());
    }
}

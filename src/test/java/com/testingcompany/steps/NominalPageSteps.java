package com.testingcompany.steps;

import com.testingcompany.pages.PagePool;
import com.testingcompany.pages.PaymentMethodPage;
import io.cucumber.java.en.And;

import java.awt.*;

public class NominalPageSteps {
    @And("User donates IDR {int}")
    public void userDonatesIDR(Integer amount) {
        PagePool.nominalPage
                .elementClick(PagePool.nominalPage.contributionAmount)
                .elementSendKeys(PagePool.nominalPage.contributionAmount, amount.toString())
                .elementClick(PagePool.nominalPage.buttonLanjutkanPembayaran);
        PagePool.paymentMethodPage = new PaymentMethodPage(PagePool.nominalPage.getRemoteWebDriver());
    }
}

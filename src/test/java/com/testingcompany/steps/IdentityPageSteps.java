package com.testingcompany.steps;

import com.testingcompany.pages.PagePool;
import io.cucumber.java.en.And;

public class IdentityPageSteps {
    @And("with name {string}")
    public void withName(String inputName) {
        PagePool.identityPage
                .elementClick(PagePool.identityPage.fieldName)
                .elementSendKeys(PagePool.identityPage.fieldName, inputName);
    }

    @And("with email {string}")
    public void withEmail(String inputEmail) {
        PagePool.identityPage
                .elementClick(PagePool.identityPage.fieldEmail)
                .elementSendKeys(PagePool.identityPage.fieldEmail, inputEmail);
    }

    @And("User in Identity Page clicks Lanjutkan Pembayaran")
    public void userInIdentityPageClicksLanjutkanPembayaran() {
        PagePool.identityPage
                .elementClick(PagePool.identityPage.buttonLanjutkanPembayaran);
    }
}

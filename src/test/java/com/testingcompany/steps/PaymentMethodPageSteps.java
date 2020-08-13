package com.testingcompany.steps;

import com.testingcompany.pages.IdentityPage;
import com.testingcompany.pages.PagePool;
import io.cucumber.java.en.And;

public class PaymentMethodPageSteps {
    @And("using Transfer BCA method")
    public void usingTransferBCAMethod() {
        PagePool.paymentMethodPage
                .scrollToElement(PagePool.paymentMethodPage.methodTransferBCA)
                .elementClick(PagePool.paymentMethodPage.methodTransferBCA);
        PagePool.identityPage = new IdentityPage(PagePool.paymentMethodPage.getRemoteWebDriver());
    }
}

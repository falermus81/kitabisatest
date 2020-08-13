package com.testingcompany.steps;

import com.testingcompany.pages.CampaignPage;
import com.testingcompany.pages.HomePage;
import com.testingcompany.pages.PagePool;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageSteps {
    @Given("User opened {string} website")
    public void userOpenedWebsite(String urlWebsite) {
        System.setProperty("webdriver.chrome.driver", "/Users/falerymustika/WebDriver/chromedriver");
        PagePool.homePage = new HomePage(new ChromeDriver());

        PagePool.homePage.get(urlWebsite);
    }

    @When("User in Home Page taps on any campaign")
    public void userInHomePageTapsOnAnyCampaign() {
        PagePool.homePage.elementClick(PagePool.homePage.containerCampaign);
        PagePool.campaignPage = new CampaignPage(PagePool.homePage.getRemoteWebDriver());
    }
}

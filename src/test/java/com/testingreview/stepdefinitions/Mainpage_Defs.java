package com.testingreview.stepdefinitions;

import com.testingreview.pages.MainPage;
import com.testingreview.utilities.BrowserUtils;
import com.testingreview.utilities.ConfigurationReader;
import com.testingreview.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Mainpage_Defs {

    WebDriver driver = Driver.get();
    @Given("User goes to main page")
    public void user_goes_to_main_page() {

        driver.get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
        new MainPage().acceptCookies.click();

        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);
        String title = driver.getTitle();
        System.out.println(title);

    }

    @Then("User should see following options on Main Navigation Bar")
    public void user_should_see_following_options_on_Main_Navigation_Bar(List<String> expectedMainMenuOptions) {


        List<WebElement> actualMainMenu = new MainPage().mainNavigationBar;
        List<String> actualMainMenuOptions = new ArrayList<>();

        for (WebElement element : actualMainMenu) {
            actualMainMenuOptions.add(element.getText());

        }

        Assert.assertEquals(expectedMainMenuOptions, actualMainMenuOptions);
    }

    @Then("Verify Mainmenu Options count is {int}")
    public void verify_Mainmenu_Options_count_is(int expectedCount) {

        Assert.assertEquals(expectedCount,new MainPage().mainNavigationBar.size());
        //System.out.println(new MainPage().mainNavigationBar.size());

    }

    @When("User navigates to {string} {string}")
    public void user_navigates_to(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify actual title is {string}")
    public void verify_actual_title_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify actualURL is {string}")
    public void verify_actualURL_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}

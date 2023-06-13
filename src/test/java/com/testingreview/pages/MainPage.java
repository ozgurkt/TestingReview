package com.testingreview.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"div_block-596-7\"]/div")
    public List<WebElement> mainNavigationBar;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement acceptCookies;

}

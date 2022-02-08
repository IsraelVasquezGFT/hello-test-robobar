package com.sinensia.hellotestrobobar.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// http://localhost:3000/#!/
public class CartPage {

    @FindBy(css = ".btn-success")
    public WebElement btnButton;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
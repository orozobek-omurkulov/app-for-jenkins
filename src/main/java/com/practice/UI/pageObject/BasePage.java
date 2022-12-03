package com.practice.UI.pageObject;

import com.practice.UI.helperMethods.Helper;
import com.practice.UI.utilts.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public Helper helper = new Helper();

    protected static HomePage homePage = new HomePage();
}

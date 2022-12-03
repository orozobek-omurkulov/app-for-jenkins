package com.practice.UI.helperMethods;

import com.practice.UI.utilts.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {


    public Helper waitElementToBeClickable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));

        return this;
    }


    public Helper waitElementToBeDisplayed(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));

        return this;

    }


    public Helper click(WebElement element) {
        waitElementToBeDisplayed(element).waitElementToBeClickable(element);
        element.click();
        return this;
    }

    public Helper pause(Integer milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public Helper sendsKeys(WebElement element, String str) {
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;

    }

    public Helper sendKeysWithClear(WebElement element,String str){
        waitElementToBeDisplayed(element);
        element.clear();
        element.sendKeys(str);
        return this;
    }

    public String getAttributeByValue(WebElement element){
        waitElementToBeDisplayed(element);
        return   element.getAttribute("value");
    }

}

package com.practice.UI.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@href=\"register.htm\"]")
    public WebElement registerBtn;

    @FindBy(xpath = "//form[@id=\"customerForm\"] //input[@id=\"customer.firstName\"]")
    public WebElement firstNameInpt;

    @FindBy(xpath = "//form[@id=\"customerForm\"] //input[@id=\"customer.lastName\"]")
    public WebElement lastNameInpt;

    @FindBy(xpath = "//form[@id=\"customerForm\"] //input[@id=\"customer.address.street\"]")
    public WebElement addressInpt;

    @FindBy(xpath = "//form[@id=\"customerForm\"] //input[@id=\"customer.address.city\"]")
    public WebElement cityInpt;

    @FindBy(xpath = "//form[@id=\"customerForm\"] //input[@id=\"customer.address.state\"]")
    public WebElement stateInpt;

    @FindBy(xpath = "//form[@id=\"customerForm\"] //input[@id=\"customer.address.zipCode\"]")
    public WebElement zipCodeInpt;

    @FindBy(xpath = "//form[@id=\"customerForm\"] //input[@id=\"customer.phoneNumber\"]")
    public WebElement phoneNumberInpt;

    @FindBy(xpath = "//form[@id=\"customerForm\"] //input[@id=\"customer.ssn\"]")
    public WebElement ssnInpt;

    @FindBy(xpath = "//form[@id=\"customerForm\"] //input[@id=\"customer.username\"]")
    public WebElement userNameInpt;

    @FindBy(xpath = "//form[@id=\"customerForm\"] //input[@id=\"customer.password\"]")
    public WebElement passwordInpt;

    @FindBy(xpath = "//form[@id=\"customerForm\"] //input[@id=\"repeatedPassword\"]")
    public WebElement repeatedPassInpt;

    @FindBy(xpath = "//form[@id=\"customerForm\"] //input[@class=\"button\"]")
    public WebElement finalRegisterBtn;




    public HomePage registerPage() {

        helper.click(registerBtn);
        return this;
    }

    public HomePage inputFirstName(String firstName) {
        helper.sendsKeys(firstNameInpt, firstName);
        return this;
    }

    public HomePage inputLastName(String lastName) {
        helper.sendsKeys(lastNameInpt, lastName);
        return this;
    }

    public HomePage inputAddress(String address) {
        helper.sendsKeys(addressInpt, address);
        return this;
    }

    public HomePage cityInput(String city) {
        helper.sendsKeys(cityInpt, city);
        return this;
    }

    public HomePage stateInput(String state) {
        helper.sendsKeys(stateInpt, state);
        return this;
    }

   public  HomePage zipCodeInput(String zipCode) {
        helper.sendsKeys(zipCodeInpt, zipCode);
        return this;
   }


    public HomePage phoneNumberInput(String phoneNumber) {
        helper.sendsKeys(phoneNumberInpt, phoneNumber);
        return this;
    }

    public HomePage ssnInput(String ssn) {
        helper.sendsKeys(ssnInpt, ssn);
        return this;
    }

    public HomePage userNameInput(String userName) {
        helper.sendsKeys(userNameInpt, userName);
        return this;
    }

    public HomePage passwordInput(String password) {
        helper.sendsKeys(passwordInpt, password);
        return this;
    }

    public HomePage repeatPasswordInput(String confirmPassword) {
        helper.sendsKeys(repeatedPassInpt, confirmPassword);
        return this;
    }

    public HomePage registerButton() {
        helper.click(finalRegisterBtn);
        return this;
    }
}

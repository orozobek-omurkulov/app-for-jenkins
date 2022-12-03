package UI.stepDefs;


import com.practice.UI.dataProvider.ConfigReader;
import com.practice.UI.pageObject.HomePage;
import com.practice.UI.pojo.User;
import com.practice.UI.utilts.Driver;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class MainPage extends  HomePage{

    @DataTableType
    public User userEntryTransformer(Map<String, String> row) {
        return new User(
                row.get("firstName"),
                row.get("lastName"),
                row.get("address"),
                row.get("city"),
                row.get("state"),
                row.get("zipCode"),
                row.get("phoneNumber"),
                row.get("ssn"),
                row.get("userName"),
                row.get("password"),
                row.get("confirmPassword")
        );
    }

    @Given("user is on main page")
    public void user_is_on_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
    }

//    @Given("user clicks on register btm")
//    public void user_clicks_on_register_btm() {
//        homePage.registerPage();
//    }

    @Given("create new user with following data")
    public void create_new_user_with_following_data(List<User> userData) {



        homePage.inputFirstName(userData.get(0).getFirstName());
        homePage.inputLastName(userData.get(0).getLastName());
        homePage.inputAddress(userData.get(0).getAddress());
        homePage.cityInput(userData.get(0).getCity());
        homePage.stateInput(userData.get(0).getState());
        homePage.zipCodeInput(userData.get(0).getZipCode());
        homePage.phoneNumberInput(userData.get(0).getPhoneNumber());
        homePage.ssnInput(userData.get(0).getSsn());
        homePage.userNameInput(userData.get(0).getUserName());
        homePage.passwordInput(userData.get(0).getPassword());
        homePage.repeatPasswordInput(userData.get(0).getConfirmPassword());
       
      
      
        
    }

    @Then("user clicks register btn")
    public void user_clicks_register_btn() {
       homePage.registerButton();
    }
}

package stepdefenitionfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.FacebookRegistration;
import pageobjects.Project1pageObject;

public class Project1Steps {

    @Given("user selects Basic Auth")
    public void selectBasicAutH(){
        Project1pageObject.BasicAuth();
    }

    @When("user enters user and password \\(user: {string} and pass: {string})")
    public void userEntersUserAndPassword(String user, String pass) {
        Project1pageObject.enterAuth(user, pass);
    }

    @Then("verify login")
    public void verifyLogin() {
        Project1pageObject.verifyAuth();
    }

    @Given("select Create new Account on facebook")
    public void newAccount() throws InterruptedException {
        FacebookRegistration.clickNewRegistration();
    }

    @When("fill the details and click Submit")
    public void fillTheDetailsAndClickSubmit() throws InterruptedException {
        FacebookRegistration.fillDetails();
    }

    @Given("user selects date pickers")
    public void userSelectsDatePickers() throws InterruptedException {
        Project1pageObject.selectDatePicker();
    }

    @When("user selects date day{string} month{string} and year {string}")
    public void userSelectsDateDayMonthAndYear(String d, String m, String y) throws InterruptedException {

        Project1pageObject.fillDate(d,m,y);

    }

    @Then("user gets to main page and select sliders and get to {string} percent")
    public void userGetsToMainPageAndSelectSlidersAndGetToPercent(String percent) throws InterruptedException {
        Project1pageObject.selectSlider();

    }

    @Given("select Drag and Drop")
    public void selectDragAndDrop() {
        Project1pageObject.dragAndDrop();
    }


    @When("select Box A and drag and drop on Box B")
    public void selectBoxAAndDragAndDropOnBoxB() {
        Project1pageObject.dragAtoB();
    }

    @Given("select frames and windows")
    public void selectFramesAndWindows() {
        Project1pageObject.selectFramesAndWindowsOption();
    }

    @When("user clicks iframe tab")
    public void userClicksNewWindowTab() {
        Project1pageObject.clickiframe();
    }

    @Then("user clicks the any option inside frame")
    public void userClicksTheOptionInsideFrame() {
        Project1pageObject.clickHome();
    }
}

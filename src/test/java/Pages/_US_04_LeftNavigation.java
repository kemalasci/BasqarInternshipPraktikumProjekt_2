package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _US_04_LeftNavigation extends _US_00_Parent {
    WebElement myElement;


    public _US_04_LeftNavigation() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setUpGeneral;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterButton;

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budgetButton;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private WebElement budgetSetupBtn;

    @FindBy(xpath = "(//span[text()='Budget Projects'])[1]")
    private WebElement bugdgetProjects;

    @FindBy(xpath = "//span[text()='Budgets']")
    private WebElement budgetsSubMenu;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discounts;



    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "setUpGeneral":
                myElement = setUpGeneral;
                break;

            case "parameterButton":
                myElement = parameterButton;
                break;

            case "budgetButton":
                myElement = budgetButton;
                break;

            case "budgetSetupBtn":
                myElement = budgetSetupBtn;
                break;

            case "bugdgetProjects":
                myElement = bugdgetProjects;
                break;

            case "budgetsSubMenu":
                myElement = budgetsSubMenu;
                break;

                //**************************************
            case "discounts":
                myElement = discounts;
                break;
        }
        clickFunction(myElement);
    }
}



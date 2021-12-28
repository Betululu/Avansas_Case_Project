package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class phpTravels_page {

    public phpTravels_page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement sifre;

    @FindBy(xpath = "//button[@type= 'submit']")
    public WebElement loginButonu;

    @FindBy(xpath="(//a[contains(@class,'dropdown-toggle')])[2]")
    public WebElement account;

    @FindBy(xpath = "//a[text()='Customers']")
    public WebElement custemersSecenegi;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement addlinki;

    @FindBy(name = "fname")
    public WebElement fistname;

    @FindBy(name = "lname")
    public WebElement lastname;

    @FindBy(name = "email")
    public WebElement email2;

    @FindBy(name = "password")
    public WebElement password2;

    @FindBy(name = "mobile")
    public WebElement mobileNumber;

    @FindBy(name = "country")
    public WebElement country;

    @FindBy(name = "address1")
    public WebElement adress1;

    @FindBy(name = "address2")
    public WebElement adress2;

    @FindBy(name = "newssub")
    public WebElement checkBox;


    @FindBy(xpath="(//button[@class='btn btn-primary btn-block btn-lg'])")
    public WebElement submitButton;







}

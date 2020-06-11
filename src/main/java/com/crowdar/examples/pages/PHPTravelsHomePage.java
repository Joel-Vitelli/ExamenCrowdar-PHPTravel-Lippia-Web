package com.crowdar.examples.pages;

import io.appium.java_client.android.nativekey.PressesKey;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class PHPTravelsHomePage extends PageBasePHPTravels {

    private final String DROPDOWN_LENGUAGE_ID = "dropdownLangauge";
    private final String ITEM_DD_ESPAÑOL_CSS_SELECTOR = "a#es";
    private final String ITEM_DD_LANGUAGE_CSS_SELECTOR = "a#";
    private final String INPUT_SEARCH_HOTEL_CSS_SELECTOR = "s2id_autogen1";
    private final String INPUT_SEARCH_HOTEL_ID = "#select2-drop > div > input";
    private final String DD_RESULT_CSS_SELECTOR = "#select2-drop > ul > li > ul > li.select2-results-dept-1.select2-result.select2-result-selectable.select2-highlighted > div";
    private final String INPUT_CHECKIN_ID = "#checkin";
    private final String INPUT_CHECKOUT_ID = "#checkout";
    private final String BUTTON_DECREMENT_ADULT_XPATH = "//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/div/span/button[2]";
    private final String BUTTON_INCREMENT_ADULT_XPATH = "//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]/div/span/button[1]";
    private final String BUTTON_DECREMENT_CHILD_XPATH = "//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[2]";
    private final String BUTTON_INCREMENT_CHILD_XPATH = "//*[@id='hotels']/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]/div/span/button[1]";
    private final String BUTTON_SEARCH_XPATH = "//*[@id='hotels']/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/button[1]";


    public PHPTravelsHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void go() {
        navigateToCompleteURL();
    }

    public void clikDropdownListLenguage(){
        clickElement(By.id(DROPDOWN_LENGUAGE_ID));
        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(ITEM_DD_ESPAÑOL_CSS_SELECTOR)));
    }

    public void selectLenguage(String code){
        String fullCode = ITEM_DD_LANGUAGE_CSS_SELECTOR + code;
        clickElement(By.cssSelector(fullCode));

    }

    //Empieza otro Feature

    public void clickSearchFieldHotel(){
        clickElement(By.id(INPUT_SEARCH_HOTEL_CSS_SELECTOR));
    }

    public void searchHotel(String hotel){
        completeField(By.cssSelector(INPUT_SEARCH_HOTEL_ID),hotel);
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement selectResult = driver.findElement(By.cssSelector(DD_RESULT_CSS_SELECTOR));
        selectResult.click();

    }

    public void dateOfCheckIn(String date){
        WebElement inputCheckIn = driver.findElement(By.cssSelector(INPUT_CHECKIN_ID));
        inputCheckIn.clear();
        inputCheckIn.sendKeys(date);
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeigth)");
        inputCheckIn.sendKeys(Keys.TAB);
    }

    public void dateOfCheckOut(String date){
        WebElement inputCheckIn = driver.findElement(By.cssSelector(INPUT_CHECKOUT_ID));
        inputCheckIn.clear();
        inputCheckIn.sendKeys(date);
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeigth)");
        inputCheckIn.sendKeys(Keys.TAB);
    }

    public void countAdults(int number){
        int cont = 2;
        if (number < cont){
            while (cont != number){
                clickElement(By.xpath(BUTTON_DECREMENT_ADULT_XPATH));
                cont--;
            }
        }
        if (number > cont){
            while (cont != number){
                clickElement(By.xpath(BUTTON_INCREMENT_ADULT_XPATH));
                cont++;
            }
        }
    }

    public void countChilds(int number){
        int cont = 0;
        if (number < cont){
            while (cont != number){
                clickElement(By.xpath(BUTTON_DECREMENT_CHILD_XPATH));
                cont--;
            }
        }
        if (number > cont){
            while (cont != number){
                clickElement(By.xpath(BUTTON_INCREMENT_CHILD_XPATH));
                cont++;
            }
        }
    }

    public void clickSearchButton(){
        clickElement(By.xpath(BUTTON_SEARCH_XPATH));
    }

    public void verifyTitleHotelResults(){
        Assert.assertEquals("Hotels Results", driver.getTitle());
    }
}

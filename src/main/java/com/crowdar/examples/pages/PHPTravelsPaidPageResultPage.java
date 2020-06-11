package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PHPTravelsPaidPageResultPage extends PageBasePHPTravels {

    private final String ERROR_MESSAJE_CSS_SELECTOR = "#root > div > div.sc-chPdSV.sc-kgoBCf.hvCKhe > div.sc-likbZx.kwmyYQ > div.sc-bXGyLb.dqipPW > div > div > div.sc-ibxdXY.sc-RefOD.joVLFJ > span";

    public PHPTravelsPaidPageResultPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void confirmErrorMessaje(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ERROR_MESSAJE_CSS_SELECTOR)));
        WebElement error = driver.findElement(By.cssSelector(ERROR_MESSAJE_CSS_SELECTOR));
        Assert.assertEquals("Este pago ha sido rechazado por su banco. Por favor, inténtelo de nuevo o utilice un método de pago distinto. Contacte con su banco para obtener más información.", error.getText());
        System.out.println("asd");
    }

}

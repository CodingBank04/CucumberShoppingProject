package PageObjects;

import ComSelPro.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
    By ProceedImage = By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");
    By ProceedButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");

    public WebElement getImage() {
        return Base.driver.findElement(ProceedImage);
    }

    public WebElement getProceedTocheckout() {
        return Base.driver.findElement(ProceedButton);

    }
}
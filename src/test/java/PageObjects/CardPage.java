package PageObjects;

import ComSelPro.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CardPage {
    public By productName=By.cssSelector("p.product-name");
    public WebElement getMyProductName(){
        return Base.driver.findElement(productName);
    }
}

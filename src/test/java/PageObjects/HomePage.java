package PageObjects;

import ComSelPro.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePage extends Base {

    public By search = By.xpath("//input[@type='search']");

    public WebElement getSearch() {
        return driver.findElement(search);

    }

    public By productName = By.cssSelector("h4.product-name");

    public WebElement getProductName() {
        return driver.findElement(productName);
    }

    @FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
    WebElement addToCart;

    public void SetToCart() {
        addToCart.click();
    }

    @FindBy(how = How.CSS, using = "a.increment")
    WebElement increment;

    public void incerement() {
        increment.click();
    }

    public List<WebElement> selects;

    public List<WebElement> getSelects() {
        selects = driver.findElements(By.cssSelector("h4.product-name"));
        return selects;
    }

    public List<WebElement> addCarts;

    public List<WebElement> addCartLists() {
        addCarts = driver.findElements(By.xpath("//div[@class='product-action']/button"));
        return addCarts;
    }

}

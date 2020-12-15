package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class BasePage {
    public String nameOfLocation;
    public WebElement findElementUsingFluentWait(final By locator) {
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element is not found after 30 seconds of wait");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
    }

    public void clickThis(By locator){
        findElementUsingFluentWait(locator).click();
    }

    public String getWebpageTitle(){
        return Web.getDriver().getTitle();
    }

    public void enter(By locator, String text) {
        findElementUsingFluentWait(locator).sendKeys(text);
    }

    public void selectFromAutoSuggestion(By locator, String word) {
        List<WebElement> suggestions = Web.getDriver().findElements(locator);
        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().equalsIgnoreCase(word)) {
                suggestion.click();

                nameOfLocation =suggestion.getText();

                break;
            }
        }
    }

    public String getTextFromBox(By locator){
        return findElementUsingFluentWait(locator).getText();






    }

//    public String getTextFromBox(By locator){
//        String textFromWeb= findElementUsingFluentWait(locator).getText();
//        return textFromWeb;
//    }
}






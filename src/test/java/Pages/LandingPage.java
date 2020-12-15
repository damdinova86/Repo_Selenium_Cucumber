package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class LandingPage extends BasePage {

    //Locators
//    By searchButton = By.xpath("//button[@type='submit']");
//    By checkingCalender = By.id("qf-0q-localised-check-in");
//    By checkouCalender = By.id("qf-0q-localised-check-out");
//    By allCalenderDates = By.xpath("");


    By clear = By.id("qf-0q-destination");
    By selectLake = By.xpath("//div[@class='autosuggest-category-result']");
    By clickSearch = By.xpath("//button[text()='Search']");
    By destination= By.xpath("//a[text()='Lake George, New York, United States of America']");


    //Method to interact with webElement (represent by above locators)

    public void enterDestination(String word) {
        enter(clear, word);
    }

    public void selectLG(String location) {
        selectFromAutoSuggestion(selectLake, location);
    }

    public void clickSearchOnLakeG() {
        clickThis(clickSearch);
    }

    public void verifySearchHeaderName() {
        boolean verifyName = getWebpageTitle().contains(nameOfLocation);
         Assert.assertTrue(verifyName, "It has different name");

    }

    public void verifyDestination(){
        System.out.println(getTextFromBox(destination)+"1");
        System.out.println(nameOfLocation+"2");

//        Assert.assertEquals(,nameOfLocation,"Don't match");


//        String location = getTextFromBox(destination);
//        Assert.assertEquals(location,nameOfLocation,"Not the same");


    }







//    public void clickSearch() {
//        Web.getDriver().findElement(searchButton).click();
//    }
//
//    public boolean isSearchButtonEnabled() {
//        return Web.getDriver().findElement(searchButton).isEnabled();
//    }
//
//    public void selectCheckInDate(String CheckIndate){
//        Web.getDriver().findElement(checkingCalender).click();
//        List<WebElement> dates= Web.getDriver().findElements(allCalenderDates);
//        for(WebElement date: dates){
//            if(date.getText().equalsIgnoreCase((CheckIndate))){
//                date.click();
//                break;
//            }
//        }
//
//    }
//
//    public void selectCheckOutDate(String CheckOutdate){
//        Web.getDriver().findElement(checkouCalender).click();
//        List<WebElement> dates= Web.getDriver().findElements(allCalenderDates);
//        for(WebElement date: dates){
//            if(date.getText().equalsIgnoreCase((CheckOutdate))){
//                date.click();
//                break;
//            }
//        }
//
//    }

}

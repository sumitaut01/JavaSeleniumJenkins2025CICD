package uipages;

import drivers.DriverManager;
import org.openqa.selenium.WebDriver;

abstract public class  BasePage {

    public abstract boolean isPageLoaded();

    protected WebDriver getDriver(){
       return  DriverManager.getDriver();
    }






}

package com.example.santandercoders_selenium_ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Page {
    protected WebDriver driver;

    public Page() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ilamu\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}

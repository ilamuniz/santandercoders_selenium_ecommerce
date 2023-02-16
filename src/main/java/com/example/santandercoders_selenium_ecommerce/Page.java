package com.example.santandercoders_selenium_ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Page {
    protected WebDriver driver;

    public Page() {
        driver = new EdgeDriver();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}

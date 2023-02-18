package com.example.santandercoders_selenium_ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SiteOLX extends Page {

    public SiteOLX() {
        super();
        driver.get("https://www.olx.com.br/");
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    public WebElement getBuscaInput() {
        return driver.findElement(By.id("searchtext-input"));
    }

    public void pesquisarProduto(String nomeProduto) {
        WebElement busca = getBuscaInput();
        busca.clear();
        busca.sendKeys(nomeProduto);
        busca.sendKeys(Keys.ENTER);
    }

    public String getTituloDosProdutos() {
        return driver.findElement(By.xpath("//*[@id=\"column-main-content\"]/div[3]/div/div/div/div/h1")).getText();
    }
}

package com.example.santandercoders_selenium_ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CasasBahia extends Page {

    public CasasBahia() {
        super();
        driver.get("https://www.casasbahia.com.br/");
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    public WebElement getBuscaInput() {
        return driver.findElement(By.id("strBusca"));
    }

    public void pesquisarProduto(String nomeProduto) {
        WebElement busca = getBuscaInput();
        busca.clear();
        busca.sendKeys(nomeProduto);
        busca.submit();
    }

    public String getTituloDosProdutos() {
        return driver.findElement(By.id("//*[@id=\"__next\"]/div[2]/div/div/div[2]/ul/li/div/h1")).getText();
    }
}

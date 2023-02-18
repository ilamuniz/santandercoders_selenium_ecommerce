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

    public WebElement getBotaoLogin() {
        return driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div[1]/div[2]/ul/li[5]/a"));
    }

    public void logar() {
        WebElement login = getBotaoLogin();
        login.click();
    }

    public String getTituloDaPagina() {
        return driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[1]/div[1]/span")).getText();
    }

//    public WebElement getCampoSenha() {
//        return driver.findElement(By.id("password-input"));
//    }

    public boolean verificarCampoDeBusca() {
        WebElement campoBusca = getBuscaInput();
        if(campoBusca.getText()== null || campoBusca.getText().trim().equals("")) {
            return true;
        }
        return false;
    }
}

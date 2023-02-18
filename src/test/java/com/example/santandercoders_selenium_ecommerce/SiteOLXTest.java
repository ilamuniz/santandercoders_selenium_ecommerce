package com.example.santandercoders_selenium_ecommerce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * TODO: tipos de testes a fazer
 * 1. buscar produto
 * 2. ao clicar no botão "entrar", direcionar para página de login
 * 3. verificar se o campo "senha" está vazio
 */

public class SiteOLXTest {

    public SiteOLX siteOLX;
    @BeforeEach
    public void acessarPaginaInicial() {

        siteOLX = new SiteOLX();
    }

    //teste 1: buscar produto
    @Test
    public void testBuscarProduto_quandoBuscarProduto_entaoExibirProdutoBuscado() {
        String esperado = "\"ventilador\" no Brasil";
        String pesquisa = "ventilador";
        siteOLX.pesquisarProduto(pesquisa);
        String titulo = siteOLX.getTituloDosProdutos();
        String resultado = titulo;
        Assertions.assertEquals(esperado, resultado);
    }

}

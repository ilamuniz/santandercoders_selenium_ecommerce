package com.example.santandercoders_selenium_ecommerce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

/**
 * TODO: tipos de testes a fazer
 * 1. buscar produto
 * 2. retornar informações do produto
 * 3. adicionar produto ao carrinho
 */

public class CasasBahiaTest {

    public CasasBahia casasBahia;
    @BeforeEach
    public void acessarPaginaInicial() {

        casasBahia = new CasasBahia();
    }

    @Test
    public void testBuscarProduto_quandoBuscarProduto_entaoExibirProdutoBuscado() {
        String esperado = "ventilador";
        casasBahia.pesquisarProduto(esperado);
        String titulo = casasBahia.getTituloDosProdutos();
        String resultado = titulo;
        Assertions.assertEquals(esperado, resultado);
    }

}

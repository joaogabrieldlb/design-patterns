package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        final var orcamento = new Orcamento(new BigDecimal("100"), 1);
        final var calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }
}

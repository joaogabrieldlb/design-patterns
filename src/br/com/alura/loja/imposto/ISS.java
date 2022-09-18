package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {

    public static final String PERCENTUAL_IMPOSTO = "0.06";

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(PERCENTUAL_IMPOSTO));
    }

}

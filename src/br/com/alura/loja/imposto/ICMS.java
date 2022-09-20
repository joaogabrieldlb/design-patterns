package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public static final String PERCENTUAL_IMPOSTO = "0.1";

    public ICMS(Imposto outro) {
        super(outro);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(PERCENTUAL_IMPOSTO));
    }

}

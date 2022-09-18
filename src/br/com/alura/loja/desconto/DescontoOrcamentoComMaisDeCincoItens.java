package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoComMaisDeCincoItens extends Desconto {

    private final int QUANTIDADE_ITENS = 5;
    private final String DESCONTO_10 = "0.10";

    public DescontoOrcamentoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > QUANTIDADE_ITENS) {
            return orcamento.getValor().multiply(new BigDecimal(DESCONTO_10));
        }

        return proximo.calcular(orcamento);
    }
}

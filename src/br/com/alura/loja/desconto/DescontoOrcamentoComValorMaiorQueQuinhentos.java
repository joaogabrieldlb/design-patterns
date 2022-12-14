package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoComValorMaiorQueQuinhentos extends Desconto{

    private final String VALOR_ORCAMENTO = "500";
    private final String DESCONTO_10 = "0.10";

    public DescontoOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal(DESCONTO_10));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal(VALOR_ORCAMENTO)) > 0;
    }
}

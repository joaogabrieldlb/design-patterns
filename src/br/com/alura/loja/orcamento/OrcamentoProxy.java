package br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.Objects;

public class OrcamentoProxy implements Orcavel {

    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if (Objects.isNull(valor)) {
            this.valor = orcamento.getValor();
        }

        return this.valor;
    }
}

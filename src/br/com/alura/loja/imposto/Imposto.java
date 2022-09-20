package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        final var valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;

        if (!Objects.isNull(outro)) {
            valorDoOutroImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorDoOutroImposto);
    }

}

package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public record GeraPedido(
        String cliente,
        BigDecimal valorOrcamento,
        int quantidadeItens
) {
}

package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestesPedidos {
    public static void main(String[] args) {
        final var cliente = args[0];
        final var valorOrcamento = new BigDecimal(args[1]);
        final var quantidadeItens = Integer.parseInt(args[2]);

        final var gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        final var handler = new GeraPedidoHandler(/*dependencias*/);
        handler.executa(gerador);
    }
}

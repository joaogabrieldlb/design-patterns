package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.List;

public class TestesPedidos {
    public static void main(String[] args) {
        final var cliente = "Rodrigo";
        final var valorOrcamento = new BigDecimal("300");
        final var quantidadeItens = Integer.parseInt("2");

        final var gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        final var handler =
                new GeraPedidoHandler(List.of(
                        new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido()
                ));
        handler.executa(gerador);
    }
}

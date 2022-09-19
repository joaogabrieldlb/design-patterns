package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    /*injecao de dependencias de banco da dados, fila de mensageria, email...*/
    public void executa(GeraPedido dados) {
        final var orcamento = new Orcamento(dados.valorOrcamento(), dados.quantidadeItens());

        final var pedido = new Pedido(dados.cliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar email com dados do novo pedido");
    }

}

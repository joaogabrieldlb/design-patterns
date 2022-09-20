package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    /*injecao de dependencias de banco da dados, fila de mensageria, servico...*/
    public void executa(GeraPedido dados) {
        final var orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(dados.valorOrcamento()));

        final var pedido = new Pedido(dados.cliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executaAcao(pedido));
    }

}

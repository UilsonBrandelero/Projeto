/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import javax.swing.JOptionPane;
import modelo.Doacao;
import modelo.Requisicao;
import servico.DoacaoServico;
import servico.RequisicaoServico;

/**
 *
 * Classe utilizada para calcular quantidades e executar as doações
 */
public class ExecutaDoacao {

    private Doacao doacao;
    private static DoacaoServico doacaoServico = new DoacaoServico();
    private static RequisicaoServico requisicaoServico = new RequisicaoServico();

    public ExecutaDoacao(Doacao doacao) {
        this.doacao = doacao;
    }
/*
    Executa as doações calculando as quantidades e atualizadando os registros do banco
    */
    public boolean executarDoacao() {
        boolean verificacao = false;
        int quantidadeRequisicao;
        Requisicao requisicao = requisicaoServico.buscaRequisicaoPorId(doacao.getIdRequisicao());
        quantidadeRequisicao = requisicao.getQuantidade();
        //Verifica se a quantidade doada é maior que o que foi requisitado pelo Centro
        if (doacao.getQuantidadeDoada() > quantidadeRequisicao) {
            JOptionPane.showMessageDialog(null, "Quantidade informada excede a quantidade requisitada", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            //Verifica se a quantidade doado e igual ao que foi requisitado pelo Centro
            if (quantidadeRequisicao == doacao.getQuantidadeDoada()) {
                //Somente atualiza o status da requisição para FECHADA
                verificacao = requisicaoServico.atualizaStatusRequisicao(requisicao.getIdRequisicao(), StatusRequisicao.FECHADA);
                if (verificacao == false) {
                    JOptionPane.showMessageDialog(null, "Erro ao Atualizar Status Requisição", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                //Verifica se a quantidade doada e menor que o que foi requisitado pelo Centro
            } else if (doacao.getQuantidadeDoada() < quantidadeRequisicao) {
                int quantidadeRestante;
                //Calcula a diferença e atualiza os registros do banco de dados
                quantidadeRestante = quantidadeRequisicao - doacao.getQuantidadeDoada();
                verificacao = requisicaoServico.atualizaQuantidadeRequisicao(requisicao.getIdRequisicao(), quantidadeRestante);
                if (verificacao == false) {
                    JOptionPane.showMessageDialog(null, "Erro ao Atualizar Quantidade Requisição", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
            //Salva a Doação realizada nos registros do banco de dados
            if (verificacao == true) {
                doacaoServico.salvarDoacao(doacao);
            }
            return true;
        }
    }

}

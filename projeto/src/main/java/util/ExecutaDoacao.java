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
 * @author uilso
 */
public class ExecutaDoacao {

    private Doacao doacao;
    private static DoacaoServico doacaoServico = new DoacaoServico();
    private static RequisicaoServico requisicaoServico = new RequisicaoServico();

    public ExecutaDoacao(Doacao doacao) {
        this.doacao = doacao;
    }

    public boolean executarDoacao() {
        boolean verificacao = false;
        int quantidadeRequisicao;
        Requisicao requisicao = requisicaoServico.buscaRequisicaoPorId(doacao.getIdRequisicao());
        quantidadeRequisicao = requisicao.getQuantidade();
        if (doacao.getQuantidadeDoada() > quantidadeRequisicao) {
            JOptionPane.showMessageDialog(null, "Quantidade informada excede a quantidade requisitada", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if (quantidadeRequisicao == doacao.getQuantidadeDoada()) {
                verificacao = requisicaoServico.atualizaStatusRequisicao(requisicao.getIdRequisicao(), StatusRequisicao.FECHADA);
                if (verificacao == false) {
                    JOptionPane.showMessageDialog(null, "Erro ao Atualizar Status Requisição", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            } else if (doacao.getQuantidadeDoada() < quantidadeRequisicao) {
                int quantidadeRestante;
                quantidadeRestante = quantidadeRequisicao - doacao.getQuantidadeDoada();
                verificacao = requisicaoServico.atualizaQuantidadeRequisicao(requisicao.getIdRequisicao(), quantidadeRestante);
                if (verificacao == false) {
                    JOptionPane.showMessageDialog(null, "Erro ao Atualizar Quantidade Requisição", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
            if (verificacao == true) {
                doacaoServico.salvarDoacao(doacao);
            }
            return true;
        }
    }

}

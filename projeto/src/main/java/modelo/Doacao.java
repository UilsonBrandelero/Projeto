/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author uilso
 */
public class Doacao {
    private int idDoacao;
    private int idDoador;
    private int idCentroRecebimentoDestino;
    private int idRequisicao;
    private int idItemDoado;
    private String nomeItemDoado;
    private int quantidadeDoada;

    public Doacao() {
    }

    public Doacao(int idDoador, int idCentroRecebimentoDestino, int idRequisicao, int idItemDoado, int quantidadeDoada) {
        this.idDoador = idDoador;
        this.idCentroRecebimentoDestino = idCentroRecebimentoDestino;
        this.idRequisicao = idRequisicao;
        this.idItemDoado = idItemDoado;
        this.quantidadeDoada = quantidadeDoada;
    }
    

    public Doacao(int idDoador, int idCentroRecebimentoDestino, int idRequisicao, 
            int idItemDoado, String nomeItemDoado, int quantidadeDoada) {
        this.idDoador = idDoador;
        this.idCentroRecebimentoDestino = idCentroRecebimentoDestino;
        this.idRequisicao = idRequisicao;
        this.idItemDoado = idItemDoado;
        this.nomeItemDoado = nomeItemDoado;
        this.quantidadeDoada = quantidadeDoada;
    }

   

    public Doacao(int idDoacao, int idDoador, int idCentroRecebimentoDestino, 
            int idRequisicao, int idItemDoado, int quantidadeDoada) {
        this.idDoacao = idDoacao;
        this.idDoador = idDoador;
        this.idCentroRecebimentoDestino = idCentroRecebimentoDestino;
        this.idRequisicao = idRequisicao;
        this.idItemDoado = idItemDoado;
        this.quantidadeDoada = quantidadeDoada;
    }

    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
    }

    public int getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(int idDoador) {
        this.idDoador = idDoador;
    }

    public int getIdCentroRecebimentoDestino() {
        return idCentroRecebimentoDestino;
    }

    public void setIdCentroRecebimentoDestino(int idCentroRecebimentoDestino) {
        this.idCentroRecebimentoDestino = idCentroRecebimentoDestino;
    }

    public int getIdRequisicao() {
        return idRequisicao;
    }

    public void setIdRequisicao(int idRequisicao) {
        this.idRequisicao = idRequisicao;
    }

    public int getIdItemDoado() {
        return idItemDoado;
    }

    public void setIdItemDoado(int idItemDoado) {
        this.idItemDoado = idItemDoado;
    }

    public int getQuantidadeDoada() {
        return quantidadeDoada;
    }

    public void setQuantidadeDoada(int quantidadeDoada) {
        this.quantidadeDoada = quantidadeDoada;
    }

    public String getNomeItemDoado() {
        return nomeItemDoado;
    }

    public void setNomeItemDoado(String nomeItemDoado) {
        this.nomeItemDoado = nomeItemDoado;
    }
    

    @Override
    public String toString() {
        return nomeItemDoado;
    }
    
    
    
           
}

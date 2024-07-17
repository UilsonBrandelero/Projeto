
package modelo;

import util.StatusRequisicao;

/**
 *Classe com os dados necessarios para as requisições criadas no sitema.
 * Tanto para os Centros de Recebimento criarem nosvas requisições e para disponibilizalas
 * para os doadores realizarem doações
 * 
 */
public class Requisicao {
    private int idRequisicao;
    private int idCentroRequisitor;
    private int idItemRequerido;
    private int quantidade;
    private int idCategoriaItem;
    private String nomeItem;
    private StatusRequisicao statusRequisicao;
    private int quantidadeTotalRequisitada;
    

    public Requisicao() {
    }

    public Requisicao(int idCentroRequisitor, int idItemRequerido, int quantidade, StatusRequisicao statusRequisicao,int quantidadeTotal) {
        this.idCentroRequisitor = idCentroRequisitor;
        this.idItemRequerido = idItemRequerido;
        this.quantidade = quantidade;
        this.statusRequisicao = statusRequisicao;
        this.quantidadeTotalRequisitada = quantidadeTotal;
    }

    public Requisicao(int idRequisicao, int idCentroRequisitor, int idItemRequerido, int quantidade, StatusRequisicao statusRequisicao, int quantidadeTotal) {
        this.idRequisicao = idRequisicao;
        this.idCentroRequisitor = idCentroRequisitor;
        this.idItemRequerido = idItemRequerido;
        this.quantidade = quantidade;
        this.statusRequisicao = statusRequisicao;
        this.quantidadeTotalRequisitada = quantidadeTotal;
    }
    

    public Requisicao(int idRequisicao, int idCentroRequisitor, int idItemRequerido, int quantidade, int idCategoriaItem, String nomeItem, StatusRequisicao statusRequisicao, int quantidadeTotal) {
        this.idRequisicao = idRequisicao;
        this.idCentroRequisitor = idCentroRequisitor;
        this.idItemRequerido = idItemRequerido;
        this.quantidade = quantidade;
        this.idCategoriaItem = idCategoriaItem;
        this.nomeItem = nomeItem;
        this.statusRequisicao = statusRequisicao;
        this.quantidadeTotalRequisitada = quantidadeTotal;
    }

   
    

    

    

    

   

    public int getIdRequisicao() {
        return idRequisicao;
    }

    public void setIdRequisicao(int idRequisicao) {
        this.idRequisicao = idRequisicao;
    }

    public int getIdCentroRequisitor() {
        return idCentroRequisitor;
    }

    public void setIdCentroRequisitor(int idCentroRequisitor) {
        this.idCentroRequisitor = idCentroRequisitor;
    }

    public int getIdItenRequerido() {
        return idItemRequerido;
    }

    public void setIdItenRequerido(Item itenRequerido) {
        this.idItemRequerido = idItemRequerido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdCategoriaItem() {
        return idCategoriaItem;
    }

    public void setIdCategoriaItem(int idCategoriaItem) {
        this.idCategoriaItem = idCategoriaItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public StatusRequisicao getStatusRequisicao() {
        return statusRequisicao;
    }

    public void setStatusRequisicao(StatusRequisicao ststusRequisicao) {
        this.statusRequisicao = ststusRequisicao;
    }

    public int getIdItemRequerido() {
        return idItemRequerido;
    }

    public void setIdItemRequerido(int idItemRequerido) {
        this.idItemRequerido = idItemRequerido;
    }

    public int getQuantidadeTotalRequisitada() {
        return quantidadeTotalRequisitada;
    }

    public void setQuantidadeTotalRequisitada(int quantidadeTotalRequisitada) {
        this.quantidadeTotalRequisitada = quantidadeTotalRequisitada;
    }
    
    

    @Override
    public String toString() {
        return nomeItem ;
    }
    
}

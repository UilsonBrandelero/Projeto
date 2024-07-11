/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import util.StatusRequisicao;

/**
 *
 * @author uilso
 */
public class Requisicao {
    private int idRequisicao;
    private int idCentroRequisitor;
    private int idItemRequerido;
    private int quantidade;
    private int idCategoriaItem;
    private String nomeItem;
    private StatusRequisicao statusRequisicao;
    

    public Requisicao() {
    }

    public Requisicao(int idCentroRequisitor, int idItemRequerido, int quantidade, StatusRequisicao statusRequisicao) {
        this.idCentroRequisitor = idCentroRequisitor;
        this.idItemRequerido = idItemRequerido;
        this.quantidade = quantidade;
        this.statusRequisicao = statusRequisicao;
    }

    public Requisicao(int idRequisicao, int idCentroRequisitor, int idItemRequerido, int quantidade, StatusRequisicao statusRequisicao) {
        this.idRequisicao = idRequisicao;
        this.idCentroRequisitor = idCentroRequisitor;
        this.idItemRequerido = idItemRequerido;
        this.quantidade = quantidade;
        this.statusRequisicao = statusRequisicao;
    }
    

    public Requisicao(int idRequisicao, int idCentroRequisitor, int idItemRequerido, int quantidade, int idCategoriaItem, String nomeItem, StatusRequisicao statusRequisicao) {
        this.idRequisicao = idRequisicao;
        this.idCentroRequisitor = idCentroRequisitor;
        this.idItemRequerido = idItemRequerido;
        this.quantidade = quantidade;
        this.idCategoriaItem = idCategoriaItem;
        this.nomeItem = nomeItem;
        this.statusRequisicao = statusRequisicao;
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
    
    

    @Override
    public String toString() {
        return nomeItem ;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package util;

/**
 *
 * Enumeração utilizada para padronizar a declaração do Status de um Requisição
 */
public enum StatusRequisicao {
    ABERTA("ABERTA"),
    FECHADA("FECHADA");
    
   
    private final String STATUS;

    private StatusRequisicao(String status) {
        this.STATUS = status;
    }

    @Override
    public String toString() {
        return STATUS;
    }

   


    
    
            
    
}

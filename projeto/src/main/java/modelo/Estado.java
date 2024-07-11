/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *Classe com as informacoes necessarias de unidades federatidas.
 * utilizado para popular comboBox com as siglas de estados no sistema
 * 
 */
public class Estado {
    private String siglaEstado;
    private int idEstado;

    public Estado() {
    }
    

    public Estado(String siglaEstado, int idEstado) {
        this.siglaEstado = siglaEstado;
        this.idEstado = idEstado;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public String toString() {
        return siglaEstado;
    }
    
    
}

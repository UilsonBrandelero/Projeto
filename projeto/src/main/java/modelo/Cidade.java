/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
Classe com os dados basicos de uma cidade.
* utilizado para estanciar objetos e popular combobox dentro do sistema
 */
public class Cidade {
    private String nomeCidade;
    private String estadoCidade;

    public Cidade() {
    }
    

    public Cidade(String nomeCidade, String estadoCidade) {
        this.nomeCidade = nomeCidade;
        this.estadoCidade = estadoCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getEstadoCidade() {
        return estadoCidade;
    }

    public void setEstadoCidade(String estadoCidade) {
        this.estadoCidade = estadoCidade;
    }

    @Override
    public String toString() {
        return nomeCidade;
    }
    
    
}

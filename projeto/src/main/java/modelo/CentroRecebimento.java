/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
Classe modelo com as informacoes de um centro de recebimento
* Com seus construtores e sus metodos
 */
public class CentroRecebimento {
    private String nome;
    private String cpf_cnpj;
    private String telefone;
    private String eMail;
    private String nomeCentroRecebimento;
    private String senha;
    private int idCentroRebebimento;

    public CentroRecebimento() {
    }
    

    public CentroRecebimento(String nome, String cpf_cnpj, String telefone, String eMail, String nomeCentroRecebimento, String senha) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.telefone = telefone;
        this.eMail = eMail;
        this.nomeCentroRecebimento = nomeCentroRecebimento;
        this.senha = senha;
    }

    public CentroRecebimento(String nome, String cpf_cnpj, String telefone, String eMail, String nomeCentroRecebimento, String senha, int idCentroRebebimento) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.telefone = telefone;
        this.eMail = eMail;
        this.nomeCentroRecebimento = nomeCentroRecebimento;
        this.senha = senha;
        this.idCentroRebebimento = idCentroRebebimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getNomeCentroRecebimento() {
        return nomeCentroRecebimento;
    }

    public void setNomeCentroRecebimento(String nomeCentroRecebimento) {
        this.nomeCentroRecebimento = nomeCentroRecebimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdCentroRebebimento() {
        return idCentroRebebimento;
    }

    public void setIdCentroRebebimento(int idCentroRebebimento) {
        this.idCentroRebebimento = idCentroRebebimento;
    }
    
    
    
    
            
}

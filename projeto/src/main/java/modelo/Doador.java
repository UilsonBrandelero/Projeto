
package modelo;

/**
 * Classe com os dados necessarios para um doador com seus contrutuores e
 * metodos
 *
 */
public class Doador {

    private int idDoador;
    private String nome;
    private String cpf_cnpj;
    private String telefone;
    private String email;

    private String senha;
    private int idEndereco;

    public Doador() {
    }

    public Doador(Doador doador) {
        this.nome = doador.getNome();
        this.idDoador = doador.getIdDoador();
        this.email = doador.getEmail();
        this.cpf_cnpj = doador.getCpf_cnpj();
        this.telefone = doador.getTelefone();
        this.senha = doador.getSenha();
    }
//construtor para cadastro de doador

    public Doador(String nome, String cpf_cnpj, String telefone, String email, String senha) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public Doador(int idDoador, String nome, String cpf_cnpj, String telefone, String email, String senha) {
        this.idDoador = idDoador;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public Doador(int idDoador, String nome, String cpf_cnpj, String telefone, String email, String senha, int idEndereco) {
        this.idDoador = idDoador;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.idEndereco = idEndereco;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(int idDoador) {
        this.idDoador = idDoador;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

}

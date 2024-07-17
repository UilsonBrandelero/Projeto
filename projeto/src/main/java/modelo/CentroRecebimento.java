
package modelo;

/**
 * Classe modelo com as informacoes de um centro de recebimento Com seus
 * construtores e sus metodos
 */
public class CentroRecebimento {

    private String nome;
    private String cpf_cnpj;
    private String telefone;
    private String email;
    private String nomeCentroRecebimento;
    private String senha;
    private int idCentroRebebimento;
    private CentroRecebimento centroRecebimento;

    public CentroRecebimento() {
    }

    public CentroRecebimento(String nomeCentroRecebimento, int idCentroRebebimento) {
        this.nomeCentroRecebimento = nomeCentroRecebimento;
        this.idCentroRebebimento = idCentroRebebimento;
    }

    
    

    public CentroRecebimento(CentroRecebimento centroRecebimento) {
        this.nome = centroRecebimento.getNome();
        this.cpf_cnpj = centroRecebimento.getCpf_cnpj();
        this.telefone = centroRecebimento.getTelefone();
        this.email = centroRecebimento.getEmail();
        this.nomeCentroRecebimento = centroRecebimento.getNomeCentroRecebimento();

    }

    public CentroRecebimento(String nome, String cpf_cnpj, String telefone, String eMail, String nomeCentroRecebimento, String senha) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.telefone = telefone;
        this.email = eMail;
        this.nomeCentroRecebimento = nomeCentroRecebimento;
        this.senha = senha;
    }

    public CentroRecebimento(String nome, String cpf_cnpj, String telefone, String eMail, String nomeCentroRecebimento, String senha, int idCentroRebebimento) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.telefone = telefone;
        this.email = eMail;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String eMail) {
        this.email = eMail;
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

    @Override
    public String toString() {
        return nomeCentroRecebimento;
    }

}


package modelo;

/**
 *Classe para obter os dados de endereco dos usuarios durante o cadastro.
 * 
 */
public class Endereco {
    private String estadoEndereco;
    private String cidadeEndereco;
    private String cep;
    private String rua;
    private String bairro;
    private int numero;
    private String complemento;
    private int idEnderecoDoador;
    private Endereco endereco;

    public Endereco() {
    }

    public Endereco(Endereco endereco) {
        this.estadoEndereco = endereco.getEstadoEndereco();
        this.cidadeEndereco = endereco.getCidadeEndereco();
        this.cep = endereco.getCep();
        this.rua = endereco.getRua();
        this.bairro = endereco.getBairro();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento(); 
    }
    

    public Endereco(String estadoEndereco, String cidadeEndereco, String cep, String rua, String bairro, int numero, String complemento) {
        this.estadoEndereco = estadoEndereco;
        this.cidadeEndereco = cidadeEndereco;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }
    
    

    public Endereco(String estadoEndereco, String cidadeEndereco, String cep, String rua, String bairro, int numero, String complemento, int idEnderecoDoador) {
        this.estadoEndereco = estadoEndereco;
        this.cidadeEndereco = cidadeEndereco;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.idEnderecoDoador = idEnderecoDoador;
    }
    
   
    public String getEstadoEndereco() {
        return estadoEndereco;
    }

    public void setEstadoEndereco(String estadoEndereco) {
        this.estadoEndereco = estadoEndereco;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
    
}

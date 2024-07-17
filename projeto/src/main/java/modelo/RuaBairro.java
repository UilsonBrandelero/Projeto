package modelo;

/**
 *
 * Classe utilizada para armazenar o nome de ruas e bairros a partir de uma
 * busca pelo CEP
 */
public class RuaBairro {

    String rua;
    String bairro;

    public RuaBairro(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
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

}

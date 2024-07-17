
package modelo;

/*
*  Classe com dados necessarios para as Categorias de item utilizadas no sistema
*  Com seus devidos construtores e metodos
 */
public class CategoriaItem {

    private String nomeCategoria;
    private int idCategoria;

    public CategoriaItem() {
    }

    public CategoriaItem(String nomeCategoria, int idCategoria) {
        this.nomeCategoria = nomeCategoria;
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return this.nomeCategoria;
    }

}

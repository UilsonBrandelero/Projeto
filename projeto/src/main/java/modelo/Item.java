
package modelo;

/**
 *Classe com os dados necessarios dos itens disponiveis para solicitação e doação
 * utilizados no sistema.
 * Com seus construtores e metodos
 *
 * 
 */
public class Item {
    private int idItem;
    private String nomeItem;
    private int idCategoriaItem;

    public Item() {
    }

    public Item(int idItem, String nomeItem, int idCategoriaItem) {
        this.idItem = idItem;
        this.nomeItem = nomeItem;
        this.idCategoriaItem = idCategoriaItem;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getIdCategoriaItem() {
        return idCategoriaItem;
    }

    public void setIdCategoriaItem(int idCategoriaItem) {
        this.idCategoriaItem = idCategoriaItem;
    }

    @Override
    public String toString() {
        return nomeItem;
    }
    
    
    
            
}

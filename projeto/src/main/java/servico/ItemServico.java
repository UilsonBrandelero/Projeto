/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Item;
import util.ConexaoBanco;

/**
 *
 * @author uilso
 */
public class ItemServico {
 
    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public ItemServico() {
    }
    
    public List<Item> buscaritens(int id_categoria_item){
        List<Item> itens = new ArrayList<>();
        String sql = "SELECT * FROM itens where id_categoria_item = ?";
        
        try {
            conexao = ConexaoBanco.getConnection();
            
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id_categoria_item);
            
            rs = stmt.executeQuery();
            while(rs.next()){
                int idItem = rs.getInt("id_item");
                int idCategoria = rs.getInt("id_categoria_item");
                String nome = rs.getString("nome_item");
                
                itens.add(new Item(idItem, nome, idCategoria));
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao buscar itens no banco "+ e.getMessage());
            return  null;
            
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                ConexaoBanco.fecharConexao(conexao);
            } catch (SQLException e) {
                System.err.println("Não fechou" + e.getMessage());
            }
        }
        return itens;
    }
}

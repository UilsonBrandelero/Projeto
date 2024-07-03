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
import modelo.CategoriaItem;
import util.ConexaoBanco;

/**
 *
 * @author uilso
 */
public class CategoriaItemServico {
    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    public List<CategoriaItem> buscaCategoria(){
        List<CategoriaItem> categorias = new ArrayList<>();
                
        String sql = "SELECT *FROM categoria_item";
        
        try {
            conexao = ConexaoBanco.getConnection();
            
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int idCategoria = rs.getInt("id_categoria");
                String nome = rs.getString("nome_categoria");
                
                categorias.add(new CategoriaItem(nome, idCategoria));
                
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar categorias no banco "+ e.getMessage());
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                ConexaoBanco.fecharConexao(conexao);
            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
        return categorias;
    }
}

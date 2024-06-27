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
import modelo.Cidade;
import modelo.Estado;
import util.ConexaoBanco;

/**
 *
 * @author uilso
 */
public class CidadeServico {
    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public CidadeServico() {
    }
    
    public List<Cidade> listaCidade(String uf){
        String sql = "Select nome,uf FROM municipio where uf = ?";
        List<Cidade> cidades = new ArrayList<>();
        
        try {
            conexao = ConexaoBanco.getConnection();
            
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, uf);
            
            rs = stmt.executeQuery();
            while (rs.next()){
                String ufCidade = rs.getString("uf");
                String nome = rs.getString("nome");
                cidades.add(new Cidade(nome, uf));
            }
        } catch (SQLException e) {
            System.out.println("Erroa ao selecionar dados "+ e.getMessage());
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
        return cidades;
    }
}

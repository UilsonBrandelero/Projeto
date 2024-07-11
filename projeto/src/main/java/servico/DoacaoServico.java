/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Doacao;
import util.ConexaoBanco;

/**
 *
 * @author uilso
 */
public class DoacaoServico {
     Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public DoacaoServico() {
    }
    
    public Doacao salvarDoacao(Doacao doacao){
        String sql = "INSERT INTO doacao (id_doador_doacao, id_centro_recebimento_destino_doacao,"
                + "id_requisicao_doacao, id_item_doado_doacao,quantidade_doada) "
                + "VALUES (?,?,?,?,?)";
        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, doacao.getIdDoador());
            stmt.setInt(2, doacao.getIdCentroRecebimentoDestino());
            stmt.setInt(3, doacao.getIdRequisicao());
            stmt.setInt(4, doacao.getIdItemDoado());
            stmt.setInt(5, doacao.getQuantidadeDoada());
            
            stmt.executeUpdate();
            System.out.println("Doação salva com sucesso");
        } catch (SQLException e) {
             System.out.println("Erro ao salvar doacao " +e.getMessage());
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
        return doacao;
    }
}

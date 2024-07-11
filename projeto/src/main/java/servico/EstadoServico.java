/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import modelo.Estado;
import util.ConexaoBanco;
import util.StatusRequisicao;

/**
 *
 * Classe para realizar operacoes com banco de dados na tabela de estados
 */
public class EstadoServico {

    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public EstadoServico() {
    }

    //Metodo que lista todos as siglas das UF's e aloca em um ArrayList de Objetos "Estado"
    public List<Estado> listaEstados() {
        String sql = "Select uf,id_estado FROM estado";
        List<Estado> estados = new ArrayList<>();

        try {
            conexao = ConexaoBanco.getConnection();

            stmt = conexao.prepareStatement(sql);

            rs = stmt.executeQuery();
            while (rs.next()) {
                int idEstado = rs.getInt("id_estado");
                String sigla = rs.getString("uf");
                estados.add(new Estado(sigla, idEstado));
            }
        } catch (SQLException e) {
            System.out.println("Erroa ao selecionar dados " + e.getMessage());
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
        return estados;
    }
    // Metodo que busca  a UF apenas dos centros Centros cadastrados
    public List<Estado> buscaEstadosComCentro(StatusRequisicao status) {
        List<Estado> estadosComCentro = new ArrayList<>();
        String sql = "SELECT DISTINCT  uf_centro_recebimento FROM requisicao "
                + "JOIN endereco_centro_recebimento ON id_centro_recebimento_endereco = id_centro_recebimento_requisicao WHERE status_requisicao = ?";
        try {
          conexao = ConexaoBanco.getConnection();
        stmt = conexao.prepareStatement(sql);
        stmt.setObject(1, status.toString(), Types.OTHER);
        rs = stmt.executeQuery();
        
        while(rs.next()) {
            String uf = rs.getString("uf_centro_recebimento");
            estadosComCentro.add(new Estado(uf, 0));
            
            
        }
            System.out.println("Estados com Centro de Recebimento encontrados");
        } catch (SQLException e) {
            System.out.println("Erro ao buscar estados com Centro de Recebimento " +e.getMessage());
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
        return estadosComCentro;
        
        
    }
}

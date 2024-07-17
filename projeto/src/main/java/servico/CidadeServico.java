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
import modelo.Cidade;
import util.ConexaoBanco;
import util.StatusRequisicao;

/**
 *Classe utilizada para relalizar operacões na tebela de "municipio" no banco de dados
 * 
 */
public class CidadeServico {

    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public CidadeServico() {
    }
    
/*
    Metodo que busca as cidades de um determina estado baseado na sigla do estado "uf"
    */
    public List<Cidade> listaCidade(String uf) {
        String sql = "Select nome,uf FROM municipio where uf = ? ORDER BY nome";
        List<Cidade> cidades = new ArrayList<>();

        try {
            conexao = ConexaoBanco.getConnection();

            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, uf);

            rs = stmt.executeQuery();
            while (rs.next()) {
                String ufCidade = rs.getString("uf");
                String nome = rs.getString("nome");
                cidades.add(new Cidade(nome, uf));
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
        return cidades;
    }
/*
    Metodo que busca pela tabela de requisições somente as cidades de um determinado estado definido "uf_centro_recebimento" 
    que estao com o "status_requisicao" definido pelo parametro do metodo
    */
    public List<Cidade> buscaCidadesComCentroAtivo(String uf_centro_recebimento,StatusRequisicao status) {
        List<Cidade> cidades = new ArrayList<>();
        String sql = "SELECT DISTINCT cidade_centro_recebimento FROM requisicao " +
"JOIN centro_recebimento ON id_centro_recebimento = id_centro_recebimento_requisicao " +
"JOIN endereco_centro_recebimento ON id_centro_recebimento_endereco = id_centro_recebimento_requisicao  " +
"WHERE uf_centro_recebimento = ? AND status_requisicao = ?";
        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, uf_centro_recebimento);
            stmt.setObject(2, status.toString(), Types.OTHER);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String cidade = rs.getString("cidade_centro_recebimento");
                cidades.add(new Cidade(cidade, "@"));

            }
            System.out.println("Cidades com Centro encontradas");

        } catch (SQLException e) {
            System.out.println("Erro ao buscar cidades com Centro " + e.getMessage());
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
        return cidades;
    }
}

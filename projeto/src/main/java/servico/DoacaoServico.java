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
import modelo.Doacao;
import util.ConexaoBanco;

/**
 *Classe destinada a realizar operações na tabela de doação do banco de dados
 * 
 */
public class DoacaoServico {

    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public DoacaoServico() {
    }
/*
    Metodo que insere uma doação no banco de dados a partir das informações geradas
    pela tela de realizar doações
    */
    public Doacao salvarDoacao(Doacao doacao) {
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
            System.out.println("Erro ao salvar doacao " + e.getMessage());
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
/*
    Medtodo para buscar as doações destinadas a um determinado Centro de Recebimento
    definido pelo parametro do metodo "id_centro_recebimento"
    */
    public List<Doacao> buscaDoacaoPorCentro(int id_centro_recebimento) {
        List<Doacao> doacoes = new ArrayList<>();
        String sql = "SELECT nome_item,quantidade_doada,cidade_doador,uf_doador FROM doacao "
                + "JOIN itens ON id_item = id_item_doado_doacao "
                + "JOIN endereco_doadores ON id_doador_endereco = id_doador_doacao WHERE id_centro_recebimento_destino_doacao = ?";
        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id_centro_recebimento);
            
                  rs =    stmt.executeQuery();
            
           
            while(rs.next()){
                String nomeItem = rs.getString("nome_item");
                int quantidadeDoada = rs.getInt("quantidade_doada");
                String cidade = rs.getString("cidade_doador");
                String uf = rs.getString("uf_doador");
                
                doacoes.add(new Doacao(nomeItem, quantidadeDoada, cidade, uf));
                
            }
            System.out.println("Doações Encontradas");

        } catch (SQLException e) {
            System.out.println("Erro ao buscar Doações "+e.getMessage());
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
        return doacoes;
    }

}

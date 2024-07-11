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
import modelo.Requisicao;
import util.ConexaoBanco;
import util.StatusRequisicao;

/**
 *
 * @author uilso
 */
public class RequisicaoServico {

    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public RequisicaoServico() {
    }

    public Requisicao salvarRequisicao(Requisicao requisicao) {
        String sql = "INSERT INTO requisicao (id_centro_recebimento_requisicao,id_item_requisicao,quantidade_item,status_requisicao)"
                + "VALUES(?,?,?,?)";

        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, requisicao.getIdCentroRequisitor());
            stmt.setInt(2, requisicao.getIdItenRequerido());
            stmt.setInt(3, requisicao.getQuantidade());
            stmt.setObject(4, requisicao.getStatusRequisicao().toString(), Types.OTHER);

            stmt.executeUpdate();
            System.out.println("RequisiÇão salva no com sucesso ");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar requisicao ");
            System.out.println(e.getMessage());
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
        return requisicao;
    }

    public Requisicao buscaRequisicaoPorId(int id_requisicao) {
        Requisicao requisicao = new Requisicao();
        String sql = "SELECT id_requisicao, id_centro_recebimento_requisicao, id_item_requisicao,quantidade_item,status_requisicao "
                + "FROM requisicao WHERE id_requisicao = ?";

        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id_requisicao);

            rs = stmt.executeQuery();

            if (rs.next()) {
                int idRequisicao = rs.getInt("id_requisicao");
                int idCentro = rs.getInt("id_centro_recebimento_requisicao");
                int idItem = rs.getInt("id_item_requisicao");
                int quiantidade = rs.getInt("quantidade_item");
                StatusRequisicao status = StatusRequisicao.valueOf(rs.getString("status_requisicao"));

                requisicao = new Requisicao(idRequisicao, idCentro, idItem, quiantidade, status);
            }

            System.out.println("Requisicao encontrada");
        } catch (SQLException e) {
            System.out.println("Erro ao buscar requisicao " + e.getMessage());
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
        return requisicao;
    }

    public List<Requisicao> buscaRequisicoesPorStatus(int id_centro_recebimento, int id_categoria_item, StatusRequisicao status) {
        /**
         * Metodo que busca Requisicao
         */
        List<Requisicao> requisicoes = new ArrayList<>();
        String sql = "SELECT id_requisicao, id_centro_recebimento_requisicao, id_item_requisicao,quantidade_item,id_categoria_item, nome_item, status_requisicao "
                + "FROM requisicao "
                + "JOIN itens on id_item = id_item_requisicao "
                + "WHERE id_centro_recebimento_requisicao = ? AND  id_categoria_item = ? AND status_requisicao = ?";

        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, id_centro_recebimento);
            stmt.setInt(2, id_categoria_item);
            stmt.setObject(3, status, Types.OTHER);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idRequisicao = rs.getInt("id_requisicao");
                int idCentro = rs.getInt("id_centro_recebimento_requisicao");
                int idItem = rs.getInt("id_item_requisicao");
                int quantidae = rs.getInt("quantidade_item");
                int idCategoria = rs.getInt("id_categoria_item");
                String nomeItem = rs.getString("nome_item");
                StatusRequisicao status2 = StatusRequisicao.valueOf(rs.getString("status_requisicao"));
                requisicoes.add(new Requisicao(idRequisicao, idCentro, idItem,
                        quantidae, idCategoria, nomeItem, status2));

            }
            System.out.println("Requisições encontradas. Categoria " + id_categoria_item + " Centro " + id_centro_recebimento);
        } catch (SQLException e) {
            System.out.println("Erro ao buscar requisições " + e.getMessage());
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
        return requisicoes;
    }

    public boolean atualizaQuantidadeRequisicao(int id_requisicao, int quantidade_atualizada) {
        String sql = "UPDATE requisicao SET quantidade_item = ? WHERE id_requisicao = ?";

        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, quantidade_atualizada);
            stmt.setInt(2, id_requisicao);

            stmt.executeUpdate();
            System.out.println("Quantidade da Requisição atualizada com sucesso");
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Quantidade Requisicao " + e.getMessage());
            return false;
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

    }

    public boolean atualizaStatusRequisicao(int id_requisicao, StatusRequisicao stausAtualizado) {

        String sql = "UPDATE requisicao SET status_requisicao = ? WHERE id_requisicao = ?";

        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setObject(1, stausAtualizado.toString(), Types.OTHER);
            stmt.setInt(2, id_requisicao);

            stmt.executeUpdate();

            System.out.println("Status da Requisição atualizada com sucesso");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Status Requisicao " + e.getMessage());
            return false;
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

    }
}

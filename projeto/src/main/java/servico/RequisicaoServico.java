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
 *Classe utilizada para realizar operações na tabela de "requisicao" no banco de dados
 * 
 */
public class RequisicaoServico {

    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public RequisicaoServico() {
    }
/*
    Metodo utilizado para slavar uma nova requisição no banco de dados a partir 
    das informações geradas pela tela de Solicitar Itens do sistema
    */
    public Requisicao salvarRequisicao(Requisicao requisicao) {
        //Busca se há requisiçoes com o item solicitado em ABERTO
        String sql2 = "select * from requisicao where id_centro_recebimento_requisicao = ? and id_item_requisicao = ?";
        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql2);
            stmt.setInt(1, requisicao.getIdCentroRequisitor());
            stmt.setInt(2, requisicao.getIdItemRequerido());
            rs = stmt.executeQuery();
            
            //Se houver a requisição já salva e atualizada somando a quantidade solicitada
            if (rs.next()) {
               
                int quantidadeTotal = rs.getInt("quantidade_total_requisitada") + requisicao.getQuantidade();
                int quantidadeSaldo = rs.getInt("quantidade_item") + requisicao.getQuantidade();
                String sql3 = "UPDATE requisicao SET quantidade_total_requisitada = ?, quantidade_item = ? "
                        + "where id_centro_recebimento_requisicao = ? and id_item_requisicao = ? and status_requisicao = 'ABERTA'";
                try {
                    conexao = ConexaoBanco.getConnection();
                    stmt = conexao.prepareStatement(sql3);
                    stmt.setInt(1, quantidadeTotal);
                    stmt.setInt(2, quantidadeSaldo);
                    stmt.setInt(3, requisicao.getIdCentroRequisitor());
                    stmt.setInt(4, requisicao.getIdItemRequerido());
                    stmt.executeUpdate();
                    System.out.println("Requisicao Atualizada");

                } catch (SQLException e) {
                    System.out.println("Erro ao atualizar requisicao");
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
            
            //Caso não houver é inserido uma nova requisição no banco    
            } else {
                String sql = "INSERT INTO requisicao (id_centro_recebimento_requisicao,id_item_requisicao,"
                        + "quantidade_item,status_requisicao,quantidade_total_requisitada)"
                        + "VALUES(?,?,?,?,?)";

                try {
                    conexao = ConexaoBanco.getConnection();
                    stmt = conexao.prepareStatement(sql);
                    stmt.setInt(1, requisicao.getIdCentroRequisitor());
                    stmt.setInt(2, requisicao.getIdItenRequerido());
                    stmt.setInt(3, requisicao.getQuantidade());
                    stmt.setObject(4, requisicao.getStatusRequisicao().toString(), Types.OTHER);
                    stmt.setInt(5, requisicao.getQuantidadeTotalRequisitada());

                    stmt.executeUpdate();
                    System.out.println("Requisição salva com sucesso ");
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
        } catch (SQLException e) {
            System.out.println("Erro ao verificar existencia de requisição " + e.getMessage());
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

    }
/*
    Metodo para buscar uma requisição a partir de seu "id_requisicao" definido 
    pelo parametro do metodo "id_requisicao"
    */
    public Requisicao buscaRequisicaoPorId(int id_requisicao) {
        Requisicao requisicao = new Requisicao();
        String sql = "SELECT id_requisicao, id_centro_recebimento_requisicao, id_item_requisicao,"
                + "quantidade_item,status_requisicao,quantidade_total_requisitada "
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
                int quantidadeTotal = rs.getInt("quantidade_total_requisitada");
                StatusRequisicao status = StatusRequisicao.valueOf(rs.getString("status_requisicao"));

                requisicao = new Requisicao(idRequisicao, idCentro, idItem, quiantidade, status, quantidadeTotal);
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
/*
    Metodo que busca as requisições de um determinado Centro de Recebimento com uma determinada Categoria de Item
    com um determinado Status de Requisição baseado nos parametros informados no metodo
    */
    public List<Requisicao> buscaRequisicoesPorStatus(int id_centro_recebimento, int id_categoria_item, StatusRequisicao status) {
        /**
         * Metodo que busca Requisicao
         */
        List<Requisicao> requisicoes = new ArrayList<>();
        String sql = "SELECT id_requisicao, id_centro_recebimento_requisicao, id_item_requisicao,quantidade_item,id_categoria_item, nome_item, status_requisicao,quantidade_total_requisitada "
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
                int quantidadeTotal = rs.getInt("quantidade_total_requisitada");
                StatusRequisicao statusRs = StatusRequisicao.valueOf(rs.getString("status_requisicao"));
                requisicoes.add(new Requisicao(idRequisicao, idCentro, idItem,
                        quantidae, idCategoria, nomeItem, statusRs, quantidadeTotal));

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
/*
    Metodo utilizado para atualizar a quantidade de item de um determinda requisicao 
    a partir de seu "id_requisicao"
    */
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
/*
    Metodo utilizado para atualizar o Status de uma determinada requisicao a partide 
    de seu "id_requisicao"
    */
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

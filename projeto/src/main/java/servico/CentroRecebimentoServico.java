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
import modelo.CentroRecebimento;
import util.ConexaoBanco;
import util.StatusRequisicao;
import util.UsuarioLogado;

/**
 *
 * @author uilso
 */
public class CentroRecebimentoServico {

    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    private static int idCadastroCentroRecebimento;

    public CentroRecebimento salvarCentoRecebimento(CentroRecebimento centro) {
        String sql = "INSERT INTO centro_recebimento "
                + "(nome_completo_centro_recebimento, "
                + "cpf_cnpj, "
                + "telefone_centro_recebimento,"
                + "email_centro_recebimento,"
                + "nome_centro_recebimento,"
                + "senha_centro_recebimento)"
                + "VALUES (?,?,?,?,?,?)";

        try {
            conexao = ConexaoBanco.getConnection();

            stmt = conexao.prepareStatement(sql, stmt.RETURN_GENERATED_KEYS);
            stmt.setString(1, centro.getNome());
            stmt.setString(2, centro.getCpf_cnpj());
            stmt.setString(3, centro.getTelefone());
            stmt.setString(4, centro.getEmail());
            stmt.setString(5, centro.getNomeCentroRecebimento());
            stmt.setString(6, centro.getSenha());

            stmt.executeUpdate();
            rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                idCadastroCentroRecebimento = rs.getInt("id_centro_recebimento");
                centro.setIdCentroRebebimento(rs.getInt("id_centro_recebimento"));
            }
            System.out.println("Dados salvos no banco");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar dados " + e.getMessage());

            return null;

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

        return centro;
    }

    public boolean consultaCentroRecebimentoLogin(String nome, String senha) {
        String nomeCentro = "";
        String senhaCentro = "";
        int idCentro = 0;
        String sql = "SELECT id_centro_recebimento, nome_completo_centro_recebimento, senha_centro_recebimento"
                + " FROM centro_recebimento WHERE nome_completo_centro_recebimento = ?";

        try {
            conexao = ConexaoBanco.getConnection();

            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);

            rs = stmt.executeQuery();

            if (rs.next()) {
                idCentro = rs.getInt("id_centro_recebimento");
                nomeCentro = rs.getString("nome_completo_centro_recebimento");
                senhaCentro = rs.getString("senha_centro_recebimento");

            }
            System.out.println("Busca realizada");
        } catch (SQLException e) {
            System.out.println("Erro ao realizar busca no banco " + e.getMessage());
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
        if (nomeCentro.equals(nome) && senhaCentro.equals(senha)) {
            UsuarioLogado usuarioLogado = new UsuarioLogado();
            usuarioLogado.setIdUsuario(idCentro);

            return true;
        } else {
            return false;
        }
    }

    public CentroRecebimento consultaCentroRecebimentoId(int id_centro_recebimento) {
        CentroRecebimento centroRecebimento = new CentroRecebimento();
        String sql = "SELECT id_centro_recebimento,"
                + "nome_completo_centro_recebimento,"
                + "cpf_cnpj,"
                + "email_centro_recebimento,"
                + "nome_centro_recebimento,"
                + "senha_centro_recebimento,"
                + "nome_centro_recebimento,"
                + "telefone_centro_recebimento "
                + "FROM centro_recebimento WHERE id_centro_recebimento = ?";

        try {
            conexao = ConexaoBanco.getConnection();

            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id_centro_recebimento);

            rs = stmt.executeQuery();

            if (rs.next()) {
                int idCentro = rs.getInt("id_centro_recebimento");
                String nome = rs.getString("nome_completo_centro_recebimento");
                String cpfCnpj = rs.getString("cpf_cnpj");
                String telefone = rs.getString("telefone_centro_recebimento");
                String eMail = rs.getString("email_centro_recebimento");
                String nomeCentroRecebimento = rs.getString("nome_centro_recebimento");
                String senha = rs.getString("senha_centro_recebimento");

                centroRecebimento = new CentroRecebimento(nome, cpfCnpj, telefone, eMail, nomeCentroRecebimento, senha, idCentro);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar dados no banco " + e.getMessage());
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
        return centroRecebimento;
    }

    public CentroRecebimento atualizarDadosCentro(CentroRecebimento centroAtualizado) {
        String sql = "UPDATE centro_recebimento SET nome_completo_centro_recebimento = ?,"
                + "cpf_cnpj = ?,"
                + "telefone_centro_recebimento = ?,"
                + "nome_centro_recebimento = ?,"
                + "email_centro_recebimento = ? WHERE id_centro_recebimento = ?";

        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, centroAtualizado.getNome());
            stmt.setString(2, centroAtualizado.getCpf_cnpj());
            stmt.setString(3, centroAtualizado.getTelefone());
            stmt.setString(4, centroAtualizado.getNomeCentroRecebimento());
            stmt.setString(5, centroAtualizado.getEmail());
            stmt.setInt(6, centroAtualizado.getIdCentroRebebimento());

            stmt.executeUpdate();
            System.out.println("Dados do Centro de Recebimento atualizados com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar dados do Centro de Recebimento " + e.getMessage());
            return null;

        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                ConexaoBanco.fecharConexao(conexao);
            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
        return centroAtualizado;
    }

    public boolean apagarCentroPorId(int id_centro_recebimento) {
        String sql = "DELETE FROM endereco_centro_recebimento WHERE id_centro_recebimento_endereco = ?;"
                + "DELETE FROM centro_recebimento WHERE id_centro_recebimento = ?;";
        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id_centro_recebimento);
            stmt.setInt(2, id_centro_recebimento);
            stmt.executeUpdate();

            System.out.println("Centro de Recebimento apagado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao apagar Centro de Recebimento" + e.getMessage());
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                ConexaoBanco.fecharConexao(conexao);
            } catch (SQLException e) {
                System.err.println("Erro ao fechar recursos: " + e.getMessage());
            }
        }
        return true;
    }
    // metodo que busca o ID e o Nome do centro de recebimento baseado na cidade
    // Bsuca pela tabela de requisição 
    public List<CentroRecebimento> buscaCentroPorCidade(String cidade,StatusRequisicao status) {
        List<CentroRecebimento> centros = new ArrayList<>();
        String sql = "SELECT DISTINCT id_centro_recebimento, nome_centro_recebimento FROM requisicao "
                + "JOIN centro_recebimento ON id_centro_recebimento = id_centro_recebimento_requisicao "
                + "JOIN endereco_centro_recebimento ON id_centro_recebimento_endereco = id_centro_recebimento_requisicao "
                + "WHERE cidade_centro_recebimento = ? AND status_requisicao = ?";
        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cidade);
            stmt.setObject(2, status.toString(), Types.OTHER);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idCentro = rs.getInt("id_centro_recebimento");
                String nomeCentro = rs.getString("nome_centro_recebimento");
                centros.add(new CentroRecebimento(nomeCentro, idCentro));
            }
            System.out.println("Centros buscados com sucesso para a cidade " + cidade);
        } catch (SQLException e) {
            System.out.println("Erro ao buscar centros na cidade " + cidade);
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
        return centros;

    }

    public static int getIdCadastroCentroRecebimento() {
        return idCadastroCentroRecebimento;
    }

}

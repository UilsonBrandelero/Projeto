/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Endereco;
import util.ConexaoBanco;

/**
 *
 * Classe utilizada para realizar operações no banco de dados na tabela de
 * enderecos
 */
public class EnderecoServico {

    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public EnderecoServico() {

    }

    // Metodo utilizado para adicionar enderecos dos usuarios cadastrados como doadores
    public Endereco salvarEnderecoDoador(Endereco endereco, int id_doador) {

        String sql = "INSERT INTO endereco_doadores (rua_doador, bairro_doador, "
                + "numero_doador, complemento_doador,cep_doador,cidade_doador,uf_doador,id_doador_endereco)"
                + "VALUES (?,?,?,?,?,?,?,?)";

        try {
            conexao = ConexaoBanco.getConnection();

            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, endereco.getRua());
            stmt.setString(2, endereco.getBairro());
            stmt.setInt(3, endereco.getNumero());
            stmt.setString(4, endereco.getComplemento());
            stmt.setString(5, endereco.getCep());
            stmt.setString(6, endereco.getCidadeEndereco());
            stmt.setString(7, endereco.getEstadoEndereco());
            stmt.setInt(8, DoadorServico.getIdCadastroDoador());

            stmt.executeUpdate();
            System.out.println("Salvou o endereco no banco");

        } catch (SQLException e) {
            System.out.println("Não salvou o endereco no banco " + e.getMessage());
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
        return endereco;
    }
// Metodo utilizado para adicionar enderecos dos usuarios cadastrados como Centro de Recebimento

    public Endereco slavarEnderecoCentroRecebimento(Endereco enderecoCentro, int idCentroRecebimento) {
        String sql = "INSERT INTO endereco_centro_recebimento "
                + "(id_centro_recebimento_endereco,"
                + "uf_centro_recebimento,"
                + "cidade_centro_recebimento,"
                + "cep_centro_recebimento,"
                + "rua_centro_recebimento,"
                + "bairro_centro_recebimento,"
                + "nro_centro_recebimento,"
                + "complemento_centro_recebimento)"
                + "VALUES (?,?,?,?,?,?,?,?)";

        try {
            conexao = ConexaoBanco.getConnection();

            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, CentroRecebimentoServico.getIdCadastroCentroRecebimento());
            stmt.setString(2, enderecoCentro.getEstadoEndereco());
            stmt.setString(3, enderecoCentro.getCidadeEndereco());
            stmt.setString(4, enderecoCentro.getCep());
            stmt.setString(5, enderecoCentro.getRua());
            stmt.setString(6, enderecoCentro.getBairro());
            stmt.setInt(7, enderecoCentro.getNumero());
            stmt.setString(8, enderecoCentro.getComplemento());

            stmt.executeUpdate();
            System.out.println("Endereço salvo com sucesso no banco");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar endereco no banco " + e.getMessage());
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

        return enderecoCentro;
    }

    /*
    Metodo utilizado para buscar um determinado endereço de Doador a partir do "id_doador"
     */
    public Endereco buscaEnderecoDoadorPorId(int id_usuario) {
        Endereco enderecoBuscado = new Endereco();
        String sql = ("SELECT id_endereco_doador, id_doador_endereco,rua_doador, bairro_doador,numero_doador,complemento_doador,"
                + "cep_doador,cidade_doador,uf_doador FROM endereco_doadores WHERE id_doador_endereco = ? ");

        conexao = ConexaoBanco.getConnection();
        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id_usuario);

            rs = stmt.executeQuery();

            if (rs.next()) {
                int idEndereco = rs.getInt("id_endereco_doador");
                String rua = rs.getString("rua_doador");
                String bairro = rs.getString("bairro_doador");
                int numero = rs.getInt("numero_doador");
                String complemento = rs.getString("complemento_doador");
                String cep = rs.getString("cep_doador");
                String cidade = rs.getString("cidade_doador");
                String uf = rs.getString("uf_doador");
                int idDoadorEndereco = rs.getInt("id_doador_endereco");

                enderecoBuscado = new Endereco(uf, cidade, cep, rua, bairro, numero, complemento, idEndereco);

            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar endereço " + e.getMessage());
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

        return enderecoBuscado;
    }

    /*
    Metodo utilizado para buscar um determinado endereço de um Centro de Recebimento
    a partir do "id_centro_recebimento"
     */
    public Endereco buscaEnderecoCentroRecebimentoPorId(int id_centro_recebimento_endereco) {
        Endereco enderecoBuscado = new Endereco();
        String sql = "SELECT id_endereco_centro_recebimento,"
                + "cep_centro_recebimento,"
                + "rua_centro_recebimento,"
                + "bairro_centro_recebimento,"
                + "nro_centro_recebimento,"
                + "complemento_centro_recebimento,"
                + "cidade_centro_recebimento,"
                + "uf_centro_recebimento FROM endereco_centro_recebimento "
                + "WHERE id_centro_recebimento_endereco = ?";

        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id_centro_recebimento_endereco);

            rs = stmt.executeQuery();

            if (rs.next()) {
                int idEndereco = rs.getInt("id_endereco_centro_recebimento");
                String rua = rs.getString("rua_centro_recebimento");
                String bairro = rs.getString("bairro_centro_recebimento");
                int numero = rs.getInt("nro_centro_recebimento");
                String complemento = rs.getString("complemento_centro_recebimento");
                String cep = rs.getString("cep_centro_recebimento");
                String cidade = rs.getString("cidade_centro_recebimento");
                String uf = rs.getString("uf_centro_recebimento");

                enderecoBuscado = new Endereco(uf, cidade, cep, rua, bairro, numero, complemento, idEndereco);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar endereço");
            JOptionPane.showMessageDialog(null, "Erro ao buscar endereco no banco", "Erro", JOptionPane.ERROR_MESSAGE);
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
        return enderecoBuscado;

    }

    /*
    Metodo utilizado para atualizar as informações de endereço de um Doador a partir
    do "id_doador" e as informações fornecidas pela tela de atualizar endereço do sistema
     */
    public Endereco atualizaEnderecoDoador(Endereco novoEndereco, int idDoador) {
        String sql = "UPDATE endereco_doadores SET rua_doador = ?, bairro_doador = ?, numero_doador= ?,complemento_doador = ?, cep_doador =?,"
                + "cidade_doador = ?, uf_doador = ? WHERE id_doador_endereco = ?  ";
        try {
            conexao = ConexaoBanco.getConnection();

            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, novoEndereco.getRua());
            stmt.setString(2, novoEndereco.getBairro());
            stmt.setInt(3, novoEndereco.getNumero());
            stmt.setString(4, novoEndereco.getComplemento());
            stmt.setString(5, novoEndereco.getCep());
            stmt.setString(6, novoEndereco.getCidadeEndereco());
            stmt.setString(7, novoEndereco.getEstadoEndereco());
            stmt.setInt(8, idDoador);

            stmt.executeUpdate();
            System.out.println("Endereço do Doador atualizado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar endereço do Doador " + e.getMessage());
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

        return novoEndereco;
    }

    /*
    Metodo utilizado para atualizar as informações de endereço de um Centro de Recebimento a partir
    do "id_centro_recebimento" e as informações fornecidas pela tela de atualizar endereço do sistema
     */
    public Endereco atualizarEnderecoCentro(Endereco enderecoAtualizado, int id_centro_recebimento) {
        String sql = "UPDATE endereco_centro_recebimento SET rua_centro_recebimento = ?,"
                + "bairro_centro_recebimento = ?,"
                + "nro_centro_recebimento = ?,"
                + "complemento_centro_recebimento = ?,"
                + "cidade_centro_recebimento = ?,"
                + "uf_centro_recebimento = ? WHERE id_centro_recebimento_endereco = ?";

        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, enderecoAtualizado.getRua());
            stmt.setString(2, enderecoAtualizado.getBairro());
            stmt.setInt(3, enderecoAtualizado.getNumero());
            stmt.setString(4, enderecoAtualizado.getComplemento());
            stmt.setString(5, enderecoAtualizado.getCidadeEndereco());
            stmt.setString(6, enderecoAtualizado.getEstadoEndereco());
            stmt.setInt(7, id_centro_recebimento);

            stmt.executeUpdate();
            System.out.println("Endereco do Centro de Recebimento atualizado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualzar Endereco do Centro de Recebimento " + e.getMessage());
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
        return enderecoAtualizado;
    }

}

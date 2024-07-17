package servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Doador;
import modelo.Endereco;
import util.ConexaoBanco;
import util.UsuarioLogado;

/**
 *
 * Classe utilizada para realizar operações no banco de dados na tabela de
 * doadores.
 */
public class DoadorServico {

    Connection conexao = null;
    PreparedStatement stmt = null;
    // PreparedStatement stmt2 = null;
    ResultSet rs = null;

    String nomeDoador = "";
    String senhaDoador = "";

    private static int idCadastroDoador;

    public DoadorServico() {

    }

    //Metodo utilizado para adicionar dados de um novo usuario cadastrado como doador no banco
    public Doador salvarNovoDoador(Doador doador) {
        String sql = "INSERT INTO doadores (nome_doador, cpf_cnpj,telefone_doador, email_doador, senha_doador)"
                + "VALUES(?,?,?,?,?);"
                + "";
        try {
            conexao = ConexaoBanco.getConnection();

            stmt = conexao.prepareStatement(sql, stmt.RETURN_GENERATED_KEYS);

            stmt.setString(1, doador.getNome());
            stmt.setString(2, doador.getCpf_cnpj());
            stmt.setString(3, doador.getTelefone());
            stmt.setString(4, doador.getEmail());
            stmt.setString(5, doador.getSenha());

            stmt.executeUpdate();
            rs = stmt.getGeneratedKeys();
            System.out.println("Deu boa. Dados salvos no banco ");

            rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                idCadastroDoador = rs.getInt("id_doador");
                doador.setIdDoador(rs.getInt("id_doador"));
            }

        } catch (SQLException e) {
            System.err.println("Deu ruim. Dados não foram salvos " + e.getMessage());
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
        return doador;
    }

    //Metodo utilizado para validar informacçõs de login.
    //Os argumentos do metodo são as entradas do usuario na tela de login 
    public boolean consultaDoadorLogin(String nome, String senha) {
        int idDoador = 0;

        String sql = "SELECT nome_doador, senha_doador, id_doador FROM doadores WHERE nome_doador = ? ";

        try {
            // Obtendo a conexão
            conexao = ConexaoBanco.getConnection();

            // Preparando a instrução SQL
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);

            // Executando o comando SQL
            rs = stmt.executeQuery();

            // Processando os resultados
            if (rs.next()) {

                nomeDoador = rs.getString("nome_doador");
                senhaDoador = rs.getString("senha_doador");
                idDoador = rs.getInt("id_doador");
            }
            System.out.println("Deu boa");

        } catch (SQLException e) {
            System.err.println("Deu ruim" + e.getMessage());
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
        if (nomeDoador.equals(nome) && senhaDoador.equals(senha)) {

            UsuarioLogado usuarioLogado = new UsuarioLogado();
            usuarioLogado.setIdUsuario(idDoador);
            return true;

        } else {
            return false;

        }

    }

    /*
    Metodo utilizado para realizar busca dos registros de um determinado Doador definido
    a partir do parametro "id_doador" do metodo
     */

    public Doador consultaDoadorPorId(int id_doador) {
        Doador doador = new Doador();
        String sql = "SELECT id_doador, nome_doador, cpf_cnpj,telefone_doador, email_doador,senha_doador FROM doadores WHERE id_doador = ?";
        try {
            // Obtendo a conexão
            conexao = ConexaoBanco.getConnection();

            // Preparando a instrução SQL
            stmt = conexao.prepareStatement(sql);
            stmt.setLong(1, id_doador);

            // Executando o comando SQL
            rs = stmt.executeQuery();

            // Processando o resultado
            if (rs.next()) {

                int idDoador = rs.getInt("id_doador");
                String nome = rs.getString("nome_doador");
                String cpfCnpj = rs.getString("cpf_cnpj");
                String telefone = rs.getString("telefone_doador");
                String email = rs.getString("email_doador");
                String senha = rs.getString("senha_doador");

                doador = new Doador(idDoador, nome, cpfCnpj, telefone, email, senha);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao selecionar dados: " + e.getMessage());
        } finally {
            // Fechando os recursos
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

        return doador;
    }

    /*
    Metodo que atualiza os dados de cadastro de um doador a partir das informações 
    geradas pela tela de atualizar cadastro do sistema
     */
    public Doador atualizaDoador(Doador doadorAtualizado) {
        String sql = "UPDATE doadores SET nome_doador = ?, cpf_cnpj = ?,telefone_doador = ?, email_doador = ? "
                + "WHERE id_doador = ? ";
        try {
            conexao = ConexaoBanco.getConnection();

            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, doadorAtualizado.getNome());
            stmt.setString(2, doadorAtualizado.getCpf_cnpj());
            stmt.setString(3, doadorAtualizado.getTelefone());
            stmt.setString(4, doadorAtualizado.getEmail());
            stmt.setInt(5, doadorAtualizado.getIdDoador());

            stmt.executeUpdate();
            System.out.println("Dados de Doador atualizados com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar dados do Doador");
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
        return doadorAtualizado;
    }
/*
    Metodo que exclui do abnco os regidtros de um determinado Doador a partir de 
    seu "id_doador" de cadastro
    */
    public boolean apagarDoadorPorId(int id_doador) {
        String sql = "DELETE FROM endereco_doadores WHERE id_doador_endereco = ?";
        String sql2 = "DELETE FROM doadores WHERE id_doador = ?;";
        try {
            conexao = ConexaoBanco.getConnection();

            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id_doador);

            stmt.executeUpdate();

            stmt = conexao.prepareStatement(sql2);
            stmt.setInt(1, id_doador);

            stmt.executeUpdate();

            System.out.println("Doador apagado com Sucesso");

        } catch (SQLException e) {
            System.out.println("Erro ao apagar doador no id = " + id_doador + e.getMessage());
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

    public static int getIdCadastroDoador() {
        return idCadastroDoador;
    }

}

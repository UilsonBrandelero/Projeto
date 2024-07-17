/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.RuaBairro;
import util.ConexaoBanco;

/**
 *
 * Classe utilizada para realizar operações na tabela de "logradouro" do banco de dados
 */
public class RuaBairroServico {

    Connection conexao = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
/*
    Metodo que busca o nome da rua e nome do bairro a partir de um determinado CEP
    informado no atributo do metodo
    */
    public RuaBairro buscaRuaBairro(String cep) {
        RuaBairro ruaBairro = null;

        String sql = "SELECT descricao, descricao_bairro FROM logradouro WHERE CEP = ?";

        try {
            conexao = ConexaoBanco.getConnection();
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cep);
            rs = stmt.executeQuery();
            if (rs.next()) {
                String rua = rs.getString("descricao");
                String bairro = rs.getString("descricao_bairro");
                ruaBairro = new RuaBairro(rua, bairro);

            }
            System.out.println("Rua e Bairro encontrados com sucesso");

        } catch (SQLException e) {
            System.out.println("Erro ao buscar rua e bairro para CEP: " + cep);
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
        return ruaBairro;
    }
}

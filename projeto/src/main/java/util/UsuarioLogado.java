/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import modelo.CentroRecebimento;
import modelo.Doador;
import modelo.Endereco;

/**
 Classe utilizada para armazenar informações do usuario que acessou o sistema 
 */
public class UsuarioLogado {

    private static int idUsuario;
    private static TipoUsuario tipoUsuario;
    private static Doador doadorLogado;
    private static CentroRecebimento centroLogado;
    private static Endereco enderecoUsuarioLogago;

    public UsuarioLogado() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public static void setIdUsuario(int idUsuario) {
        UsuarioLogado.idUsuario = idUsuario;
    }

    public static void setTipoUsuario(TipoUsuario tipoUsuario) {
        UsuarioLogado.tipoUsuario = tipoUsuario;
    }

    public static Doador getDoadorLogado() {
        return doadorLogado;
    }

    public static void setDoadorLogado(Doador doadorLogado) {
        UsuarioLogado.doadorLogado = doadorLogado;
    }

    public static Endereco getEnderecoUsuarioLogado() {
        return enderecoUsuarioLogago;
    }

    public static void setEnderecoUsuarioLogado(Endereco enderecoDoador) {
        UsuarioLogado.enderecoUsuarioLogago = enderecoDoador;
    }

    public static CentroRecebimento getCentroLogado() {
        return centroLogado;
    }

    public static void setCentroLogado(CentroRecebimento centroLogado) {
        UsuarioLogado.centroLogado = centroLogado;
    }
    public void logOf(){
        this.centroLogado = null;
        this.doadorLogado = null;
        this.enderecoUsuarioLogago= null;
        this.idUsuario = 0;
        this.tipoUsuario = null;
    }

}

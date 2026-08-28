/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import model.Usuario;
/**
 *
 * @author WESLLEIOLIVEIRADAROS
 */
public class SessaoUsuario {

    private static Usuario usuarioLogado;

    public static void iniciar(Usuario usuario) {

        usuarioLogado = usuario;
    }

    public static Usuario getUsuarioLogado() {

        return usuarioLogado;
    }

    public static boolean isMaster() {

        return usuarioLogado != null
                && "MASTER".equalsIgnoreCase(
                        usuarioLogado.getNivel()
                );
    }

    public static boolean isUser() {

        return usuarioLogado != null
                && "USER".equalsIgnoreCase(
                        usuarioLogado.getNivel()
                );
    }

    public static void encerrar() {

        usuarioLogado = null;
    }
}


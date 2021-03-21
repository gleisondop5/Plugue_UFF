/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.plugue.dao;

/**
 *
 * @author rodol
 */
public interface UsuarioDAO {
    
    public void criarUsuario(Object object);
    public void acessarConta();
    public void desconectarConta();
    public void excluirUsuario();
    public void resetarSenha();
    public void atualizarusuario();
    public void interessar();
    
}

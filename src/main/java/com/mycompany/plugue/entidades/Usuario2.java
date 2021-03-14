/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.plugue.entidades;
    
/**
 *
 * @author rodol
 */
public abstract class Usuario2 {
    
    private int id;
    
    private String nome;
    
    private String contato;
    
    private String senha;
    
    public Usuario2(){
        
    }
    
    public abstract void criarUsuario();
    
    public abstract void acessarConta();
    
    public abstract void desconectarConta();
    
    public abstract void excluirUsuario();
    
    public abstract void resetarSenha();
    
    public abstract void atualizarusuario();
    
    public abstract void interessar();
       
}

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
public class Aluno extends Usuario {
    
    private String curso;
    
    public Aluno(){
      super();  
    }

    @Override
    public void criarUsuario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void acessarConta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void desconectarConta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void excluirUsuario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void resetarSenha() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void atualizarusuario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void interessar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cadastrarIdeia(){
        
    }
    
    public void ecluirIdeia(){
        
    }
    
    public void atualizarIdeia(){
        
    }
}

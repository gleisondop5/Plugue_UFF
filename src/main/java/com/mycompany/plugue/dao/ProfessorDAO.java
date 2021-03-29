/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.plugue.dao;

import com.mycompany.plugue.persistencia.Professor;
import com.mycompany.plugue.utils.JPAUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author rodol
 */
public class ProfessorDAO implements UsuarioDAO{
    
    private EntityManager entityManager;

    @Override
    public void criarUsuario(Object object) {
        entityManager = JPAUtil.getEM();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(object);
        transaction.commit();
        entityManager.close();
    }

    @Override
    public void acessarConta(String login, String senha) {
        entityManager = JPAUtil.getEM();
    }

    @Override
    public void desconectarConta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetarSenha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Professor atualizarProfessor(Long id, Professor novoProfessor) {
        entityManager = JPAUtil.getEM();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Professor professor = entityManager.find(Professor.class, id);
        
        professor.setNome(novoProfessor.getNome());
        professor.setContato(novoProfessor.getContato());
        professor.setSenha(novoProfessor.getSenha());
        professor.setPaginaPessoal(novoProfessor.getPaginaPessoal());
        professor.setIdeias(novoProfessor.getIdeias());
        entityManager.persist(novoProfessor);
        transaction.commit();
        entityManager.close();
        
        return novoProfessor;
        
    }

    @Override
    public void interessar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}

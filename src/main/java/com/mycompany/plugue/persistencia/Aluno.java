/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.plugue.persistencia;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author rodol
 */
@Entity
public class Aluno extends Usuario{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String curso;
    
    @ManyToMany(mappedBy="alunos")
    private List<Projeto> projetos;

    @SuppressWarnings("override")
    public Long getId() {
        return id;
    }

    @SuppressWarnings("override")
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setAlunos(List<Projeto> projetos) {
        this.projetos = projetos;
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
    
    public void cadastrarIdeia(){
        
    }
    
    public void excluirIdeia(){
        
    }
    
    public void atualizarIdeia(){
        
    }    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.plugue.persistencia.Aluno[ id=" + id + " ]";
    }
    
}

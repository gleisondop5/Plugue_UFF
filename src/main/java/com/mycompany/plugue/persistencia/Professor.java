/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.plugue.persistencia;

import com.mycompany.plugue.dao.ProfessorDAO;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Milena
 */
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Professor extends Usuario{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String paginaPessoal;
    
    @ManyToMany(mappedBy="ideias")
    private List<Ideia> ideias;
    

    @SuppressWarnings("override")
    public Long getId() {
        return id;
    }

    @SuppressWarnings("override")
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getPaginaPessoal() {
        return paginaPessoal;
    }

    public void setPaginaPessoal(String paginaPessoal) {
        this.paginaPessoal = paginaPessoal;
    }
    
    public void cadastrarProjeto(){
        
    }
    
    public void excluirProjeto(){
        
    }
    
    public void atualizarProjeto(){
        
    } 
    
    public List<Ideia> getIdeias() {
        return ideias;
    }
    
    public void setIdeias(List<Ideia> ideias) {
        this.ideias = ideias;
    }

    @Override
    public void criarUsuario() {
        Professor professor = new Professor();
        professor.setNome("João");
        professor.setContato("joão@gmail.com");
        professor.setSenha("1234");
        professor.setPaginaPessoal("joao.com.br");
        ProfessorDAO professorDao = new ProfessorDAO();
        professorDao.criarUsuario(professor);
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.mycompany.plugue.persistencia.Professor[ id=" + id + " ]";
    }
    
}

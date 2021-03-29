/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.plugue.service;

import com.mycompany.plugue.dao.ProfessorDAO;
import com.mycompany.plugue.persistencia.Ideia;
import com.mycompany.plugue.persistencia.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.json.JsonObject;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author rodol
 */
@Path("professor")
@RequestScoped
public class ProfessorService {

    @Context
    private UriInfo context;

    public ProfessorService() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "teste";
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void salvar(JsonObject event) {
        Professor prof = new Professor();
        List<Ideia> ideias = new ArrayList();
        prof.setNome(event.getString("nome"));
        prof.setContato(event.getString("contato"));
        prof.setSenha(event.getString("senha"));
        prof.setPaginaPessoal(event.getString("paginaPessoal"));
        prof.setIdeias(ideias);
        
        ProfessorDAO profDao = new ProfessorDAO();
        profDao.criarUsuario(prof);
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Professor atualizar(@PathParam("id") Long id, JsonObject event) {
        Professor prof = new Professor();
        List<Ideia> ideias = new ArrayList();
        prof.setNome(event.getString("nome"));
        prof.setContato(event.getString("contato"));
        prof.setSenha(event.getString("senha"));
        prof.setPaginaPessoal(event.getString("paginaPessoal"));
        prof.setIdeias(ideias);
        
        ProfessorDAO profDao = new ProfessorDAO();
        return profDao.atualizarProfessor(id, prof);
    }
    
}

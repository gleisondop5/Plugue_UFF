/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.plugue.services;

import com.mycompany.plugue.dao.IdeiaDAO;
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
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Milen
 */
@Path("ideias")
@RequestScoped
public class IdeiaResource {

    public IdeiaResource() {
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<Ideia> listaIdeias () {
        IdeiaDAO ideiaDao = new IdeiaDAO();
        return ideiaDao.getIdeas();
    }
    
    @POST
    public void novaIdeia(@FormParam("area") String area, @FormParam("descricao") String descricao, @FormParam("titulo") String titulo) {
        List<Professor> list = new ArrayList<>();
        Ideia ideia = new Ideia();
        ideia.setAreaInteresse(area);
        ideia.setDescricao(descricao);
        ideia.setTitulo(titulo);
        ideia.setProfessores(list);
        
        IdeiaDAO ideiaDao = new IdeiaDAO();
        ideiaDao.newIdeia(ideia);
    }
}

package com.mycompany.plugue.utils;

import com.mycompany.plugue.dao.IdeiaDAO;
import com.mycompany.plugue.persistencia.Ideia;
import com.mycompany.plugue.persistencia.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class aluno {
    @POST
    @Path("/ideia")
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
    
    @GET
    @Path("/ideias")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Ideia> listaIdeias () {
        IdeiaDAO ideiaDao = new IdeiaDAO();
        return ideiaDao.getIdeas();
    }
}

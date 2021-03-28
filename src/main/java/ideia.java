/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.plugue.dao.IdeiaDAO;
import com.mycompany.plugue.dao.ProfessorDAO;
import com.mycompany.plugue.dao.AlunoDao;
import com.mycompany.plugue.persistencia.Aluno;
import com.mycompany.plugue.persistencia.Ideia;
import com.mycompany.plugue.persistencia.Professor;
import com.mycompany.plugue.persistencia.Projeto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Milen
 */
@WebServlet(urlPatterns = {"/ideia"})
public class ideia extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /****IDEIA****
        List<Professor> list = new ArrayList<>();
        Ideia ideia = new Ideia();
        ideia.setAreaInteresse("Ciências");
        ideia.setDescricao("Qualquer coisa");
        ideia.setTitulo("Titulo");
        ideia.setProfessores(list);
        
        IdeiaDAO ideiaDao = new IdeiaDAO();
        ideiaDao.newIdeia(ideia);*/
        
        /******PROFESSOR****************
        Professor professor = new Professor();
        List<Ideia> ideias = new ArrayList();
        professor.setNome("Milena Veríssimo");
        professor.setContato("milena@gmail.com");
        professor.setPaginaPessoal("milena.com.br");
        professor.setSenha("****");
        professor.setIdeias(ideias);
        
        ProfessorDAO professorDao = new ProfessorDAO();
        professorDao.criarUsuario(professor);*/
        
        Aluno aluno = new Aluno();
        List<Projeto> projeto = new ArrayList();
        aluno.setNome("Gleison");
        aluno.setCurso("gleison@gmail.com");
        aluno.setSenha("****");
        aluno.setProjetos(projeto);
        
        AlunoDao alunoDao = new AlunoDao();
        alunoDao.criarUsuario(aluno);
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ideia</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ideia at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

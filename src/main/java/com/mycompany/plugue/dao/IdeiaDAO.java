package com.mycompany.plugue.dao;
import com.mycompany.plugue.persistencia.Ideia;
import com.mycompany.plugue.utils.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 * @author Milena
 */
public class IdeiaDAO {
    
    private EntityManager entityManager;
    
    public void newIdeia(Ideia ideia){
        entityManager = JPAUtil.getEM();
        EntityTransaction transaction = entityManager.getTransaction();
        // Start a resource transaction
        transaction.begin();
        // Make an instance managed and persistent.
        entityManager.persist(ideia);
        // Commit the current resource transaction, writing any unflushed changes to the database.
        transaction.commit();
        entityManager.close();
    }
    
    public void updateIdeia(Ideia ideia) {
        
    }
    
    public Ideia getIdea(String id) {
        entityManager = JPAUtil.getEM();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        
        Ideia ideia = entityManager.find(Ideia.class, id);
        transaction.commit();
        entityManager.close();
        
        return ideia;
    }
    
    public List<Ideia> getIdeas(){
        String sqlQuery = "SELECT e FROM Ideia e";
        entityManager = JPAUtil.getEM();
        Query query = entityManager.createQuery(sqlQuery);
        List<Ideia> listaIdeias = query.getResultList();
        entityManager.close();
        return listaIdeias;
    }
}

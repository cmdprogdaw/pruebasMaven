package pruebasMaven.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AsignaturaBean;

public class Connection {
	
	private static EntityManager entityManager = null;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Connection() {
 
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.cris.pruebasMaven.MySql.H2");
    	entityManager = emf.createEntityManager();
    	
    }

    public static EntityManager getEntityManager() {
    	
    	if(entityManager==null) {
    		
    		new Connection();
    	}
    	
		return entityManager;
	}
    
    
    
}

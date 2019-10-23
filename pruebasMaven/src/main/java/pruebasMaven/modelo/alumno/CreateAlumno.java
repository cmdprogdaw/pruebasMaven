package pruebasMaven.modelo.alumno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.util.Connection;

public class CreateAlumno {

	public void create(AlumnoBean alumno) {
		
		//me va a permitir en jpa realizar operaciones / objeto de enlace total con la base de datos
		//interfaz                        clase          conex bd / singleton
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.cris.pruebasMaven.MySql.H2");
		//EntityManager entityManager = emf.createEntityManager();//interfaz
		
		EntityManager entityManager = Connection.getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(alumno);
		entityManager.getTransaction().commit();
		
		//entityManager.close();
		
	}

}

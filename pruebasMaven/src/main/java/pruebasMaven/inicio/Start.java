package pruebasMaven.inicio;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.modelo.profesor.CreateProfesor;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;
import pruebasMaven.negocio.ProfesorBean;
import pruebasMaven.util.Connection;

public class Start {

	public static void main(String[] args) {
		
		AsignaturaBean tic = new AsignaturaBean();
		tic.setNombre("Informática");
		
		AsignaturaBean lengua = new AsignaturaBean();
		lengua.setNombre("Lengua");
		
		AsignaturaBean mates = new AsignaturaBean();
		mates.setNombre("Mates");
		
		AsignaturaBean historia = new AsignaturaBean();
		historia.setNombre("Historia");
		
			
		AlumnoBean cris = new AlumnoBean();
		cris.setNombre("Cristina");
		cris.setTelefono("666333444");
		cris.setCiudad("Mieres");
		//cris.setAsignatura(tic);
		
		
		AlumnoBean adri = new AlumnoBean();
		adri.setNombre("Adrián");
		adri.setTelefono("667755443");
		adri.setCiudad("Llanera");
		//adri.setAsignatura(tic);
		
		
		tic.addAlumno(cris);
		tic.addAlumno(adri);
		
		
		ProfesorBean marcos = new ProfesorBean();
		marcos.setNombre("Marcos");
		marcos.setDni("72745432A");
		
		
		
		CreateAsignatura createAsignatura = new CreateAsignatura();
		createAsignatura.create(tic);
		createAsignatura.create(lengua);
		createAsignatura.create(mates);
		createAsignatura.create(historia);
		
		
		CreateAlumno createAlumno = new CreateAlumno();
		createAlumno.create(cris);
		createAlumno.create(adri);
		
		
		CreateProfesor createProfesor = new CreateProfesor();
		createProfesor.create(marcos);
		
		marcos.addAsignatura(tic);
		
		
		AsignaturaBean nueva = Connection.getEntityManager().find(AsignaturaBean.class, 1L);
		System.out.println(nueva);
		
		ProfesorBean nuevo = Connection.getEntityManager().find(ProfesorBean.class, 1L);
		System.out.println(nuevo);
		
		Connection.getEntityManager().close();
		
	}

}

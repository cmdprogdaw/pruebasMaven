package pruebasMaven.inicio;

import pruebasMaven.modelo.alumno.CreateAlumno;
import pruebasMaven.modelo.alumno.DeleteAlumno;
import pruebasMaven.modelo.asignatura.CreateAsignatura;
import pruebasMaven.negocio.AlumnoBean;
import pruebasMaven.negocio.AsignaturaBean;

public class Start {

	public static void main(String[] args) {
		
		AsignaturaBean tic = new AsignaturaBean();
		tic.setNombre("Informática");
		
		AsignaturaBean lengua = new AsignaturaBean();
		lengua.setNombre("Lengua");
		
		CreateAsignatura createAsignatura = new CreateAsignatura();
		createAsignatura.create(tic);
		createAsignatura.create(lengua);
		
		
		
		AlumnoBean cris = new AlumnoBean();
		cris.setNombre("Cristina");
		cris.setTelefono("666333444");
		cris.setCiudad("Mieres");
		cris.setAsignatura(tic);
		
		AlumnoBean adri = new AlumnoBean();
		adri.setNombre("Adrián");
		adri.setTelefono("667755443");
		adri.setCiudad("Llanera");
		adri.setAsignatura(tic);
		
		
		CreateAlumno create = new CreateAlumno();
		create.create(cris);
		create.create(adri);
		
		
	}

}

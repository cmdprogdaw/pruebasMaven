package pruebasMaven.negocio;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.List;


@Entity
@Table(name="asignatura")
public class AsignaturaBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column
	private long idAsignatura;

	
	@Column(name="Nombre")
	private String nombre;

	
	@ManyToMany(mappedBy = "asignaturas") //se llama igual que el campo del AlumnoBean pq es un objeto
	private List<AlumnoBean> alumnos = new ArrayList<AlumnoBean>();
	//importar List con java.util
	
	
//	//una asignatura esta impartida por un profesor
//	@ManyToOne 
//	@JoinColumn(name="FK_profesor")
//	private ProfesorBean profesor;
	
	
	
	//hay que obligar a java a que meta los alumnos porque hiberate no lo hace
	public void addAlumno(AlumnoBean alumno) {
		
		//si no esta dentro de la lista, mete al alumno y dile al alumno que su asignatura es esta
		if(!alumnos.contains(alumno)) {
			
			alumnos.add(alumno);
			
			//decirle al alumno que añada esta asignatura
			List<AsignaturaBean> asignaturas = alumno.getAsignaturas();
			if(!asignaturas.contains(this)) {
				
				asignaturas.add(this);
			}
			
			//alumno.setAsignatura(this);
		}
		
		
	}
	
	
	
	public long getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(long id) {
		this.idAsignatura = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAlumnos(List<AlumnoBean> alumnos) {
		this.alumnos = alumnos;
	}

//	public ProfesorBean getProfesor() {
//		return profesor;
//	}
//
//
//
//	public void setProfesor(ProfesorBean profesor) {
//		this.profesor = profesor;
//	}



	@Override
	public String toString() {
		return "AsignaturaBean [idAsignatura=" + idAsignatura + ", nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}
	
}

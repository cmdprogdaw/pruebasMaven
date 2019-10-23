package pruebasMaven.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="profesor")
public class ProfesorBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column
	private long idProfesor;
	
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="DNI")
	private String dni;

	
	//un profesor puede dar muchas asignaturas
	@OneToMany(mappedBy = "profesor")
	private List<AsignaturaBean> asignaturas = new ArrayList<AsignaturaBean>();
	
	
	public void addAsignatura(AsignaturaBean asignatura) {
		
		//si no esta dentro de la lista, mete a la asignatura y dile a la asignatura que su profesor es esta
		if(!asignaturas.contains(asignatura)) {
			
			asignaturas.add(asignatura);
			asignatura.setProfesor(this);
		}
			
	}
	
	
	public long getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(long idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "ProfesorBean [idProfesor=" + idProfesor + ", nombre=" + nombre + ", dni=" + dni + ", asignaturas="
				+ asignaturas + "]";
	}
	
	
	
	
}

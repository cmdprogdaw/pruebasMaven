package pruebasMaven.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="alumno")
public class AlumnoBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column
	private long idAlumno;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Telefono")
	private String telefono;
	
	@Column
	private String ciudad;
	
	
	/*es una clase, xq no pretendo que sea una columna, sino que se transforme en ella, 
	 * y hay q darle info al jpa orm hibernate que me referencie de que eso es un enlace 
	 * con otra asignatura
	 */
	@ManyToOne //muchos alumnos para una asignatura
	@JoinColumn(name="FK_asignatura") //eso que te encuentras aqui va a estar en otra tabla
	private AsignaturaBean asignatura;
	
	
	
	
	
	
	public AsignaturaBean getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(AsignaturaBean asignatura) {
		this.asignatura = asignatura;
	}
	public long getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(long idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}

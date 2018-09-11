package org.aplicacionAndroid.Alumnos;
import org.aplicacionAndroid.Edfisica.Edfisica;
import org.aplicacionAndroid.Bibloteca.Bibloteca;
import org.aplicacionAndroid.Taller.Taller;
import org.aplicacionAndroid.Teoria.Teoria;
import org.aplicacionAndroid.Escuela.Escuelafactory;




public class Alumnos
{
	@Column(length=20) @Requiered 
	private String nombre_alumno;

	@Column(length=20) @Requiered
	private String apellido_alumno;

	@Id @Column(length=20) @Requiered
	private int documento_alumno;
	
	@Column(length=20) @Requiered
	private int fecha_nacimiento_alumno;

	@Column(length=20) @Requiered
	private String nacionalidad_alumno;
	
	@Column(length=20) @Requiered
	private String provincia_alumno;

	public Taller taller;

	public Edfisica edfisica;

	public Teoria teoria;

	public Bibloteca bibloteca;
	
	public Escuelafactory escuelafactory;

	public Alumnos(){
		super();
	}
	public String getNombre_alumno() {
		return nombre_alumno;
	}

	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}

	public String getApellido_alumno() {
		return apellido_alumno;
	}

	public void setApellido_alumno(String apellido_alumno) {
		this.apellido_alumno = apellido_alumno;
	}

	public int getDocumento_alumno() {
		return documento_alumno;
	}

	public void setDocumento_alumno(int documento_alumno) {
		this.documento_alumno = documento_alumno;
	}

	public int getFecha_nacimiento_alumno() {
		return fecha_nacimiento_alumno;
	}

	public void setFecha_nacimiento_alumno(int fecha_nacimiento_alumno) {
		this.fecha_nacimiento_alumno = fecha_nacimiento_alumno;
	}

	public String getProvincia_alumno() {
		return provincia_alumno;
	}

	public void setProvincia_alumno(String provincia_alumno) {
		this.provincia_alumno = provincia_alumno;
	}
	public String getNacionalidad_alumno() {
		return nacionalidad_alumno;
	}
	public void setNacionalidad_alumno(String nacionalidad_alumno) {
		this.nacionalidad_alumno = nacionalidad_alumno;
	}
	

}


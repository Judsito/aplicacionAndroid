package org.aplicacionAndroid.Profesores;
import org.aplicacionAndroid.Bibloteca.Bibloteca;
import org.aplicacionAndroid.Edfisica.Edfisica;
import org.aplicacionAndroid.Taller.Taller;
import org.aplicacionAndroid.Teoria.Teoria;
import org.aplicacionAndroid.Escuela.Escuelafactory;



public class Profesores
{

	public String nombre_profesor;


	public String apellido_profesor;


	public int documento_profesor;


	public String domicilio_profesor;


	public String composicion_familia_profesor;

	public Taller taller;

	public Edfisica edfisica;

	public Teoria teoria;

	public Bibloteca bibloteca;

	public Escuelafactory escuelafactory;

	public Profesores(){
		super();
	}

	public String getNombre_profesor() {
		return nombre_profesor;
	}

	public void setNombre_profesor(String nombre_profesor) {
		this.nombre_profesor = nombre_profesor;
	}

	public String getApellido_profesor() {
		return apellido_profesor;
	}

	public void setApellido_profesor(String apellido_profesor) {
		this.apellido_profesor = apellido_profesor;
	}

	public int getDocumento_profesor() {
		return documento_profesor;
	}

	public void setDocumento_profesor(int documento_profesor) {
		this.documento_profesor = documento_profesor;
	}

	public String getDomicilio_profesor() {
		return domicilio_profesor;
	}

	public void setDomicilio_profesor(String domicilio_profesor) {
		this.domicilio_profesor = domicilio_profesor;
	}

	public String getComposicion_familia_profesor() {
		return composicion_familia_profesor;
	}

	public void setComposicion_familia_profesor(String composicion_familia_profesor) {
		this.composicion_familia_profesor = composicion_familia_profesor;
	}

}


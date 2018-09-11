package org.aplicacionAndroid.Bibloteca;
import org.aplicacionAndroid.Alumnos.Alumnos;
import org.aplicacionAndroid.Profesores.Profesores;




public class Bibloteca
{
	

	public String horario_bibloteca;

	public Alumnos alumnos;

	public Profesores profesores;

	public Bibloteca(){
		super();
	}

	public String getHorario_bibloteca() {
		return horario_bibloteca;
	}

	public void setHorario_bibloteca(String horario_bibloteca) {
		this.horario_bibloteca = horario_bibloteca;
	}

}


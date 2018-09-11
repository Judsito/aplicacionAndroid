package org.aplicacionAndroid.Taller;
import org.aplicacionAndroid.Alumnos.Alumnos;
import org.aplicacionAndroid.Profesores.Profesores;



public class Taller
{
	
	public String horario_taller;

	public Alumnos alumnos;

	public Profesores profesores;

	public Taller(){
		super();
	}

	public String getHorario_taller() {
		return horario_taller;
	}

	public void setHorario_taller(String horario_taller) {
		this.horario_taller = horario_taller;
	}

}


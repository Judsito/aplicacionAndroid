package org.aplicacionAndroid.Teoria;
import org.aplicacionAndroid.Alumnos.Alumnos;
import org.aplicacionAndroid.Profesores.Profesores;



public class Teoria
{
	@Id @Column(length=20) @Requiered
	public String horario_teoria;

	public Alumnos alumnos;

	public Profesores profesores;

	public Teoria(){
		super();
	}

	public String getHorario_teoria() {
		return horario_teoria;
	}

	public void setHorario_teoria(String horario_teoria) {
		this.horario_teoria = horario_teoria;
	}

}


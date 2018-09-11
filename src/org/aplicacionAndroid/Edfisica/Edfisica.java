package org.aplicacionAndroid.Edfisica;
import org.aplicacionAndroid.Alumnos.Alumnos;
import org.aplicacionAndroid.Profesores.Profesores;



public class Edfisica
{

	@Id @Column(length=20) @Requiered
	private int horario_edfisica;

	public Alumnos alumnos;

	public Profesores profesores;

	public Edfisica(){
		super();
	}

	public int getHorario_edfisica() {
		return horario_edfisica;
	}

	public void setHorario_edfisica(int horario_edfisica) {
		this.horario_edfisica = horario_edfisica;
	}

}


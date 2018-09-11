package org.aplicacionAndroid.Escuela;
import org.aplicacionAndroid.Alumnos.Alumnos;
import org.aplicacionAndroid.Profesores.Profesores;



public class Escuelafactory
{
	
	@Id @Column(length=20) @Requiered
	puclic String escuela;

	public Profesores profesores;

	public Alumnos alumnos;

	public Escuelafactory(){
		super();
	}

}


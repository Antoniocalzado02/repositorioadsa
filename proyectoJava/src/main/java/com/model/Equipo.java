package main.java.com.model;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private String nombre;
	private List<Alumno> listaAlumno= new ArrayList<Alumno>();
	
	
	public Equipo() {}


	public Equipo(String nombre, List<Alumno> listaAlumno) {
		this.nombre = nombre;
		this.listaAlumno = listaAlumno;
	}
	
	public boolean borrarAlumno(Alumno alumnoNuevo) {
		boolean existeAlumno=false;
		if(listaAlumno.contains(alumnoNuevo)) {
			listaAlumno.remove(alumnoNuevo);
			existeAlumno=true;
		}else {
			throw new EquipoExcepciones("El alumno no existe");
		}
		
		return existeAlumno;
	}
	
	public boolean borrarAlumnoConDniyNombre(String nombre, String dni) {
		boolean existeAlumno=false;
		Alumno al1=new Alumno(nombre,dni);
		if(listaAlumno.contains(al1)) {
			listaAlumno.remove(al1);
			existeAlumno=true;
		}else {
			throw new EquipoExcepciones("El alumno no existe");
		}
		
		return existeAlumno;
	}
	
	


	@Override
	public String toString() {
		return "Equipo con nombre : " + nombre + ", con alumnos : " + listaAlumno.toString() ;
	}


	public String getNombre() {
		return nombre;
	}

	
}

package Desafio2;

import java.util.ArrayList;

public class ClsAlumnos {

	private String nombre;
	private String apellido;
	private int nExamenes;
	private ArrayList<Integer> notasAlumnos;
	
	public ClsAlumnos(String nombre, String apellido, int nExamenes) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nExamenes = nExamenes;
		this.notasAlumnos = new ArrayList<>();
	}
	
	public String getApellidoAlumnos() {
		return apellido;
	}

	public void setApellidoAlumnos(String apellido) {
		this.apellido = apellido;
	}
	public void setNombreAlumno(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreAlumnos() {
		return nombre;
	}

	public int getnExamenesAlumnos() {
		return nExamenes;
	}

	public void setnExamenesAlumnos(int nExamenes) {
		this.nExamenes = nExamenes;
	}

	public ArrayList<Integer> getNotasAlumnos() {
		return notasAlumnos;
	}

	public void setNotasAlumnos(int nota) {
		notasAlumnos.add(nota);
	}

	@Override
	public String toString() {
		return " "+nombre+" "+apellido;
	}
	

	public int getMayorNotasAlumnos() {
		int mayor = this.getNotasAlumnos().get(0);
		for(int nota : this.getNotasAlumnos()) {
			if(nota > mayor) {
				mayor = nota;
			}
		}
		return mayor;
	}
	public int getMenorNotasAlumnos() {
		int menor = this.notasAlumnos.get(0);
		for(int nota : this.getNotasAlumnos()) {
			if(nota < menor) {
				menor = nota;
			}
		}
		return menor;
	}
	public int getPromediosAlumnos() {
		int suma = 0;
		for(int nota : notasAlumnos) {
			suma += nota;
		}
		return suma / this.nExamenes;
	}
}

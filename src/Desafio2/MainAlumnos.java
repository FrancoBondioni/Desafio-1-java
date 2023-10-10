package Desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAlumnos {
	public static void main(String[] args) {
		
		System.out.println("°°°°°°°°°°°°°°°°°°CARGA DE ALUMNOS°°°°°°°°°°°°°°°°°°");
		Scanner teclado = new Scanner(System.in);
		System.out.print("CUANTOS ALUMNOS DESEA INGRESAR: ");
		int cantidadAlumnos = teclado.nextInt();
		List<ClsAlumnos> alumnos = cargadoAlumnos(teclado, cantidadAlumnos);

		ClsAlumnos alumnoMayorCalificacion = obtenerAlumnoMayorCalificacion(alumnos); 
		System.out.println("LA CALIFICACIONES MAS BAJAS SON LAS DE EL/LOS ALUMNO/S" + "°" +alumnoMayorCalificacion.toString());
		
		ClsAlumnos alumnoMenorCalificacion = obtenerAlumnoMenorCalificacion(alumnos); 
		System.out.println("LA CALIFICACIONES MAS BAJAS SON LAS DE EL/LOS ALUMNO/S: " + "°" + alumnoMenorCalificacion.toString());
		
		List<ClsAlumnos> promocionados = obtenerAlumnosPromocionados(alumnos);
		System.out.print("lOS ALUMNOS QUE PROMOCIONAN SON: ");
		if(!promocionados.isEmpty()) {
			for(ClsAlumnos p : promocionados) {
				System.out.println("°" + p.toString());
			}
		}else {
			System.out.println("NINGUNO LO LOGRO");	
		}
		List<ClsAlumnos> recursan = obtenerAlumnosQueRecursaran(alumnos);
		System.out.print("RECURSAN LA MATERIA: ");
		if(!recursan.isEmpty()) {	
			for(ClsAlumnos r : recursan) {
				System.out.println("°" + r.toString());
			}
		}else {
			System.out.println("Ninguno recursa");
		}
		
		teclado.close();
	}
	public static ClsAlumnos Cargar(Scanner teclado, int i) {
		ClsAlumnos alumno;
		System.out.println("°°°°°°°°°ALUMNO " + i +" °°°°°°°°°" );
		System.out.print("NOMBRE: ");
		String nombre = teclado.next();
		System.out.print("APELLIDO: ");
		String apellido = teclado.next();
		System.out.print("EXAMENES: ");
		int examenes = teclado.nextInt();
		alumno = new ClsAlumnos(nombre, apellido, examenes);
		for(int C = 1; C <= examenes; C++) {
			int nota;
			do {
				System.out.print("°NOTA " + C + ": ");
				nota = teclado.nextInt();
			}while(nota<1 || nota>10);
			alumno.setNotasAlumnos(nota);
		}
		return alumno;
	}
	public static ClsAlumnos obtenerAlumnoMenorCalificacion(List<ClsAlumnos> alumnos) {
		ClsAlumnos alumnoMenorNota = alumnos.get(0);
		int menorNota = alumnoMenorNota.getMenorNotasAlumnos();
		
		for(ClsAlumnos alumno : alumnos) {
			int nota = alumno.getMenorNotasAlumnos();
			if(nota < menorNota) {
				menorNota = nota;
				alumnoMenorNota = alumno;
			}
		}
		return alumnoMenorNota;
	}
	public static ClsAlumnos obtenerAlumnoMayorCalificacion(List<ClsAlumnos> alumnos) {
		ClsAlumnos alumnoMayorNota = alumnos.get(0);
		int mayorNota = alumnoMayorNota.getMayorNotasAlumnos();
		
		for(ClsAlumnos alumno : alumnos) {
			int nota = alumno.getMayorNotasAlumnos();
			if(nota > mayorNota) {
				mayorNota = nota;
				alumnoMayorNota = alumno;
			}
		}
		return alumnoMayorNota;
	}
	public static List<ClsAlumnos> obtenerAlumnosQueRecursaran(List<ClsAlumnos> alumnos){
		List<ClsAlumnos> recursan = new ArrayList<>();
		for(ClsAlumnos R : alumnos) {
			if(R.getPromediosAlumnos() < 7) {
				recursan.add(R);
			}
		}
		return recursan;
	}
	public static List<ClsAlumnos> obtenerAlumnosPromocionados(List<ClsAlumnos> alumnos){
		List<ClsAlumnos> promocionan = new ArrayList<>();
		for(ClsAlumnos P : alumnos) {
			if(P.getPromediosAlumnos() >= 7) {
				promocionan.add(P);
			}
		}
		return promocionan;
	}
	public static List<ClsAlumnos> cargadoAlumnos(Scanner teclado, int cantidadAlumnos){
		List<ClsAlumnos> alumnos = new ArrayList<>();
		for(int l = 1; l <= cantidadAlumnos; l++) {
			alumnos.add(Cargar(teclado,l));
		}
		return alumnos;
	}
}

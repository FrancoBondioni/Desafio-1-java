package Desafio3;

import java.util.ArrayList;
import java.util.List;
public class MainTorreDeControl {
	String textoEnNegrita = "Java_Prof_Level";
	public static void main(String[] args) {
		List<iVoladores> voladores = new ArrayList<>();
		voladores.add(new AvionComercial(201));
		voladores.add(new GloboAerostatico(80));
		voladores.add(new Drone(25));
		voladores.add(new AvionMilitar(300));
		voladores.add(new Helicoptero(180));
		voladores.add(new Paramotor(100));
		voladores.add(new Zeppelin(90));
		voladores.add(new Planeador(100));
		
		TorreDeControl Control = new TorreDeControl() {
			@Override
			public void AutorizacionDeAterrizaje(iVoladores volador) {
				super.AutorizacionDeAterrizaje(volador);
			}
		};
		for(iVoladores vuelos : voladores) {
			System.out.println("\033[0;1m"+"°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
			vuelos.volador();
			Control.AutorizacionDeAterrizaje(vuelos);
			System.out.println("\n");
		}
	}
}

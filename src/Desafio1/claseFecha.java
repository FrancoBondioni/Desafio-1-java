package Desafio1;

import java.util.Scanner;

public class claseFecha {
	public static boolean es_bisiesto(int anio) {
	    return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia;
		int mes;
		int anio;
		
		do {
			Scanner leer=new Scanner(System.in);
			System.out.print("Introduzca un dia: ");
			dia=leer.nextInt();
			System.out.print("Introduzca un mes: ");
			mes=leer.nextInt();
			System.out.print("Introduzca un año: ");
			anio=leer.nextInt();
			 leer.close();
		}while((dia ==0) && (mes ==0) && (anio==0));
		
		boolean aniobisiesto = es_bisiesto(anio);
		
		System.out.println("La fecha ingresada es "+dia+"/"+mes+"/"+anio);
		
		if(anio>=1900 && anio<=2099) {
					if(mes==2) {
						if(aniobisiesto==true){
							if(dia>=1 && dia <=29 ){
								System.out.println("Es una fecha valida");
							}
							else {
								System.out.println("NO es una fecha valida");
							}
						}
						else if(dia>=1 && dia <=28 ) {
							System.out.println("Es una fecha valida");
						}

						else {
							System.out.println("NO es una fecha valida");
						}
					}
					if (mes==1 || mes==3 ||mes==5||mes==7||mes==8||mes==10||mes==12) {
						if(dia>=1 && dia<=31) {
								System.out.println("Es una fecha valida");
						}
						else {
							System.out.println("NO es una fecha valida");
						}
					}
					
					if (mes==4 || mes==6 ||mes==9||mes==11) {
						if(dia>=1 && dia<=30) {		
								System.out.println("Es una fecha valida");
						}
						else {
							System.out.println("NO es una fecha valida");
						}
					}
			
				}
				else {
					System.out.println("NO es una fecha valida");
				}
		}
	}

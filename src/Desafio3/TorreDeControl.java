package Desafio3;

import java.util.Random;

public abstract class TorreDeControl {
    public void AutorizacionDeAterrizaje(iVoladores volador) {
    	///SI DESARROLLA UNA VELOCIDAD MAYOR A 200km/h ATERRIZA EN PISTA 1
    	if(volador instanceof IPermitirAterrizaje && volador.getVelocidad() >= 200) {
			((IPermitirAterrizaje) volador).aterrizajePista1();
		}
    	else{
			System.out.println("NO TIENE AUTORIZACIÓN. DEBE SOLICITAR UNA AUTORIZACIÓN EXTRAORDINARIA");
			System.out.println(". . . _ _ _ . . .  S.O.S \n");
			System.out.println("SOLICITANDO LA APROBACIÓN..." );
			 Random rd = new Random();
			 ///EN CASO DE QUE SEA TRUE SE LE OTORGA LA AUTORIZACION PARA EL ATERRIZAJE EN PISTA 2
			if((rd.nextBoolean())==true) {
				System.out.println("AUTORIZADO PARA ATERRIZAJE EN LA PISTA 2");
			}
				else{
					System.out.println("AUTORIZACIÓN DENEGADA, SIGA EN EL AIRE");
				}
		}
    }
};

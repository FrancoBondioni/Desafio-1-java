package Desafio3;

public class AvionComercial implements  IPermitirAterrizaje {
    private int velocidad;
    public AvionComercial(int velocidad) {
        this.velocidad = velocidad;
    }


	@Override
	public void aterrizajePista1() {
		System.out.println("AVION COMERCIAL ATERRIZANDO EN LA PISTA 1...");
	}

	@Override
	public void volador() {
		System.out.println("AVION COMERCIAL COMUNICANDOSE CON TORRE DE CONTROL PARA ATERRIZAJE...");
	}
    @Override
    public int getVelocidad() {
        return velocidad;
    }


}

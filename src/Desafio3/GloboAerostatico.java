package Desafio3;

public class GloboAerostatico implements  IPermitirAterrizaje {
    private int velocidad;
    public GloboAerostatico(int velocidad) {
        this.velocidad = velocidad;
    }


	@Override
	public void aterrizajePista1() {
		System.out.println("GLOBO AEROESTATICO ATERRIZANDO EN LA PISTA 1...");
	}

	@Override
	public void volador() {
		System.out.println("GLOBO AEROESTATICO COMUNICANDOSE CON TORRE DE CONTROL PARA ATERRIZAJE...");
	}
    @Override
    public int getVelocidad() {
        return velocidad;
    }
}
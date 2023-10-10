package Desafio3;

public class Paloma implements  IPermitirAterrizaje {
    private int velocidad;
    public Paloma(int velocidad) {
        this.velocidad = velocidad;
    }


	@Override
	public void aterrizajePista1() {
		System.out.println("PALOMA ATERRIZANDO EN LA PISTA 1...");
	}

	@Override
	public void volador() {
		System.out.println("PALOMA COMUNICANDOSE CON TORRE DE CONTROL PARA ATERRIZAJE...");
	}
    @Override
    public int getVelocidad() {
        return velocidad;
    }
}
package Desafio3;

public class Drone implements  IPermitirAterrizaje {
    private int velocidad;
    public Drone(int velocidad) {
        this.velocidad = velocidad;
    }


	@Override
	public void aterrizajePista1() {
		System.out.println("DRONE ATERRIZANDO EN LA PISTA 1...");
	}

	@Override
	public void volador() {
		System.out.println("EL DRONE COMUNICANDOSE CON TORRE DE CONTROL PARA ATERRIZAJE...");
	}
    @Override
    public int getVelocidad() {
        return velocidad;
    }
}
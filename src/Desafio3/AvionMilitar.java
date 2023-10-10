package Desafio3;
public class AvionMilitar implements  IPermitirAterrizaje {
    private int velocidad;
    public AvionMilitar(int velocidad) {
        this.velocidad = velocidad;
    }


	@Override
	public void aterrizajePista1() {
		System.out.println("AVION DE MILITARES ATERRIZANDO EN LA PISTA 1...");
	}

	@Override
	public void volador() {
		System.out.println("EL AVION MILITAR COMUNICANDOSE CON TORRE DE CONTROL PARA ATERRIZAJE...");
	}
    @Override
    public int getVelocidad() {
        return velocidad;
    }
}
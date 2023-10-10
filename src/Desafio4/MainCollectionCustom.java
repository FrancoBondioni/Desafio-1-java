package Desafio4;

public class MainCollectionCustom {
	String textoEnNegrita = "Java_Prof_Level";
	public static void main(String[] args) {
	       CollectionCustom<String> Muestra = new CollectionCustom<String>();
	       System.out.println("\033[0;1m" + "INICIO");
	       System.out.println("SIZE: " + Muestra.size());
	       System.out.println("Empty: " + Muestra.empty());
	       System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°");
	       Muestra.add("DEF");
	       Muestra.add("GHI");
	       Muestra.add("JKL");
			System.out.println("MUESTRA ADD => " + Muestra);
	       System.out.println("SIZE: " + Muestra.size());
	       System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°");
	       Muestra.addFirst("ABC");
	       Muestra.addLast("XYZ");
			System.out.println("MUESTRA FIRST ADD Y END ADD=> " + Muestra);
	       System.out.println("SIZE: " + Muestra.size());
	       System.out.println("Empty: " + Muestra.empty());
	       System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°");
	       Muestra.remove("GHI");
	       System.out.println("\nSE REMOVIO EL GHI. => " + Muestra);
	       System.out.println("SIZE: " + Muestra.size());
	       System.out.println("ESTA VACIO?: " + Muestra.empty());
	       System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°");
	       Muestra.removeAll();
	       System.out.println("SE REMOVIO TODO: "+ Muestra);
	       System.out.println("SIZE: " + Muestra.size());
	       System.out.println("¿ESTA VACIO?: " + Muestra.empty());
	   }

}

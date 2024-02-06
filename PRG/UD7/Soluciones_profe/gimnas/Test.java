package gimnas;

public class Test {

	public static void main(String[] args) {

		MembreGimnas entrenador1 = new MembreGimnas("Bob", TipusMembreGimnas.ENTRENADOR);
		MembreGimnas soci1 = new MembreGimnas("Patricio", TipusMembreGimnas.SOCI);
		MembreGimnas soci2 = new MembreGimnas("Sr. Cangrejo", TipusMembreGimnas.SOCI);
		
		// Cridem el mètode anunciarNouEntrenador() des de l'interficie heredada.
		Entrenador.anunciarNouEntrenador();
		System.out.println("El nou entrenador és: " + entrenador1.obtenirNom());
		
		// Registrem l'assistència de l'entrenador al gimnàs.
		entrenador1.registrarAssistència();
		
		// Registrem l'assistència del soci al gimnàs.
		soci1.registrarAssistència();
		
		// L'entrenador dona instruccions.
		soci1.donarInstruccions("fer abdominals");
		entrenador1.donarInstruccions("fer abdominals");
		
		// Els socis faran exercici
		soci1.realitzarExercici("escalfament");
		soci2.realitzarExercici("bicicleta");
		
		// Entrenament personalitzat
		soci1.realitzarEntrenamentPersonalitzat();

		// Avaluació del rendiment.
		entrenador1.avaluarRendiment();
		soci1.avaluarRendiment();
		soci2.avaluarRendiment();
	}

}

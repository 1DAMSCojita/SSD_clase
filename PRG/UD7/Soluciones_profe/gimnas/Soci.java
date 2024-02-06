package gimnas;

public interface Soci {

	// Registra l'assistència del soci.
	void registrarAssistència();
	// Indica que el soci està realitzant un exercici específic.
	void realitzarExercici(String exercici);
	// Retorna el nom del soci.
	String obtenirNom();
}

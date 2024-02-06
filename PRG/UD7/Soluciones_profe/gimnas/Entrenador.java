package gimnas;

public interface Entrenador extends Soci {
	
	// Permet a l'entrenador	donar instruccions als socis.
	void donarInstruccions(String instruccio);
	// Realitza una avaluació del rendiment del soci.
	void avaluarRendiment();
	// Proporciona una implementació per defecte per realitzar entrenaments personalitzats.
	default void realitzarEntrenamentPersonalitzat() {
		System.out.println("Entrenament personalitzat per defecte per " + obtenirNom());
		realitzarSeguiment();
	}
	// Anuncia l'arribada d'un nou entrenador (mètode estàtic).
	static void anunciarNouEntrenador() {
		System.out.println("Volem anunciar-vos l'arribada d'un nou entrenador!");
	}
	// Mètode privat que s'utilitza per realitzar un seguiment intern (utilitzat a través d'un mètode default).
	private void realitzarSeguiment() {
		System.out.println("Seguiment intern.");
	}
}

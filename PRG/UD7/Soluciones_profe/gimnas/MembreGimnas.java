package gimnas;

public class MembreGimnas implements Entrenador {

	private String nom; // nom del membre del gimnas.
	TipusMembreGimnas tipusMembreGimnas;
	private boolean alGimnas; // indica si el membre és al gimnas.
	
	public MembreGimnas(String nom, TipusMembreGimnas tipusMembreGimnas) {
		this.nom = nom;
		this.tipusMembreGimnas = tipusMembreGimnas;
		this.alGimnas = false;
	}
	
	@Override
	public void registrarAssistència() {
		this.alGimnas = true;		
		System.out.println(this.obtenirNom() + " s'ha registrat al gimnàs.");
	}

	@Override
	public void realitzarExercici(String exercici) {
		// Comprovem si el membre és al gimnàs per saber si pot realitzar cap exercici.
		if(this.alGimnas) {
			System.out.println(this.obtenirNom() + " ha de realitzar l'exercici: " + exercici);
		} else {
			System.out.println(this.obtenirNom() + " no pot realitzar l'exercici " + exercici + " perque no és al gimnàs.");
		}		
	}

	@Override
	public String obtenirNom() {
		// Comprovem que nom té algún valor.
		if(this.nom.length() > 0 && this.nom != null) {
			// Retornem el nom capitalitzat.
			return this.nom.toUpperCase().charAt(0) + this.nom.substring(1, this.nom.length()).toLowerCase();
		}
		
		// No tenim nom, posem un per defecte.
		return "John Doe";
	}

	@Override
	public void donarInstruccions(String instruccio) {
		// Considerarem que només un entrenador pot donar instruccions.
		if(this.tipusMembreGimnas == tipusMembreGimnas.ENTRENADOR) {
			System.out.println("L'entrenador " + this.nom + " dona la següent instrucció: " + instruccio);
		} else {
			System.out.println(this.nom + " no és entrenador i no pot donar instruccions!");
		}
	}

	@Override
	public void avaluarRendiment() {
		// Considerarem que només a un soci se li avaluarà el rendiment.
		if((this.tipusMembreGimnas == tipusMembreGimnas.SOCI)) {
			// i només si és al gimnàs
			if(this.alGimnas) {
				System.out.println("El soci " + this.nom + " té un rendiment adequat.");
			} else {
				System.out.println("El soci " + this.nom + " té un rendiment lamentable perque no va al gimnàs.");
			}
		} else {
			System.out.println("Només se li avaluarà el rendiment als socis que no siguin entrenadors.");
		}
	}
}

enum TipusMembreGimnas {
	SOCI, ENTRENADOR
	// Un entrenador serà soci també.
}

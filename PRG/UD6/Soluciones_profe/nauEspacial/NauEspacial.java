package nauEspacial;

public abstract class NauEspacial {

	String nom;
	int capacitatTripulants;
	
	// ***	Constructors	***
	
	// Constructor (complet).
	public NauEspacial(String nom, int capacitatTripulants) {
		this.nom = nom;
		this.capacitatTripulants = capacitatTripulants;
	}
	
	// ***	Mètodes abstractes	***
	
	abstract void enlairar();
	
	// ***	Mètodes no abstractes	***
	
	void aterrar() {
		System.out.println("La nau " + this.nom + " ha aterrat.");
	}
	
	// ***	Mètodes sobreescrits d'Object	***
	
	@Override
	// Sobreescrivim aquest mètode per a proporcionar
	// una representació més específica de la nau espacial.
	public String toString() {
		return "Nom de la nau: " + this.nom + " || Capacitat de Tripulants: " + this.capacitatTripulants;
	}
	
	@Override
	// Sobreescrivim aquest mètode per a poder comparar
	// la igualtat entre naus espacials.
	public boolean equals(Object o) {
		// Necessitem convertir l'objecte "o" de tipus Object
		// a un objecte de tipus NauEspacial per a poder fer la comparació.
		NauEspacial ne = (NauEspacial)o;
		
		// Perquè siguin iguals ho hauran de ser a la vegada
		// el seu nom i la seva capacitat de tripulants.
		return this.nom.equals(ne.nom) && this.capacitatTripulants == ne.capacitatTripulants;		
	}
}
	

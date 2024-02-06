package nauEspacial;

public class NauGuerra extends NauEspacial {

	int numArmes;
	
	// ***	Constructors	***
	
	// Constructor (complet).
	public NauGuerra(String nom, int capacitatTripulants, int numArmes) {
		// Utilitzem el constructor adequat de la classe pare.
		super(nom, capacitatTripulants);
		this.numArmes = numArmes;
	}

	// ***	Mètodes sobreescrits de NauEspacial	***
	
	@Override
	// Sobreescrivem el mètode enlairar per indicar
	// l'enlairament amb el número d'armes.
	void enlairar() {
		System.out.println("La nau " + this.nom + " s'ha enlairat portant " + this.numArmes + " armes.");
	}
	
	// ***	Mètodes sobreescrits d'Object	***
	
	@Override
	// Sobreescrivim aquest mètode per a proporcionar
	// una representació més específica de la nau de guerra.
	public String toString() {
		// Podem fer:
		// return "Nom de la nau de guerra: " + this.nom + " || Capacitat de Tripulants: " + this.capacitatTripulants + " || Número d'armes: " + this.numArmes;
		// o millor:
		return super.toString() + " || Número d'armes: " + this.numArmes; 
	}
	
	@Override
	// Sobreescrivim aquest mètode per a poder comparar
	// la igualtat entre naus de guerra.
	public boolean equals(Object o) {
		// Necessitem convertir l'objecte "o" de tipus Object
		// a un objecte de tipus NauGuerra per a poder fer la comparació.
		NauGuerra ng = (NauGuerra)o;
		
		// Perquè siguin iguals ho hauran de ser a la vegada
		// el seu nom, la seva capacitat de tripulants i el
		// número d'armes.
		// Podem fer:
		// return this.nom.equals(ng.nom) && this.capacitatTripulants == ng.capacitatTripulants && this.numArmes == ng.numArmes;
		// o millor:
		return super.equals(o) && this.numArmes == ng.numArmes;
	}

}

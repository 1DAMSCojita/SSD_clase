package nauEspacial;

public class NauExploradora extends NauEspacial {

	TipusPlaneta tipusPlaneta;
	
	// ***	Constructors	***
	
	// Constructor (complet).
	public NauExploradora(String nom, int capacitatTripulants, TipusPlaneta tipusPlaneta) {
		super(nom, capacitatTripulants);
		this.tipusPlaneta = tipusPlaneta;
	}

	// ***	Mètodes sobreescrits de NauEspacial	***
	
	@Override
	// Sobreescrivem el mètode enlairar per indicar
	// l'enlairament amb el número d'armes.
	void enlairar() {
		System.out.println("La nau " + this.nom + " s'ha enlairat cap un planeta de tipus " + this.tipusPlaneta());
	}
	
	// Convertim l'enumerat TipusPlaneta a una cadena per
	// adaptarlo a un text.
	private String tipusPlaneta() {
		return switch (this.tipusPlaneta)
				{
				case ROCOS -> "rocós";
				case GASOS -> "gasós";
				case GELAT -> "gelat";
				default -> "desconegut";
				};
	}
	
	// ***	Mètodes sobreescrits d'Object	***
	
	@Override
	// Sobreescrivim aquest mètode per a proporcionar
	// una representació més específica de la nau exploradora.
	public String toString() {
		// Podem fer:
		// return "Nom de la nau exploradora: " + this.nom + " || Capacitat de Tripulants: " + this.capacitatTripulants + " || Tipus de Planeta de destí: " + this.tipusPlaneta;
		// o millor:
		return super.toString() + " || Tipus de Planeta de destí: " + this.tipusPlaneta; 
	}
	
	@Override
	// Sobreescrivim aquest mètode per a poder comparar
	// la igualtat entre naus exploradores.
	public boolean equals(Object o) {
		// Necessitem convertir l'objecte "o" de tipus Object
		// a un objecte de tipus NauExploradora per a poder fer la comparació.
		NauExploradora nex = (NauExploradora)o;
		
		// Perquè siguin iguals ho hauran de ser a la vegada
		// el seu nom, la seva capacitat de tripulants i el
		// tipus de planeta.
		// Podem fer:
		// return this.nom.equals(nex.nom) && this.capacitatTripulants == nex.capacitatTripulants && this.tipusPlaneta == nex.tipusPlaneta;
		// o millor:
		return super.equals(o) && this.tipusPlaneta == nex.tipusPlaneta;
	}

}

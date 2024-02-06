package atletisme;

public class Corredor extends Atleta {

	int velocitat;
	
	// ***	Constructors	***
	
	// Constructor complet.
	Corredor(String nom, int edat, int velocitat) {
		// Utilitzem el constructor adequat de la classe pare.
		super(nom, edat);
		this.velocitat =  velocitat;
	}
	
	// ***	Mètodes sobreescrits d'Object	***
	
	@Override
	// Sobreescrivim aquest mètode per a proporcionar
	// una representació més específica del corredor.
	public String toString() {
		return "Corredor: " + this.nom + " (" + this.edat + " anys) || Velocitat: " + this.velocitat + " (Km/h)"; 
	}
	
	@Override
	// Sobreescrivim aquest mètode per a poder comparar
	// la igualtat entre corredors.
	public boolean equals(Object o) {
		// Necessitem convertir l'objecte "o" de tipus Object
		// a un objecte de tipus Corredor per a poder fer la comparació.
		Corredor c = (Corredor)o;
		
		// Perquè siguin iguals ho hauran de ser a la vegada
		// el seu nom, la seva edat i la seva velocitat.
		if(this.nom.equals(c.nom) && this.edat == c.edat && this.velocitat == c.velocitat) {
			return true;
		}
		
		return false;
		
		// També podriem comentar les 4 últimes línies de codi i fer:		
		//return this.nom.equals(c.nom) && this.edat == c.edat && this.velocitat == c.velocitat;
	}
	
}

package atletisme;

public class Saltador extends Atleta {

	double alturaSalt;

	// ***	Constructors	***
	
	// Constructor complet.
	Saltador(String nom, int edat, double alturaSalt) {
		// Utilitzem el constructor adequat de la classe pare.
		super(nom, edat);
		this.alturaSalt = alturaSalt;
	}
	
	// ***	Mètodes sobreescrits d'Object	***
	
	@Override
	// Sobreescrivim aquest mètode per a proporcionar
	// una representació més específica del corredor.
	public String toString() {
		return "Corredor: " + this.nom + " (" + this.edat + " anys) || Altura de salt: " + this.alturaSalt + " (m)"; 
	}
	
	@Override
	// Sobreescrivim aquest mètode per a poder comparar
	// la igualtat entre saltadors.
	public boolean equals(Object o) {
		// Necessitem convertir l'objecte "o" de tipus Object
		// a un objecte de tipus Saltador per a poder fer la comparació.
		Saltador s = (Saltador)o;
		
		// Perquè siguin iguals ho hauran de ser a la vegada
		// el seu nom, la seva edat i la seva altura de salt.
		if(this.nom.equals(s.nom) && this.edat == s.edat && this.alturaSalt == s.alturaSalt) {
			return true;
		}
		
		return false;
		
		// També podriem comentar les 4 últimes línies de codi i fer:		
		//return this.nom.equals(s.nom) && this.edat == s.edat && this.alturaSalt == s.alturaSalt;
	}
}

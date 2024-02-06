package atletisme;

public class Atleta {

	String nom;
	int edat;
	
	// ***	Constructors	***
	
	// Constructor complet.
	Atleta(String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
	}
	
	// Constructor per si no es proporciona un nom.
	Atleta(int edat) {
		this("Cap nom facilitat", edat);
	}
	
	// Constructor per si no es proporciona una edat.
	Atleta(String nom) {
		// Com a criteri estàndard, indico -1 com a edat
		// per a detectar si no s'ha proporcionat cap.
		this(nom, -1);
	}
	
	// Constructor per defecte.
	Atleta() {
		// Com a criteri estàndard, indico -1 com a edat
		// per a detectar si no s'ha proporcionat cap.
		this("Cap nom facilitat", -1);
	}
	
	// ***	Mètodes sobreescrits d'Object	***
	
	@Override
	// Sobreescrivim aquest mètode per a proporcionar
	// una representació més específica de l'atleta.
	public String toString() {
		return "Atleta: " + this.nom + " (" + this.edat + " anys)"; 
	}
	
	@Override
	// Sobreescrivim aquest mètode per a poder comparar
	// la igualtat entre atletes.
	public boolean equals(Object o) {
		// Necessitem convertir l'objecte "o" de tipus Object
		// a un objecte de tipus Atleta per a poder fer la comparació.
		Atleta a = (Atleta)o;
		
		// Perquè siguin iguals ho hauran de ser a la vegada
		// el seu nom i la seva edat.
		if(this.nom.equals(a.nom) && this.edat == a.edat) {
			return true;
		}
		
		return false;
		
		// També podriem comentar les 4 últimes línies de codi i fer:		
		//return this.nom.equals(a.nom) && this.edat == a.edat;
	}
	
}

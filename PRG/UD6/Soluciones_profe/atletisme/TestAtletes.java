package atletisme;

public class TestAtletes {

	public static void main(String[] args) {

		// Creem atletes
		Atleta a1 = new Atleta("Joan", 55);
		Atleta a2 = new Atleta("Joan", 55);
		//Atleta a2 = new Atleta("Ana", 74);
		
		// Creem corredors
		Corredor c1 = new Corredor("Pere", 33, 7);
		//Corredor c2 = new Corredor("Adela", 22, 8);
		Corredor c2 = new Corredor("Pere", 33, 7);
		
		// Creem saltadors
		Saltador s1 = new Saltador("Carla", 30, 2.4);
		//Saltador s2 = new Saltador("Sofia", 20, 1.4);
		Saltador s2 = new Saltador("Carla", 30, 2.4);
		
		// Info Atletes
		System.out.println("Atletes");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a1.equals(a2) ? "Són el mateix atleta." : "Són atletes diferents.");
		System.out.println();
		
		// Info Corredors
		System.out.println("Corredors");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.equals(c2) ? "Són el mateix corredor." : "Són corredors diferents.");
		System.out.println();
		
		// Info Saltadors
		System.out.println("Saltadors");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.equals(s2) ? "Són el mateix saltador." : "Són saltadors diferents.");
		System.out.println();
	}

}

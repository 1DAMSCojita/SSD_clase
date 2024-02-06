package nauEspacial;

public class TestEspacial {

	public static void main(String[] args) {

		// Creem Naus de Guerra
		NauGuerra ng1 = new NauGuerra("Carretero", 10, 100);
		NauGuerra ng2 = new NauGuerra("Requete", 15, 65);
		NauGuerra ng3 = new NauGuerra("Carretero", 10, 100);
		
		//Creem Naus Exploradores
		NauExploradora nex1 = new NauExploradora("Magallanes", 50, TipusPlaneta.GELAT);
		NauExploradora nex2 = new NauExploradora("Dora", 120, TipusPlaneta.ROCOS);
		NauExploradora nex3 = new NauExploradora("Magallanes", 50, TipusPlaneta.GELAT);
		
		// Nau de Guerra en classe pare (NauEspacial)
		NauEspacial ne1 = ng1;
		// Nau Exploradora en classe pare (NauEspacial)
		NauEspacial ne2 = nex1;
		
		// Info Naus de Guerra
		System.out.println("Naus de Guerra");
		System.out.println();
		
		System.out.println(ng1.toString());
		ng1.enlairar();
		System.out.println(ng2.toString());
		ng2.enlairar();
		System.out.println(ng3.toString());
		ng3.enlairar();
		System.out.println();
		System.out.println("La nau de guerra " + ng1.nom + " i la nau de guerra " + ng2.nom + " " + (ng1.equals(ng2) ? "són la mateixa nau espacial." : "són naus espacials diferents."));
		System.out.println("La nau de guerra " + ng1.nom + " i la nau de guerra " + ng3.nom + " " + (ng1.equals(ng3) ? "són la mateixa nau espacial." : "són naus espacials diferents."));
		System.out.println("La nau de guerra " + ng2.nom + " i la nau de guerra " + ng3.nom + " " + (ng2.equals(ng3) ? "són la mateixa nau espacial." : "són naus espacials diferents."));
		System.out.println();
		
		// Info Naus Exploradores
		System.out.println("Naus Exploradores");
		System.out.println();
		
		System.out.println(nex1.toString());
		nex1.enlairar();
		System.out.println(nex2.toString());
		nex2.enlairar();
		System.out.println(nex3.toString());
		nex3.enlairar();
		System.out.println();
		System.out.println("La nau exploradora " + nex1.nom + " i la nau exploradora " + nex2.nom + " " + (nex1.equals(nex2) ? "són la mateixa nau espacial." : "són naus espacials diferents."));
		System.out.println("La nau exploradora " + nex1.nom + " i la nau exploradora " + nex3.nom + " " + (nex1.equals(nex3) ? "són la mateixa nau espacial." : "són naus espacials diferents."));
		System.out.println("La nau exploradora " + nex2.nom + " i la nau exploradora " + nex3.nom + " " + (nex2.equals(nex3) ? "són la mateixa nau espacial." : "són naus espacials diferents."));
		System.out.println();
		
		// Info Naus Espacial
		System.out.println("Naus Espacials");
		System.out.println();
		
		System.out.println(ne1.toString());
		ne1.enlairar();
		System.out.println();
		System.out.println("La nau espacial " + ne1.nom + " i la nau de guerra " + ng1.nom + " " + (ne1.equals(ng1) ? "són la mateixa nau espacial." : "són naus espacials diferents."));
		System.out.println("La nau espacial " + ne1.nom + " i la nau de guerra " + ng2.nom + " " + (ne1.equals(ng2) ? "són la mateixa nau espacial." : "són naus espacials diferents."));
		System.out.println("La nau espacial " + ne1.nom + " i la nau de guerra " + ng3.nom + " " + (ne1.equals(ng3) ? "són la mateixa nau espacial." : "són naus espacials diferents."));
		System.out.println();
		
		System.out.println(ne2.toString());
		ne2.enlairar();
		System.out.println();
		System.out.println("La nau espacial " + ne2.nom + " i la nau exploradora " + nex1.nom + " " + (ne2.equals(nex1) ? "són la mateixa nau espacial." : "són naus espacials diferents."));
		System.out.println("La nau espacial " + ne2.nom + " i la nau exploradora " + nex2.nom + " " + (ne2.equals(nex2) ? "són la mateixa nau espacial." : "són naus espacials diferents."));
		System.out.println("La nau espacial " + ne2.nom + " i la nau exploradora " + nex3.nom + " " + (ne2.equals(nex3) ? "són la mateixa nau espacial." : "són naus espacials diferents."));
		System.out.println();


	}

}

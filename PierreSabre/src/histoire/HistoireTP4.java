package histoire;

import personnages.*;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain humain = new Humain("Prof","kombucha",54);
		//humain.direBonjour();
		//humain.acheter("boisson", 12);
		//humain.boire();
		//humain.acheter("jeu", 2);
		//humain.acheter("kimono", 40);
		
		//test commercant
		Commercant commercant = new Commercant("Marco","thé",20);
		//commercant.direBonjour();
		//commercant.seFaireExtorquer();
		//commercant.recevoir(15);
		//commercant.boire();
		
		//test Yakuza
		  Yakuza yakuza = new Yakuza("Yaku le noir", "whisky", 45, " Warsong");
	     // yakuza.direBonjour();
	      //yakuza.extorquer(commercant);
	      
	    //test Ronin
	      Ronin ronin = new Ronin("Roro","shochu",54);
	     //ronin.direBonjour();
	    // ronin.donner(commercant);
	     ronin.provoquer(yakuza);
		
	}

	

}

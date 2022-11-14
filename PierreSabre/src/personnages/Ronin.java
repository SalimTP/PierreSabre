package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	
	
	public Ronin(String nom, String boissonFavori, int argent) {		
        super(nom, boissonFavori, argent);              
    }
	
	public void donner(Commercant beneficiaire) {
		if(super.getArgent()>0) {
			int don=(int)(super.getArgent()*0.1);
			if(super.getArgent()>don) {
				parler(beneficiaire.getNom()+" prend ces "+don+" sous.");
				super.perdreArgent(don);				
				beneficiaire.recevoir(don);
			}
				
			
		}
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;			
	
		if(force >= adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t'ai eu petit yakuza !");
			honneur++;		
			int argentTotal=adversaire.getArgent()+super.getArgent();
			super.setArgent(argentTotal);			
			adversaire.perdre();
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			parler("Ce ronin pensait vraiment battre " + adversaire.getNom() + " du clan de " + adversaire.getClan() + " ? \nJe l'ai dépouillé de ses " + super.getArgent() + " sous.");
			honneur--;
			super.setArgent(0);
		}
	}
}


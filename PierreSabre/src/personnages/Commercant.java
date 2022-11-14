package personnages;

public class Commercant extends Humain {


    public Commercant(String nom, String boissonFavori, int argent) {
        super(nom, boissonFavori, argent);
        
    }

    public void recevoir(int argent){
        super.parler(argent+" sous ! Je te remercie généreux donateur!");
        super.setArgent(argent);
    }

    public void seFaireExtorquer() {
    	
        super.perdreArgent(super.getArgent());
        super.parler("J’ai tout perdu! Le monde est trop injuste...");
    }

}
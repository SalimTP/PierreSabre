package personnages;

public class Yakuza  extends Humain{
    private String clan;
    private int reputation=4;
    public Yakuza(String nom, String boissonFavori, int argent,String clan) {
        super(nom, boissonFavori, argent);
        this.clan=clan;

    }
    
    public int getReputation() {
    	return reputation;
    }
    
    public String getClan() {
    	return clan;
    }
    
    public void extorquer(Commercant commercant) {
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler(commercant.getNom()+", si tu tiens à la vie donne moi ta bourse !");
        int argentCommercant=commercant.getArgent();
        commercant.seFaireExtorquer();
        super.setArgent(argentCommercant);
        parler("J’ai piqué les "+argentCommercant+" sous de "+commercant.getNom()+", ce qui me fait "+ super.getArgent()+" sous dans ma poche Hi ! Hi !");
        //rajouter de la reputation de maniere random 
        reputation++;

    }

	
	public void perdre() {
		super.setArgent(0);
		reputation--;
		parler("J'ai perdu mon combat et mes " + super.getArgent() + " sous, snif... J'ai déshonoré le clan de" + clan + ".");
	}
	
	public void gain(int gain) {
		int argentTotal= this.getArgent()+gain;
		this.setArgent(argentTotal);
	}

}
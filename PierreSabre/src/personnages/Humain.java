package personnages;

public class Humain {
	private String nom;
	private String boissonFavori;
	private int argent;
	public Humain(String nom, String boissonFavori, int argent) {
		
		this.nom = nom;
		this.boissonFavori = boissonFavori;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}	
	
	public int getArgent() {
		return argent;
	}
	public void setArgent(int gain) {
		argent+=gain;
	}
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle "+this.nom+" et j’aime boire du "+this.boissonFavori);
	}
	public void boire() {
		parler("Mmmm, un bon verre de .... ! GLOUPS !");
	}
	public void acheter(String bien, int prix) {
		if (argent>prix) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir une "+bien+" à "+prix+" sous");
			argent-=prix;
					
		}
		else
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir un "+bien +" à "+prix+" sous");
		
	}
	

	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	public void parler(String texte){
		System.out.println(texte);
	}

}

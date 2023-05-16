
public class Plaine extends Zone
{
	private int nbArbres;
	
	public Plaine(int x, int y, int z) {
        super(x, y, z);
        this.setType(1);
        this.setNbArbres(0);
    }
    
    public int getNbArbres() {
        return nbArbres;
    }
    

    
    public void ajouterArbres(int nbArbres) {
        this.nbArbres += nbArbres;
    }
    
    
    public boolean estPlaine() 
    {
        return true;
    }
    
    public boolean estDesert() 
    {
        return (this.getEau() <= 10);
    }
    
    public boolean estForet() {
        return (this.nbArbres>0);
    }
    
    public void transformerEnForet() {
        this.setType(0);
        this.ajouterArbres(3);
    }
    
    public void transformerEnDesert() {
        this.setType(2);
        this.setEau(0);
    }
    
    public void transformerEnPlaine() {
        // ne fait rien car on ne peut pas transformer une plaine en plaine
    }

	

}

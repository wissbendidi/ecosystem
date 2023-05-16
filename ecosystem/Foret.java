
public class Foret extends Zone
{
private int nbArbres;
    
    public Foret(int x, int y, int z) {
        super(x, y, z);
        this.setType(0);
        this.setNbArbres(0);
    }
    
    public int getNbArbres() {
        return nbArbres;
    }
    
    public void setNbArbres(int nbArbres) {
        this.nbArbres = nbArbres;
    }
    
    public void ajouterArbres(int nbArbres) {
        this.nbArbres += nbArbres;
    }
    
    public void enleverArbres(int nbArbres) {
        this.nbArbres -= nbArbres;
        if (this.nbArbres < 0) 
        {
            this.nbArbres = 0;
        }
    }
    
    public boolean estPlaine() 
    {
        return (this.nbArbres == 0);
    }
    
    public boolean estDesert() 
    {
        return (this.getEau() <= 10);
    }
    
    public boolean estForet() {
        return true;
    }
    
    public void transformerEnPlaine() {
        this.setType(1);
        this.enleverArbres(3);
    }
    
    public void transformerEnDesert() {
        this.setType(2);
        this.setEau(10);
        this.enleverArbres(3);
    }
    
    public void transformerEnForet() {
        // ne fait rien car on ne peut pas transformer une foret en foret
    }

}

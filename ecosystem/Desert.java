
public class Desert extends Zone
{
	private int nbArbres;
	
	public Desert(int x, int y, int z) {
        super(x, y, z);
        this.setType(2);
        this.setNbArbres(0);
        this.setEau(0);
    }
    
    public int getNbArbres() {
        return nbArbres;
    }
    

    
    public void ajouterArbres(int nbArbres) {
        this.nbArbres += nbArbres;
    }
    
   
    
    public boolean estPlaine() 
    {
        return ((this.nbArbres == 0)& (this.getEau()>=10));
    }
    
    public boolean estDesert() 
    {
        return true;
    }
    
    public boolean estForet() {
        return (this.nbArbres>0);
    }
    
    public void transformerEnPlaine() 
    {
    //Ne fait rien car on peut pas basculer si la zone est Desert
    }
    
    public void transformerEnForet() 
    {
    	//Ne fait rien car on peut pas basculer si la zone est Desert
    }
    
    public void transformerEnDesert() {
        // ne fait rien car on ne peut pas transformer un Desert en Desert
    }


}

import java.util.ArrayList;
import java.util.List;

public abstract class Animal extends Zone implements Manger
{
	// Types d'animaux possibles
		public static final int INSECTES = 0;
	    public static final int OISEAUX = 1;
	    public static final int MAMIFERES= 2;
	    
	    private int type; // type de l'animal
	    private List<Animal> Proies; // liste des animaux Proies
	    private List<Animal> Predateurs; // liste des animaux Predateurs
	    
	    
	    
	    public Animal(int type, int x, int y, int z)
	    {
	    	super(x, y, z);
	    	this.type=type;
	    	this.Proies = new ArrayList<>();
	        this.Predateurs = new ArrayList<>();
	    }
	    
	    public int getType() {
	        return type;
	    }
	    
	    public void setType(int type)
	    {
	    	this.type=type;
	    }
	   
	    
	    public void ajouterProie(Animal proie) {
	        Proies.add(proie);
	    }
	    
	    
	    public void ajouterPredateur(Animal predateur) {
	        Predateurs.add(predateur);
	    }
	    
	    
	    public List<Animal> getProies()
	    {
	    	return Proies;
	    }
	    
	    public List<Animal> getPredateurs()
	    {
	    	return Predateurs;
	    }
	    
	    
	   
	
	
	

}

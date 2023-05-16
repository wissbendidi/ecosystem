import java.awt.Color;
import java.util.*;

public abstract class Zone extends CaseGrille
{
	// Types de terrain possibles
	public static final int FORET = 0;
    public static final int PLAINE = 1;
    public static final int DESERT = 2;
    
    
    private int rayon;
    private Color c;
    private int type; // type de terrain de la zone
    private int temperature; // température de la zone
    private int eau; // niveau d'eau de la zone
    private int nbArbres; // nombre d'arbres dans la zone
    private List<Animal> animaux; // liste des animaux dans la zone
    private List<Vegetal> vegetaux; // liste des végétaux dans la zone
    
    // Constructeur de la classe
    public Zone( int type, int temperature, int eau, int nbArbres) 
    {
        
    	this.type = type;
        this.temperature = temperature;
        this.eau = eau;
        this.nbArbres = 0;
        this.animaux = new ArrayList<>();
        this.vegetaux = new ArrayList<>();
    }
    
    // Getters et setters
    public int getType() {
        return type;
    }
    
    public void setType(int type)
    {
    	this.type=type;
    }
    
    public int getTemperature() 
    {
        return temperature;
    }
    
    public void setTemperature(int temperature) 
    {
        this.temperature = temperature;
    }
    
    public int getEau() 
    {
        return eau;
    }
    
    public void setEau(int eau) 
    {
        this.eau = eau;
    }
    
    public int getNbArbres() 
    {
        return nbArbres;
    }
    
    public void setNbArbres(int nbArbres) 
    {
        this.nbArbres = nbArbres;
    }
    
    public List<Animal> getAnimaux() 
    {
        return animaux;
    }
    
    public List<Vegetal> getVegetaux() 
    {
        return vegetaux;
    }
    
    // Ajoute un animal dans la zone
    public void ajouterAnimal(Animal animal) 
    {
    	addDisque( rayon,c); 
    	animaux.add(animal);
    }
    
    // Supprime un animal de la zone
    public void supprimerAnimal(Animal animal) 
    {
    	removeDisque(rayon,c);
    	animaux.remove(animal);
        
    }
    
    // Ajoute un végétal dans la zone
    public void ajouterVegetal(Vegetal vegetal)
    {
    		vegetaux.add(vegetal);
    }
    
    // Supprime un végétal de la zone
    public void supprimerVegetal(Vegetal vegetal) 
    {
    	
        vegetaux.remove(vegetal);
    }
    
    
    
   
    

}


public class Personne 
{
	private String nom;
	private String prenom;
	
	public Personne(String n, String p) 
	{ 
		nom = n;
		prenom = p;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public String getPrenom()
	{
		return prenom;
	}
	
	public String toString() 
	{
		return "Le nom de cette personne est " + nom + " et son prenom est " + prenom;
	}
}


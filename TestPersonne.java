
public class TestPersonne
{
	public static void main(String[] args)
	{
		Personne p1 = new Personne("Agostinelli", "Laurence");
		System.out.println("Le nom de la personne est " + p1.getNom() + " et son prenom est " + p1.getPrenom());
		System.out.println(" ");
		System.out.println(p1.toString());
	}
}
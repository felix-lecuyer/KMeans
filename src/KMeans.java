import java.util.ArrayList;


public class KMeans {
	
	//attributs
	int valeurK;
	Similarite fonctionSimilarite;
	
	//constructeurs
	public KMeans(int k, Similarite sim){
		this.valeurK=k;
		this.fonctionSimilarite=sim;
	}

	//méthodes
	/**
	 * la méthode run implémente la méthode du KMeans
	 * 
	 * 	1) Initialisation d'un clustering avec seulement des "centres" de clusters choisis aléatoirement
	 * 		(pour cela, appel au constructeur de Clustering)
	 *	2) Reallocation récursive de ce clustering, jusqu'à stabilisation 
	 *
	 * 
	 * @param jeuDonnees : le tableau des variables auxquelles on applique l'algorithme
	 * @return : un k-Clustering solution du problème
	 */
	public Clustering run(ArrayList<Variable> jeuDonnees){
		
		//on crée un clustering, initialisé grâce au constructeur
		Clustering solution = new Clustering(jeuDonnees, valeurK) ;
		
		
		while (solution.reallocation(fonctionSimilarite)){
			//tant que la rallocation implique des changements, on ne sort pas de la boucle
			System.out.println("réallocation effectuée");
		};
		
		
		//on renvoie cette solution
		return solution;
		
	};
	
	
}
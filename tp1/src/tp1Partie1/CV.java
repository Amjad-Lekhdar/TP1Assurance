package tp1Partie1;

public class CV {

	static String nom;
	static String prenom;
	static String formation;
	static int experience;
	static String[] competence;
	static String attente;
	
	
	
	public CV(String pNom, String pPrenom, String pFormation, int pExperience, String[] pCompetence, String pAttente ) {
		
		nom=pNom;
		prenom=pPrenom;
		formation=pFormation;
		experience=pExperience;
		competence=pCompetence;
		attente=pAttente;
		
		
	}
	
	public void affiche() {
		System.out.println("\nnom : " + nom);
		System.out.println("Prenom : " + prenom);
		System.out.println("Formation : " + formation);
		System.out.println("Experiences : " + experience +" ans");
		System.out.println("Compétences");
		afficherCompetence(competence);
		System.out.println();
		System.out.println("Attente : " + attente);
	}
	
	public void afficherCompetence(String[] tab ) {
		
		System.out.println("\t");
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println("-"+tab[i]);
		}
		
	}

}

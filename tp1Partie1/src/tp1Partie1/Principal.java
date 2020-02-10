package tp1Partie1;

public class Principal {

	private static String[] compétence1 = new String[3];
	private static String[] compétence2 = new String[3];
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Bienvenue chez Barette!");
		
		 compétence1[0]="Capacité de travailler sous pression";
		 compétence1[1]="Persévérant, motivé et dynamique";
		 compétence1[2]="Esprit d'équipe et de collaboration";
		
		 CV cv1 = new CV("Amjad","Lekhdar","Pétro-Canada",2,compétence1,"Une meilleure compréhension du programme git");
		 
		 cv1.affiche();
		 
		 compétence2[0]="Une belle capacité d’apprentissage et d’adaptation";
		 compétence2[1]="Une facilité à travailler en situation de stress";
		 compétence2[2]="Un esprit logique et de synthèse";
		 
		 CV cv2 = new CV("Max","Rovel Roger Gauthier","Best-buy",1,compétence2,"Une amélioration de mon bagage pour la programmation de logiciel." + 
		 		"");
		 
		 cv2.affiche();
		
		

	}
}

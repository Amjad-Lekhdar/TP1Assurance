package tp1Partie1;

public class Principal {

	private static String[] comp�tence1 = new String[3];
	private static String[] comp�tence2 = new String[3];
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Bienvenue chez Barette!");
		
		 comp�tence1[0]="Capacit� de travailler sous pression";
		 comp�tence1[1]="Pers�v�rant, motiv� et dynamique";
		 comp�tence1[2]="Esprit d'�quipe et de collaboration";
		
		 CV cv1 = new CV("Amjad","Lekhdar","P�tro-Canada",2,comp�tence1,"Une meilleure compr�hension du programme git");
		 
		 cv1.affiche();
		 
		 comp�tence2[0]="Une belle capacit� d�apprentissage et d�adaptation";
		 comp�tence2[1]="Une facilit� � travailler en situation de stress";
		 comp�tence2[2]="Un esprit logique et de synth�se";
		 
		 CV cv2 = new CV("Max","Rovel Roger Gauthier","Best-buy",1,comp�tence2,"Une am�lioration de mon bagage pour la programmation de logiciel." + 
		 		"");
		 
		 cv2.affiche();
		
		

	}
}

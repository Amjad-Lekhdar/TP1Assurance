package tp1Partie3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Commande {
	
	
	
	static String nom;
	
	static int nbPoutine;
	static int nbFrites;
	static int nbPoulet;
	

	private static double prixPoulet;

	private static double PrixPoutine;

	private static double PrixFrite;
	
	
	
	public Commande(String pNom,  int pNbPoutine,int pNbFrites,int pNbPoulet) throws FileNotFoundException, IOException {
		
		nom=pNom;
		
		nbPoutine=pNbPoutine;
		nbFrites=pNbFrites;
		nbPoulet=pNbPoulet;
		
		
		String[] tab=lireFichier(new File("src/tp1Partie2/facture.txt").getAbsolutePath());
		
		PrixPoutine = Double.parseDouble(tab[6]);
		PrixFrite = Double.parseDouble(tab[8]);
		prixPoulet=Double.parseDouble(tab[10]);
				
		
		
	}
	
	
	public double calculerPrix() {
		
		double total = 0;
		
		
		total=(nbFrites*PrixFrite)+(nbPoutine*PrixPoutine)+(nbPoulet*prixPoulet);
		
		
		return total;
		
		
		
		
	}
	
	public void afficheTotal() {
		System.out.println("\nNom : " + nom);
		System.out.println("Total : " + calculerPrix()+"$");
		
	}
	
	public static String[] lireFichier( String chemin ) throws FileNotFoundException, IOException {

		String[] chaqueLigne = null;

		try (BufferedReader br = new BufferedReader( new FileReader( chemin ) )) {
			String ligne;

			 	ligne = br.readLine();
				chaqueLigne=ligne.split(";");
			
		} 
		return chaqueLigne;
	}
	
	
}

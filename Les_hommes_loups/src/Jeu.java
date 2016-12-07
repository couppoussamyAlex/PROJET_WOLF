import java.util.Scanner;

public class Jeu {

		private Joueur[] joueurs;
		private int[] vivants;
		private int[] loups;
		private int[] villageois;
		private int[] chasseurs;
		
		public Jeu()
		{
			System.out.println("Bienvenue dans le jeu des hommes loups\n\n");
			Scanner scan = new Scanner(System.in);
			
			System.out.println("saisissez le nombre de joueurs");
			int nbJoueurs = scan.nextInt(); //TODO nb de connexions 
			
			joueurs = new Joueur[nbJoueurs];
			vivants = new int[nbJoueurs];
			
			
			
			
			int n = -1;
			
			while(n != nbJoueurs)
			{
			
				System.out.println("Saisissez le nombre de loups");
				
				String nbLoupsStr;
				int nbLoups = 0;
				do
				{
					nbLoupsStr = scan.nextLine();
					if(isNumeric(nbLoupsStr))
					{	
						nbLoups = Integer.parseInt(nbLoupsStr);
						loups = new int[nbLoups];
					}
				}
				while(!isNumeric(nbLoupsStr));
				
				System.out.println("Saisissez le nombre de villageois");
				
				
				String nbVilStr;
				int nbVil=0;
				do
				{
					nbVilStr = scan.nextLine();
					if(isNumeric(nbVilStr))
					{	
						nbVil = Integer.parseInt(nbVilStr);
						villageois = new int[nbVil];
					}
				}
				while(!isNumeric(nbVilStr));
				
				
				
				System.out.println("Saisissez le nombre de chasseurs");
				
				
				String nbChaStr;
				int nbCha=0;
				do
				{
					nbChaStr = scan.nextLine();
					if(isNumeric(nbChaStr))
					{	
						nbCha = Integer.parseInt(nbChaStr);
						chasseurs = new int[nbCha];
					}
				}
				while(!isNumeric(nbChaStr));
				
				n = nbLoups + nbVil + nbCha;
				if(n != nbJoueurs)
				{
					System.out.println("Vous n'avez pas entré le bon nombre de joueurs!!!\n\n");
				}
		
			}
			
			//TODO attribuer les cartes
			
			
			
			
		}
		
		
		public boolean isNumeric (String s) 
		{  
		    return s.matches("[-+]?\\d*\\.?\\d+");  
		}  
		
}

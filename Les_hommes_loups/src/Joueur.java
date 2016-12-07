
public class Joueur {

	
		//TODO truc pour savoir si il est maire ou pas, touché par corbeua ou pas etc.
		private Carte carte;
		private boolean vivant;
		
		//Getters et setters
		public Carte getCarte() {
			return carte;
		}

		public void setCarte(Carte carte) {
			this.carte = carte;
		}

		public boolean isVivant() {
			return vivant;
		}

		public void setVivant(boolean vivant) {
			this.vivant = vivant;
		}
		
		

		public Joueur(Carte carte)
		{
			this.carte = carte;
			this.vivant = true;
		}
		
		
		
}

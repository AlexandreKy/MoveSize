package Jeu;

import java.util.ArrayList;

public class TerrainJeu {
	private ArrayList<Case> Cases; /** une matrice pour le plateau ou juste une liste ?*/
	private ArrayList<Unite> Unites;
	
	public ArrayList<Case> getCases() {
		return Cases;
	}

	/**
	 * @return the unites
	 */
	public ArrayList<Unite> getUnites() {
		return Unites;
	}

}

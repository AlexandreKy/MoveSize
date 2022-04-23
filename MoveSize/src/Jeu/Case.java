package Jeu;

public class Case {
	private TerrainJeu terrainJeu;
	private int X;
	private int Y;
	
	public Case() {
		terrainJeu = new TerrainJeu();
		X = 0;
		Y = 0;
	}
	

	/**
	 * @return the x
	 */
	public int getX() {
		return X;
	}


	/**
	 * @return the y
	 */
	public int getY() {
		return Y;
	}


	/**
	 * @return the terrainJeu
	 */
	public TerrainJeu getTerrainJeu() {
		return terrainJeu;
	}
	

}

package Jeu;

import java.util.Scanner;

public class Unite{
	private String nom;
	private String joueur;
	private Case c;
	private int nombre;
	private double moral;
	private double efficaciteTir;
	private double efficaciteCac;
	private double pointsDeplacement;
	private double capaciteFranchissment;
	private Arme arme;

	/**
	 * @param joueur
	 * @param nombre
	 * @param moral
	 * @param efficaciteTir
	 * @param efficaciteCac
	 * @param pointsDeplacement
	 * @param capaciteFranchissment
	 */
	public Unite(String nom, String joueur, int nombre, double moral, double efficaciteTir, double efficaciteCac,
			double pointsDeplacement, double capaciteFranchissment, Case c) {
		this.nom = nom;
		this.joueur = joueur;
		this.nombre = nombre;
		this.moral = moral;
		this.efficaciteTir = efficaciteTir;
		this.efficaciteCac = efficaciteCac;
		this.pointsDeplacement = pointsDeplacement;
		this.capaciteFranchissment = capaciteFranchissment;
		this.c = c;
	}
	
	public String getNom() {
		return nom;
	}
	/**
	 * @return the nombre
	 */
	public int getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the moral
	 */
	public double getMoral() {
		return moral;
	}
	/**
	 * @param moral the moral to set
	 */
	public void setMoral(double moral) {
		this.moral = moral;
	}
	/**
	 * @return the joueur
	 */
	public String getJoueur() {
		return joueur;
	}
	/**
	 * @return the efficaciteTir
	 */
	public double getEfficaciteTir() {
		return efficaciteTir;
	}
	/**
	 * @return the efficaciteCac
	 */
	public double getEfficaciteCac() {
		return efficaciteCac;
	}
	/**
	 * @return the pointsDeplacement
	 */
	public double getPointsDeplacement() {
		return pointsDeplacement;
	}
	/**
	 * @return the capaciteFranchissment
	 */
	public double getCapaciteFranchissment() {
		return capaciteFranchissment;
	}
	/**
	 * @return the arme
	 */
	public Arme getArme() {
		return arme;
	}
	
	public Case getCase() {
		return c;
	}
	
	public void setCase(int X,int Y) {
		for (Case c : this.c.getTerrainJeu().getCases()) {
			if (c.getX() == X && c.getY() == Y) {
				this.c = c;
			}
		}
	}
	
	public int tirer(Unite unit) {
		return (int) Math.round(nombre*efficaciteTir);
	}
	
	public int cac(Unite unit) {
		return (int) Math.round(nombre*efficaciteCac);
	}
	/** ajouter le cancel surtout s'il n'y a pas d'unites à portée*/
	public int Ordre() {
		Scanner sc = new Scanner(System.in);
		String ordre;
		Unite unite = new Unite("nom", "joueur", 0, 0, 0, 0, 0, 0, new Case());
		String nomUnite;
		System.out.println("Ordre (tir ou cac)");
		ordre = sc.nextLine();
		System.out.println("Unite");
		nomUnite = sc.nextLine();
		for (Unite u : this.getCase().getTerrainJeu().getUnites()) {
			if (u.getNom() == nomUnite) {
				unite = u;
			}
		}
		if (ordre == "tir") {
			/** mettre en surbrillance les cases à portée */
			return tirer(unite);
		}
		return cac(unite);
		
	}
}
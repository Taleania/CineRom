package com.demos.cine.model;

public class Article {
	
	// Attributs
	private String reference;
	private Double prixHT;
	private String designation;
	private int qteStock;
	private boolean dematerialise;
	

	// Constructeur Article avec stock que l'on considère pas dématérialisé
	public Article(String reference, Double prixHT, String designation, int qteStock) {
		super();
		this.reference = reference;
		this.prixHT = prixHT;
		this.designation = designation;
		this.qteStock = qteStock;
		this.dematerialise=false;
	}
	
	
	// Constructeur Article sans stock que l'on considère dématérialisé (objet dématérialisé)
	public Article(String reference, Double prixHT, String designation) {
		super();
		this.reference = reference;
		this.prixHT = prixHT;
		this.designation = designation;
		this.qteStock = 0;
		this.dematerialise=true;
	}
	
	
	// Méthodes
	public Double getPrixHT() {
		return prixHT;
	}


	public void setPrixHT(Double prixHT) {
		this.prixHT = prixHT;
	}


	public String getReference() {
		return reference;
	}


	public String getDesignation() {
		return designation;
	}


	public int getQteStock() {
		return qteStock;
	}
	
	// Est-ce que l'article est dématérialisé ?		
	public boolean isDematerialise() {
		return dematerialise;
	}
	
	
	public void setDematerialise(boolean dematerialise) {
		this.dematerialise = dematerialise;
	}
		
	
		// arrivage de stock
	public void incrementStock(int qte){
		qteStock=qteStock+qte;
	}
	
		// vente d'articles
	public void decrementStock(int qte){
		qteStock=qteStock-qte;
	}


	@Override
	public String toString(){
		String description = " ";
		if (!isDematerialise()){ 
			description = "reference=" + reference + 
				", prixHT=" + prixHT + 
				", designation=" + designation + 
				", qteStock="
				+ qteStock;
			}
		else{
			description = "reference=" + reference + 
					", prixHT=" + prixHT + 
					", designation=" + designation + 
					", objet dématérialisé";			
		}
		return description;
	}
	
	

}

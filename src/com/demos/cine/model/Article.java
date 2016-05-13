package com.demos.cine.model;

public class Article {
	
	// Attributs
	private String reference;
	private Double prixHT;
	private String designation;
	private int qteStock;
	private boolean dematerialise;
	

	// Constructeur Article avec stock que l'on consid�re pas d�mat�rialis�
	public Article(String reference, Double prixHT, String designation, int qteStock) {
		super();
		this.reference = reference;
		this.prixHT = prixHT;
		this.designation = designation;
		this.qteStock = qteStock;
		this.dematerialise=false;
	}
	
	
	// Constructeur Article sans stock que l'on consid�re d�mat�rialis� (objet d�mat�rialis�)
	public Article(String reference, Double prixHT, String designation) {
		super();
		this.reference = reference;
		this.prixHT = prixHT;
		this.designation = designation;
		this.qteStock = 0;
		this.dematerialise=true;
	}
	
	
	// M�thodes
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
	
	// Est-ce que l'article est d�mat�rialis� ?		
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
					", objet d�mat�rialis�";			
		}
		return description;
	}
	
	

}

package com.demos.cine.model;

public class Article {
	
	// Attributs pour Article
	private String reference;
	private Double prixHT;
	private String designation;
	private int qteStock;
	
		
	// Constructeur Article
	public Article(String reference, Double prixHT, String designation, int qteStock) {
		super();
		this.reference = reference;
		this.prixHT = prixHT;
		this.designation = designation;
		this.qteStock = qteStock;
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
	
		// arrivage de stock
	public void incrementStock(int qte){
		qteStock=qteStock+qte;
	}
	
		// vente d'articles
	public void decrementStock(int qte){
		qteStock=qteStock-qte;
	}


	@Override
	public String toString() {
		return "Article [reference=" + reference + ", prixHT=" + prixHT + ", designation=" + designation + ", qteStock="
				+ qteStock + "]";
	}
	
	

}

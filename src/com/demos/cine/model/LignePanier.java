package com.demos.cine.model;

public class LignePanier {
	
	// Attributs
	Article article;
	int quantite;
		
	// Constructeur
	public LignePanier(Article article, int quantite) {
		super();
		this.article = article;
		this.quantite = quantite;
	}

	public Article getArticle() {
		return article;
	}

	public int getQuantite() {
		return quantite;
	}
	
	
	

}

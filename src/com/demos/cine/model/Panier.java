package com.demos.cine.model;

import java.util.ArrayList;

public class Panier {
	
	// Attributs
	private ArrayList<LignePanier> contenu = new ArrayList<LignePanier>(); 
	
	// Méthodes
	public void ajouter(Article a, int qte){
		LignePanier lp = new LignePanier(a,qte);
		contenu.add(lp);		
	}



	public double getPrixTotalHT(){
		double prixTotalHT=0;
		for(LignePanier lp:contenu){
			prixTotalHT=prixTotalHT+lp.getArticle().getPrixHT()*lp.getQuantite();
		}
		return prixTotalHT;
	}
	
	
	@Override
	public String toString(){
		String description="";
		for(LignePanier lp:contenu){
			description+=lp.getArticle().getReference() + "   " + lp.getQuantite()+ "\n";
		}
		return description;
	}
	
}

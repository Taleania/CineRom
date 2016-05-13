package com.demos.cine.model;

public class LePrincipal {

	public static void main(String[] args) {
		Panier pa=new Panier();
		
		Article art1=new Article("12345", 12.5, "La vie de Coppola", 10);
		Article art2=new Article("12346", 8.5, "Le parrain");
		
		pa.ajouter(art1,3);
		pa.ajouter(art2,1);
		
		System.out.println(art2);
		System.out.println(pa);
		System.out.println(pa.getPrixTotalHT());

	}

}

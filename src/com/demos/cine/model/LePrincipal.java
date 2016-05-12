package com.demos.cine.model;

public class LePrincipal {

	public static void main(String[] args) {
		Panier pa=new Panier();
		
		try{
		Article art1=new Article("12345", new Prix(12.5), "La vie de Coppola", 10);
		pa.ajouter(art1,1);
		}
		catch (Exception e){
			System.out.println("article non créé car prix incorrect");
		} 
		try{
		Article art2=new Article("12346", new Prix(8.5), "Le parrain", 5);
		pa.ajouter(art2,5);
		}
		catch (Exception e){
			System.out.println("article non créé car prix incorrect");
		} 
		
	
		System.out.println(pa);
		System.out.println(pa.getPrixTotalHT());

	}

}

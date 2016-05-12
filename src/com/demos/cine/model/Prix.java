package com.demos.cine.model;

public class Prix {
	private double valeur;
	
	public Prix(double p) throws Exception{
		// Si prix négatif, alors on ne crée par un objet prix négatif
		setPrix(p);
	}
	
	public double getPrix(){
		return valeur;
	}
	
	public void setPrix(double p) throws Exception{
		if(p<0){
			throw new Exception ("prix négatif");
		}
	}

}

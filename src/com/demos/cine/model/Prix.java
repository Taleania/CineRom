package com.demos.cine.model;

public class Prix {
	private double valeur;
	
	public Prix(double p) throws Exception{
		// Si prix n�gatif, alors on ne cr�e par un objet prix n�gatif
		setPrix(p);
	}
	
	public double getPrix(){
		return valeur;
	}
	
	public void setPrix(double p) throws Exception{
		if(p<0){
			throw new Exception ("prix n�gatif");
		}
	}

}

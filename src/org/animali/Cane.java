package org.animali;

public class Cane extends Animale implements Swim {

	@Override
	public void verso() {
		System.out.println("Il cane fa bau");
	}

	@Override
	public void mangia() {
		System.out.println("Il cane mangia crocchette");
	}
	
	@Override
	protected String tipoAnimale() {
	     return "Il cane ";
	}
	 
	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}
}

package org.animali;

public class Cane extends Animale {

	@Override
	public void verso() {
		System.out.println("Il cane fa bau");
	}

	@Override
	public void mangia() {
		System.out.println("Il cane mangia crocchette");
	}

}

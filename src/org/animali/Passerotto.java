package org.animali;

public class Passerotto extends Animale implements Fly {

	@Override
	public void verso() {
		System.out.println("Il passerotto fa chip");
	}

	@Override
	public void mangia() {
		System.out.println("Il passerotto mangia vermi e semi");
	}
	
	@Override
    protected String tipoAnimale() {
        return "Il passerotto ";
    }
	
	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
	}
}

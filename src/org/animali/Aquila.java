package org.animali;

public class Aquila extends Animale implements Fly {

	@Override
	public void verso() {
		System.out.println("L'aquila stride");
	}

	@Override
	public void mangia() {
		System.out.println("L'aquila mangia topi e piccoli animali.");
	}

	@Override
    protected String tipoAnimale() {
        return "L'aquila ";
    }

	@Override
	public void vola() {
		System.out.println("L'aquila vola");
	}
}

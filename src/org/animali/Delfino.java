package org.animali;

public class Delfino extends Animale implements Swim {

	@Override
	public void verso() {
		System.out.println("Il delfino fa stridii acuti");
	}

	@Override
	public void mangia() {
		System.out.println("Il delfino mangia altri pesci");
	}

	@Override
    protected String tipoAnimale() {
        return "Il delfino ";
    }
	
	@Override
	public void nuota() {
		System.out.println("Il delfino nuota");
	}
}

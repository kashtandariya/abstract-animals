package org.animali;

public class Main {
	public static void faiVolare(Fly animale) {
        animale.vola();
    }

    public static void faiNuotare(Swim animale) {
        animale.nuota();
    }
	
    public static void main(String[] args) {	     
    	Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();

        cane.dormi();
        cane.verso();
        cane.mangia();
        faiNuotare(cane);

        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();
        faiVolare(passerotto);

        aquila.dormi();
        aquila.verso();
        aquila.mangia();
        faiVolare(aquila);

        delfino.dormi();
        delfino.verso();
        delfino.mangia();
        faiNuotare(delfino);
    }
}

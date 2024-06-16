package org.animali;

public class Main {
	
	
    public static void main(String[] args) {	     
    	Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();

        cane.dormi();
        cane.verso();
        cane.mangia();
        cane.nuota();

        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();
        passerotto.vola();

        aquila.dormi();
        aquila.verso();
        aquila.mangia();
        aquila.vola();

        delfino.dormi();
        delfino.verso();
        delfino.mangia();
        delfino.nuota();
    }
}

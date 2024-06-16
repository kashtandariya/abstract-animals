package org.animali;

abstract class Animale {
    public void dormi() {
        System.out.println("Zzz"); //comune a tutti con implementazione Zzz
    }

    //Metodi astratti da implementare a seconda dell'animale nelle sottoclassi?
    public abstract void verso();
    public abstract void mangia();
}

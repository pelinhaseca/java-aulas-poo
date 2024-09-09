package br.sesi.ped.poo.cabeca;

public class Cabeca {
    public Olho olho;
    public Orelha aparelhoauditivo;
    public Nariz nariz;
    public Boca laginha;

    public Cabeca() {
        this.olho = new Olho();
        this.aparelhoauditivo = new Orelha();
        this.nariz = new Nariz();
        this.laginha = new Boca();

    }
}

package br.sesi.ped.poo.cabeca;

public class Cabeca {
    public Olho olhoEsquerdo;
    public Olho olhoDireito;
    public Orelha aparelhoauditivo;
    public Nariz nariz;
    public Boca laginha;

    public Cabeca() {
        this.olhoEsquerdo = new Olho();
        this.olhoDireito = new Olho();
        this.aparelhoauditivo = new Orelha();
        this.nariz = new Nariz();
        this.laginha = new Boca();

    }
}

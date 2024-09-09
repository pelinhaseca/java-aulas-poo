package br.sesi.ped.poo;

import br.sesi.ped.poo.cabeca.Cabeca;
import br.sesi.ped.poo.cabeca.Olho;
import br.sesi.ped.poo.inferior.MembrosInferiores;
import br.sesi.ped.poo.tronco.Tronco;

public class Pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferiores;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferiores = new MembrosInferiores();

}
}

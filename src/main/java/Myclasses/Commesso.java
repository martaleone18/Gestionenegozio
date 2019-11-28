/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myclasses;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Commesso extends Persona {

    private int matricola;
    private String infoCommesso;
    private ArrayList<Commesso> elencoCommessi;

    public Commesso(String nome, String cognome, String luogoNascita, LocalDate dataNascita, int matricola) {
        super(nome, cognome, luogoNascita, dataNascita);
        this.matricola = matricola;
        this.cognome = "leone"; //nella classe padre è protected, può essere modificato
        elencoCommessi = new ArrayList<Commesso>();

    }

    public int getMatricola() {
        return matricola;
    }

    public String getInfoCommesso() {
        String ris = "";
        ris = "Commesso:" + "\n" + getNome() + " " + getCognome() + "\n" + "nato/a a " + getLuogoNascita() + " il giorno "
                + getDataNascita() + "\n" + getMatricola();

        return ris;
    }

    public ArrayList<Commesso> getElencoCommessi() {
        return elencoCommessi;
    }

    public void setElencoCommessi(ArrayList<Commesso> elencoCommessi) {
        this.elencoCommessi = elencoCommessi;
    }

}

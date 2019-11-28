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
public class Client extends Persona {

    private int codcliente;
    private String infoCliente;
    private ArrayList<Client> elencoClienti;

    public Client(String nome, String cognome, String luogoNascita, LocalDate dataNascita, int codcliente) {
        super(nome, cognome, luogoNascita, dataNascita);
        this.codcliente = codcliente;
        elencoClienti = new ArrayList<Client>();

    }

    public int getCodcliente() {
        return codcliente;
    }

    public String getInfoCliente() {
        String ris = "";
        ris = "Cliente:" + "\n" + getNome() + " " + getCognome() + "\n" + "nato/a a " + getLuogoNascita() + " il giorno "
                + getDataNascita() + "\n" + getCodcliente();

        return ris;
    }

    public ArrayList<Client> getElencoClienti() {
        return elencoClienti;
    }

    public void setElencoClienti(ArrayList<Client> elencoClienti) {
        this.elencoClienti = elencoClienti;
    }

    public void addClient(String cognome, String nome, String luogoNascita, LocalDate dataNascita, int codcliente) {
        Client Cli = new Client(cognome, nome, luogoNascita, dataNascita, codcliente);
    }

}

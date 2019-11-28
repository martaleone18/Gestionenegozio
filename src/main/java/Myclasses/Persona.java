/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Myclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author tss
 */
public class Persona {

    protected String nome;
    protected String cognome;
    protected String luogoNascita;
    protected LocalDate dataNascita;

    public Persona(String nome, String cognome, String luogoNascita, LocalDate dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.luogoNascita = luogoNascita;
        this.dataNascita = dataNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

}

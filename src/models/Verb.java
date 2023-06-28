/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author HP
 */
public class Verb extends Word {
    private String verbPast;
    private String verbInfinitive;
    private boolean regularVerb;

    public Verb(String word, String traduction,String verbast,String verbInfinitive,boolean regularVerb) {
        super(word, traduction);
        this.verbPast=verbPast;
        this.verbInfinitive=verbInfinitive;
        this.regularVerb=regularVerb;
    }

    public String getVerbPast() {
        return verbPast;
    }

    public void setVerbPast(String verbPast) {
        this.verbPast = verbPast;
    }

    public String getVerbInfinitive() {
        return verbInfinitive;
    }

    public void setVerbInfinitive(String verbInfinitive) {
        this.verbInfinitive = verbInfinitive;
    }

    public boolean isRegularVerb() {
        return regularVerb;
    }

    public void setRegularVerb(boolean regularVerb) {
        this.regularVerb = regularVerb;
    }
    
}

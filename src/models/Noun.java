/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HP
 */
public class Noun extends Word{
     private Map<String,String>synonyms= new HashMap<>();

    public Noun(String word, String traduction,Map<String,String>synonyms) {
        super(word, traduction);
        this.synonyms=synonyms;
    }

    public Map<String, String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(Map<String, String> synonyms) {
        this.synonyms = synonyms;
    }
    
}

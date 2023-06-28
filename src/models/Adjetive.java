/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
public class Adjetive extends Word{
    private Map<String,String>synonyms= new HashMap<>();

    public Adjetive(String word, String traduction,Map<String,String>synonyms) {
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

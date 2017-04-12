package com.example.anicet.newrecyclerview;

/**
 * Created by ANICET on 21/03/2017.
 */

public class info {

    private String nom;
    private String prenom;
    private String profession;


    public info(String nom, String prenom, String profession) {
        this.nom = nom;
        this.prenom = prenom;
        this.profession = profession;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}

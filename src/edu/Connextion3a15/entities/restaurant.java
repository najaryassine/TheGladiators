/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Connextion3a15.entities;

/**
 *
 * @author mazen
 */
public class restaurant {
   private int id_restaurant;
   private int nombre_etoil;
   private String adresse;
   private String nom;

    public restaurant(int id_restaurant, int nombre_etoil, String adresse, String nom) {
        this.id_restaurant = id_restaurant;
        this.nombre_etoil = nombre_etoil;
        this.adresse = adresse;
        this.nom = nom;
    }

    public int getId_restaurant() {
        return id_restaurant;
    }

    public void setId_(int id_restaurant) {
        this.id_restaurant = id_restaurant;
    }



    public int getNombre_etoil() {
        return nombre_etoil;
    }

    public void setNombre_etoil(int nombre_etoil) {
        this.nombre_etoil = nombre_etoil;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "restaurant{" + "id_restaurant=" + id_restaurant + ", nombre_etoil=" + nombre_etoil + ", adresse=" + adresse + ", nom=" + nom + '}';
    }
   
    
}

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
public class Hotel {
  private int id_hotel;
  private int nombre_chambre;
   private int nombre_etoil;
   private String adresse;
   private String nom;

    public Hotel(int id_hotel, int nombre_chambre, int nombre_etoil, String adresse, String nom) {
        this.id_hotel = id_hotel;
        this.nombre_chambre = nombre_chambre;
        this.nombre_etoil = nombre_etoil;
        this.adresse = adresse;
        this.nom = nom;
    }

    public int getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }

    public int getNombre_chambre() {
        return nombre_chambre;
    }

    public void setNombre_chambre(int nombre_chambre) {
        this.nombre_chambre = nombre_chambre;
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
        return "Hotel{" + "id_hotel=" + id_hotel + ", nombre_chambre=" + nombre_chambre + ", nombre_etoil=" + nombre_etoil + ", adresse=" + adresse + ", nom=" + nom + '}';
    }
   
    
}

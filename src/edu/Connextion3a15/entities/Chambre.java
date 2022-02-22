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
public class Chambre {
    private int numero;
      private int nombre_lits;	
      private float prix;
       private int etage;	
      private int id_hotel;

    public Chambre(int numero, int nombre_lits, float prix, int etage, int id_hotel) {
        this.numero = numero;
        this.nombre_lits = nombre_lits;
        this.prix = prix;
        this.etage = etage;
        this.id_hotel = id_hotel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNombre_lits() {
        return nombre_lits;
    }

    public void setNombre_lits(int nombre_lits) {
        this.nombre_lits = nombre_lits;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public int getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }

    @Override
    public String toString() {
        return "Chambre{" + "numero=" + numero + ", nombre_lits=" + nombre_lits + ", prix=" + prix + ", etage=" + etage + ", id_hotel=" + id_hotel + '}';
    }
      
    
}

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
public class menu {
    private int numero_repa;
      private String nom;	
      private float prix;
       	
      private int id_restaurant;

    public menu(int numero_repa,String nom, float prix, int id_restaurant) {
        this.numero_repa = numero_repa;
        this.nom = nom;
        this.prix = prix;
        
        this.id_restaurant = id_restaurant;
    }

    public int getNumero_repa() {
        return numero_repa;
    }

    public void setNumero_repa(int numero_repa) {
        this.numero_repa = numero_repa;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

 

    public int getId_restaurant() {
        return id_restaurant;
    }

    public void setId_restaurant(int id_restaurant) {
        this.id_restaurant = id_restaurant;
    }

    @Override
    public String toString() {
        return "menu{" + "numero_repa=" + numero_repa + ", nom=" + nom + ", prix=" + prix +  ", id_restaurant=" + id_restaurant + '}';
    }
      
    
}

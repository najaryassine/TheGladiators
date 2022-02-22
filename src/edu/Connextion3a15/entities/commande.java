/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Connextion3a15.entities;

import java.sql.Date;

/**
 *
 * @author mazen
 */
public class commande {
    private int id_commande;	
    private String date_commande;	
    
    private int idc;

    public commande(int id_commande, String date_commande, int idc) {
        this.id_commande = id_commande;
        this.date_commande = date_commande;
        
        this.idc = idc;
    }

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public String getDate_commande() {
        return date_commande;
    }

    public void setDate_reservation(String date_commande) {
        this.date_commande = date_commande;
    }

  

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    @Override
    public String toString() {
        return "commande{" + "id_commande=" + id_commande + ", date_commande=" + date_commande +  ", idc=" + idc + '}';
    }
    
    
}

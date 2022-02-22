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
public class Reservation {
    private int id_reservation;	
    private String date_reservation;	
    private int dure;
    private int idc;

    public Reservation(int id_reservation, int dure, int idc, String date_reservation) {
        this.id_reservation = id_reservation;
        this.date_reservation = date_reservation;
        this.dure = dure;
        this.idc = idc;
    }

    public int getId_reservation() {
        return id_reservation;
    }

    public void setId_reservation(int id_reservation) {
        this.id_reservation = id_reservation;
    }

    public String getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(String date_reservation) {
        this.date_reservation = date_reservation;
    }

    public int getDure() {
        return dure;
    }

    public void setDure(int dure) {
        this.dure = dure;
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id_reservation=" + id_reservation + ", date_reservation=" + date_reservation + ", dure=" + dure + ", idc=" + idc + '}';
    }
    
    
}

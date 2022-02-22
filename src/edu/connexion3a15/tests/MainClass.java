/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.connexion3a15.tests;

import edu.connexion3a15.entities.Personne;
import edu.connexion3a15.services.PersonneCRUD;
import edu.connexion3a15.utils.MyConnection;

/**
 *
 * @author karra
 */
public class MainClass {
    
    public static void main(String[] args) {
        //MyConnection mc = new MyConnection();
        PersonneCRUD pcd = new PersonneCRUD();
        Personne m = new Personne(52, "Ben salah", "Hedi");
        //pcd.ajouterPersonne();
       // pcd.ajouterPersonne2(m);
       System.out.println(pcd.listerPersonnes());
    }
}

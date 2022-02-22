/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.connexion3a15.services;

import edu.connexion3a15.entities.Personne;
import edu.connexion3a15.utils.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karra
 */
public class PersonneCRUD {
    
    public void ajouterPersonne(){
        try {
            String requete = "INSERT INTO personne (nom,prenom) "
                    +    "VALUES ('Tounsi','Ahmed')";
            Statement st = MyConnection.getInstance().getCnx().createStatement();
            st.executeUpdate(requete);
            System.out.println("Personne ajoutée!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void ajouterPersonne2(Personne p){
        try {
            String requete = "INSERT INTO personne(nom,prenom) VALUES (?,?)";
            PreparedStatement pst = MyConnection.getInstance().getCnx().prepareStatement(requete);
            pst.setString(1, p.getNom());
            pst.setString(2, p.getPrenom());
            pst.executeUpdate();
            System.out.println("Element ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<Personne> listerPersonnes(){
        List<Personne> myList = new ArrayList();
        try {    
            String requete="SELECT * FROM personne";
            Statement st = MyConnection.getInstance().getCnx().createStatement();
             ResultSet rs =   st.executeQuery(requete);
        
             while(rs.next()){
                 Personne per = new Personne();
                 per.setId(rs.getInt(1));
                 per.setNom(rs.getString("nom"));
                 per.setPrenom(rs.getString("prenom"));
                 myList.add(per);
             }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return myList;
    }
}

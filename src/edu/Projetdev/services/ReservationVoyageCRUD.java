/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Projetdev.services;

import edu.Projetdev.entities.ReservationVoyage;
import edu.Projetdev.entities.Voyage;
import edu.Projetdev.entities.Client;
import edu.Projetdev.tools.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yassi
 */
public class ReservationVoyageCRUD 
{

    public void ajouterReservationVoyage(ReservationVoyage rv) 
    {
        try {
            String requette = "INSERT INTO reservation_voyage (id_voy,idc)"
                    +"VALUES(?,?)" ;
            PreparedStatement ps = MyConnection.getInstance().getCnx().prepareStatement(requette);
         
            
          
            ps.setInt(1, rv.getId_voy());
            ps.setInt(2, rv.getIdc());
            
         
            ps.executeUpdate();
            System.out.println("Réservation de voyage ajoutée");
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }

      }
    
    
    
    public void modifierReservationVoyage(ReservationVoyage rv, int id_res_voy) {
     try {
            String requette = ("update reservation_voyage set Id_voy= ?, Idc= ?  where id_res_voy= ? ");
            PreparedStatement ps = MyConnection.getInstance().getCnx().prepareStatement(requette);
            ps.setInt(1, rv.getId_voy());
            ps.setInt(2, rv.getIdc());
            ps.setInt(3, id_res_voy);
            
            ps.executeUpdate();
            System.out.println("Réservation de voyage modifiéé");
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
   
    }
    
    
    
    

       public void supprimerReservationVoyage(int id_res_voy) {
       try {
            
            String requette = ("delete from reservation_voyage where id_res_voy=?");
            PreparedStatement ps = MyConnection.getInstance().getCnx().prepareStatement(requette);
            ps.setInt(1,id_res_voy);
            ps.executeUpdate();
            System.out.println("Réservation de voyage supprimée");
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }
    
    
    
    
    public List<ReservationVoyage>liste_jointure_reservation_voyages()
        {
            List<ReservationVoyage> liste_jointure_reservation_voyages= new ArrayList();
        try {
            String requette= "select v.id_voy,c.idc "
                    + "from ( voyage v INNER JOIN reservation_voyage rv ON (rv.id_voy=v.id_voy) ) INNER JOIN client c ON (rv.idc=c.idc)";
            Statement st= MyConnection.getInstance().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requette);
            while(rs.next())
            {
                ReservationVoyage rvoy= new ReservationVoyage();
                
                rvoy.setId_voy(rs.getInt(1));
                rvoy.setIdc(rs.getInt(2));

                liste_jointure_reservation_voyages.add(rvoy);
                
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
        }
        return liste_jointure_reservation_voyages;
        
        }
    
    
    
    
    
    
    
        public List<ReservationVoyage>liste_reservation_voyages()
        {
            List<ReservationVoyage> liste_reservation_voyages= new ArrayList();
        try {
            String requette= "SELECT * FROM reservation_voyage";
            Statement st= MyConnection.getInstance().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requette);
            while(rs.next())
            {
                ReservationVoyage rvoy= new ReservationVoyage();
                rvoy.setId_res_voy(rs.getInt(1));
                rvoy.setId_voy(rs.getInt(2));
                rvoy.setIdc(rs.getInt(3));

                liste_reservation_voyages.add(rvoy);
                
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
        }
        return liste_reservation_voyages;
        
        }
        





}

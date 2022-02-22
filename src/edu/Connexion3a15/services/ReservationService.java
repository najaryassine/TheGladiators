/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Connexion3a15.services;




import IServices.IreservationService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.Connexion3a15.tools.MyConnection;
import edu.Connextion3a15.entities.Hotel;
import edu.Connextion3a15.entities.Reservation;


/**
 *
 * @author MR
 */
public class ReservationService implements IreservationService  {
     Connection connexion;
     Statement stm;

    public ReservationService() {
         connexion = MyConnection.getInstance().getCnx();
    }

    /**
     *
     * @param h
     * @throws SQLException
     */
    @Override
    public void ajouterReservation(Reservation r) {
            
       try {  
            String req_ajout = "insert into reservation(date_reservation,dure,idc) values (?,?,?)";
            PreparedStatement ps = connexion.prepareStatement(req_ajout);
           
             ps.setString(1, r.getDate_reservation());
            ps.setInt(2, r.getDure());
             ps.setInt(3, r.getIdc());
         
          
           
            ps.executeUpdate();   
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
    }

     @Override
    public void modifierreservation(Reservation r, int id) {
     try {
            PreparedStatement ps = connexion.prepareStatement("update reservation set id_reservation=? ,date_reservation=?, dure=? ,idc=?");
             ps.setInt(1, r.getId_reservation());
             ps.setString(2, r.getDate_reservation());
            ps.setInt(3, r.getDure());
             ps.setInt(4, r.getIdc());
         
            ps.setInt(5,id);
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
   
    }

     @Override
    public void supprimerreservation(Reservation r, int id) {
       try {
            PreparedStatement ps = connexion.prepareStatement("delete from reservation where id_reservation=?");
            ps.setInt(1,id);
            ps.executeUpdate();
         
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }

    public List<Reservation> afficherreservation() {
        List<Reservation> reservations = new ArrayList<>();
        try {
            String req = "select * from reservation";
            PreparedStatement ps = connexion.prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                  Reservation reservation = new Reservation(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4));
                   reservations.add(reservation);
            }
            
                    
        }
        catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    

        
        return reservations;
        
    }
    public String countReservation() {

        String req = "SELECT COUNT(*) FROM reservation";
        PreparedStatement pst;
        try {
            pst = connexion.prepareStatement(req);
            pst.executeQuery(req);
            ResultSet rs = pst.getResultSet();
            rs.next();
            
            return ("Table contains " + rs.getInt("count(*)") + " rows");
            
          
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return null;
        }

    }
}



  
    

   

  


    
    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Connexion3a15.services;



import IServices.IhotelService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.Connexion3a15.tools.MyConnection;
import edu.Connextion3a15.entities.Hotel;


/**
 *
 * @author MR
 */
public class HotelService implements IhotelService  {
     Connection connexion;
     Statement stm;

    public HotelService() {
         connexion = MyConnection.getInstance().getCnx();
    }

    /**
     *
     * @param h
     * @throws SQLException
     */
    @Override
    public void ajouterHotel(Hotel h) {
            
       try {  
            String req_ajout = "insert into hotel(id_hotel,nombre_chambre,nombre_etoil,adresse ,nom,image) values (?,?,?,?,?,'aaa')";
            PreparedStatement ps = connexion.prepareStatement(req_ajout);
            ps.setInt(1, h.getId_hotel());
             ps.setInt(2, h.getNombre_chambre());
            ps.setInt(3, h.getNombre_etoil());
             ps.setString(4, h.getAdresse());
              ps.setString(5, h.getNom());
          
           
            ps.executeUpdate();   
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
    }

     @Override
    public void modifierhotel(Hotel h, int id) {
     try {
            PreparedStatement ps = connexion.prepareStatement("update hotel set nombre_chambre=?, nombre_etoil=?, nom=?  where id_hotel= ? ");
            ps.setInt(1, h.getNombre_chambre());
            ps.setInt(2, h.getNombre_etoil());
            ps.setString(3, h.getNom()); 
            ps.setInt(4,id);
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
   
    }

     @Override
    public void supprimerHotel(Hotel u, int id) {
       try {
            PreparedStatement ps = connexion.prepareStatement("delete from hotel where id_hotel=?");
            ps.setInt(1,id);
            ps.executeUpdate();
         
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Hotel> afficherHotel() {
        List<Hotel> hotels = new ArrayList<>();
        try {
            String req = "select * from hotel";
            PreparedStatement ps = connexion.prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                   Hotel hotel = new Hotel(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5));
                   hotels.add(hotel);
            }
            
                    
        }
        catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    

        
        return hotels;
        
    }

   
    
    }


  
    

   

  


    
    
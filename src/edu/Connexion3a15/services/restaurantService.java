/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Connexion3a15.services;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.Connexion3a15.tools.MyConnection;
import edu.Connextion3a15.entities.restaurant;
import IServices.IrestaurantService;


/**
 *
 * @author MR
 */
public class restaurantService implements IrestaurantService  {
     Connection connexion;
     Statement stm;

    public restaurantService() {
         connexion = MyConnection.getInstance().getCnx();
    }

    /**
     *
     * @param h
     * @throws SQLException
     */
    @Override
    public void ajouterRestaurant(restaurant h) {
            
       try {  
            String req_ajout = "insert into restaurant(id_restaurant,nombre_etoil,adresse ,nom,image) values (?,?,?,?,'aaa')";
            PreparedStatement ps = connexion.prepareStatement(req_ajout);
            ps.setInt(1, h.getId_restaurant());
            ps.setInt(2, h.getNombre_etoil());
             ps.setString(3, h.getAdresse());
              ps.setString(4, h.getNom());
          
           
            ps.executeUpdate();   
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
    }

     @Override
    public void modifierRestaurant(restaurant r, int id) {
     try {
            PreparedStatement ps = connexion.prepareStatement("update restaurant set  nombre_etoil=?, adresse=?, nom=?  where id_restaurant= ? ");
            ps.setInt(1, r.getNombre_etoil());
            ps.setString(2, r.getAdresse());
            ps.setString(3, r.getNom()); 
            ps.setInt(4,id);
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
   
    }

     @Override
    public void supprimerRestaurant(restaurant u, int id) {
       try {
            PreparedStatement ps = connexion.prepareStatement("delete from restaurant where id_restaurant=?");
            ps.setInt(1,id);
            ps.executeUpdate();
         
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<restaurant> afficherRestaurant() {
        List<restaurant> restaurants = new ArrayList<>();
        try {
            String req = "select * from restaurant";
            PreparedStatement ps = connexion.prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                   restaurant restaurant = new restaurant(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4));
                   restaurants.add(restaurant);
            }
            
                    
        }
        catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    

        
        return restaurants;
        
    }

   

   
    
    }


  
    

   

  


    
    
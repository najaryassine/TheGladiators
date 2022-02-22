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
import edu.Connextion3a15.entities.menu;
import IServices.ImenuService;


/**
 *
 * @author MR
 */
public class menuService implements ImenuService  {
     Connection connexion;
     Statement stm;

    public menuService() {
         connexion = MyConnection.getInstance().getCnx();
    }

    /**
     *
     * @param h
     * @throws SQLException
     */
  

     @Override
    public void modifierMenu(menu me, int id) {
     try {
            PreparedStatement ps = connexion.prepareStatement("update menu set nom= ?,prix= ?,id_restaurant= ?  where numero_repa= ? ");
            ps.setString(1, me.getNom());
            ps.setFloat(2, me.getPrix());
           
            ps.setInt(3,me.getId_restaurant());
             ps.setInt(4,id);
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
   
    }

     @Override
    public void supprimerMenu(menu me, int id) {
       try {
            PreparedStatement ps = connexion.prepareStatement("delete from menu where numero_repa=?");
            ps.setInt(1,id);
            ps.executeUpdate();
         
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<menu> afficherMenu() {
        List<menu> menus = new ArrayList<>();
        try {
            String req = "select * from menu";
            PreparedStatement ps = connexion.prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                   menu menu = new menu(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4));
                   menus.add(menu);
            }
            
                    
        }
        catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    

        
        return menus;
        
    }

     @Override
    public void ajouterMenu(menu me) {
    

   try {  
            String req_ajout = "insert into menu(numero_repa,nom,prix,id_restaurant,image) values (?,?,?,?,'aaa')";
            PreparedStatement ps = connexion.prepareStatement(req_ajout);
            ps.setInt(1, me.getNumero_repa());
             ps.setString(2,me.getNom());
            ps.setFloat(3, me.getPrix());
             
              ps.setInt(4, me.getId_restaurant());
          
           
            ps.executeUpdate();   
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

  


   
    
    }


  
    

   

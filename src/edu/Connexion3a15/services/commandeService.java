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
import edu.Connextion3a15.entities.commande;
import IServices.IcommandeService;


/**
 *
 * @author MR
 */
public class commandeService implements IcommandeService  {
     Connection connexion;
     Statement stm;

    public commandeService() {
         connexion = MyConnection.getInstance().getCnx();
    }

    /**
     *
     * @param h
     * @throws SQLException
     */
    @Override
    public void ajouterCommande(commande c) {
            
       try {  
            String req_ajout = "insert into commande(id_commande,date_commande,idc) values (?,?,?)";
            PreparedStatement ps = connexion.prepareStatement(req_ajout);
            ps.setInt(1, c.getId_commande());
             ps.setString(2, c.getDate_commande());
            
             ps.setInt(3, c.getIdc());
         
          
           
            ps.executeUpdate();   
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
    }

     @Override
    public void modifierCommande(commande c, int id) {
     try {
            PreparedStatement ps = connexion.prepareStatement("update commande set date_commande=? ,idc=? where id_commande= ?");
            
             ps.setString(1, c.getDate_commande());
            
             ps.setInt(2, c.getIdc());
         
            ps.setInt(3,id);
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
   
    }

     @Override
    public void supprimerCommande(commande c, int id) {
       try {
            PreparedStatement ps = connexion.prepareStatement("delete from commande where id_commande=?");
            ps.setInt(1,id);
            ps.executeUpdate();
         
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }

    public List<commande> afficherCommande() {
        List<commande> commandes = new ArrayList<>();
        try {
            String req = "select * from commande";
            PreparedStatement ps = connexion.prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                  commande commande = new commande(rs.getInt(1),rs.getString(2),rs.getInt(3));
                   commandes.add(commande);
            }
            
                    
        }
        catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    

        
        return commandes;
        
    }
}



  
    

   

  


    
    
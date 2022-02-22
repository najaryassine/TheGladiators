/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Connexion3a15.services;



import IServices.IchambreService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.Connexion3a15.tools.MyConnection;
import edu.Connextion3a15.entities.Chambre;


/**
 *
 * @author MR
 */
public class ChambreService implements IchambreService  {
     Connection connexion;
     Statement stm;

    public ChambreService() {
         connexion = MyConnection.getInstance().getCnx();
    }

    /**
     *
     * @param h
     * @throws SQLException
     */
  

     @Override
    public void modifierChambre(Chambre ch, int id) {
     try {
            PreparedStatement ps = connexion.prepareStatement("update chambre set nombre_lits= ?,prix= ?,etage= ?,id_hotel= ?  where numero= ? ");
            ps.setInt(1, ch.getNombre_lits());
            ps.setFloat(2, ch.getPrix());
            ps.setInt(3, ch.getEtage()); 
            ps.setInt(4,ch.getId_hotel());
             ps.setInt(5,id);
            ps.executeUpdate();
        } catch (SQLException ex) {
        }
   
    }

     @Override
    public void supprimerChambre(Chambre ch, int id) {
       try {
            PreparedStatement ps = connexion.prepareStatement("delete from hotel where id_hotel=?");
            ps.setInt(1,id);
            ps.executeUpdate();
         
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Chambre> afficherChambre() {
        List<Chambre> chambres = new ArrayList<>();
        try {
            String req = "select * from chambre";
            PreparedStatement ps = connexion.prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                   Chambre chambre = new Chambre(rs.getInt(1),rs.getInt(2),rs.getFloat(3),rs.getInt(4),rs.getInt(5));
                   chambres.add(chambre);
            }
            
                    
        }
        catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    

        
        return chambres;
        
    }

     @Override
    public void ajouterChambre(Chambre ch) {
    

   try {  
            String req_ajout = "insert into chambre(numero,nombre_lits,prix,etage,id_hotel,image) values (?,?,?,?,?,'aaa')";
            PreparedStatement ps = connexion.prepareStatement(req_ajout);
            ps.setInt(1, ch.getNumero());
             ps.setInt(2, ch.getNombre_lits());
            ps.setFloat(3, ch.getPrix());
             ps.setInt(4, ch.getEtage());
              ps.setInt(5, ch.getId_hotel());
          
           
            ps.executeUpdate();   
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

  


   
    
    }


  
    

   

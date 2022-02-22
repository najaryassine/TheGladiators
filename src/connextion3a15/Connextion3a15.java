/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connextion3a15;

import edu.Connexion3a15.services.menuService;
import edu.Connexion3a15.services.restaurantService;
import edu.Connexion3a15.services.commandeService;
import edu.Connextion3a15.entities.menu;
import edu.Connextion3a15.entities.restaurant;
import edu.Connextion3a15.entities.commande;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author yassi
 */
public class Connextion3a15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
               
       // restaurant r = new restaurant(4,9,"gabeess","said"); 
        //restaurantService ra = new restaurantService();       
         //ra.ajouterRestaurant(r);
       //  ra.modifierRestaurant(r, 4);
         //ra.supprimerRestaurant(r, 4);
      //System.out.println( ra.afficherRestaurant());
      
      //menu m = new menu(1,"mlewi",10,4); 
        //menuService ma = new menuService();
       // ma.ajouterMenu(m);
      // System.out.println( ma.afficherMenu());
     //  ma.modifierMenu(m, 3);
      //ma.supprimerMenu(m, 1);
      
      commande c = new commande(2,"02/02/2021",9); 
        commandeService ca = new commandeService();
        //ca.ajouterCommande(c);
        ca.modifierCommande(c, 2);
      // ca.supprimerCommande(c, 1);      
       //System.out.println( ca.afficherCommande());
      
   
    }
    
}

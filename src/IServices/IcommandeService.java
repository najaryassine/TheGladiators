package IServices;

import edu.Connextion3a15.entities.restaurant;
import edu.Connextion3a15.entities.commande;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mazen
 */
public interface IcommandeService {
    public void ajouterCommande(commande r);
     public void modifierCommande(commande r, int id);
     public void supprimerCommande(commande r, int id);
      public List<commande> afficherCommande();
    
}

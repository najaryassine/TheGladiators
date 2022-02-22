/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IServices;

import edu.Connextion3a15.entities.restaurant;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author oussama
 */
public interface IrestaurantService {
     public void ajouterRestaurant(restaurant h)throws SQLException;
     public void modifierRestaurant(restaurant h, int id);
 public void supprimerRestaurant(restaurant u, int id);
  public List<restaurant> afficherRestaurant();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IServices;

import edu.Connextion3a15.entities.Hotel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author mazen
 */
public interface IhotelService {
     public void ajouterHotel(Hotel h)throws SQLException;
     public void modifierhotel(Hotel h, int id);
 public void supprimerHotel(Hotel u, int id);
  public List<Hotel> afficherHotel();
}

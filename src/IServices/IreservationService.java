package IServices;

import edu.Connextion3a15.entities.Hotel;
import edu.Connextion3a15.entities.Reservation;
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
public interface IreservationService {
    public void ajouterReservation(Reservation r);
     public void modifierreservation(Reservation r, int id);
     public void supprimerreservation(Reservation r, int id);
      public List<Reservation> afficherreservation();
    
}

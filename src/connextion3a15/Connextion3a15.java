/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connextion3a15;

import edu.Connexion3a15.services.ChambreService;
import edu.Connexion3a15.services.HotelService;
import edu.Connexion3a15.services.ReservationService;
import edu.Connextion3a15.entities.Chambre;
import edu.Connextion3a15.entities.Hotel;
import edu.Connextion3a15.entities.Reservation;
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
       //  Hotel h1 = new Hotel(1,5,35,"chebba","mazen");
    //HotelService hs = new HotelService();
  //  hs.ajouterHotel(h1);
   // hs.modifierhotel(h1,1);
        //System.out.println( hs.afficherHotel()); 
       // Chambre ch1 = new Chambre(2,2,2.5f,3,2);
        //ChambreService ha = new ChambreService();
        //ha.ajouterChambre(ch1);
               
         //Reservation r = new Reservation(5,"02/02/",3,8);
        ReservationService ra = new ReservationService();
        Reservation r = new Reservation(9,855,8,"mazen");
     ra.ajouterReservation(r);
         System.out.println(ra.countReservation());
          System.out.println(ra.afficherreservation());

   
    }
    
}

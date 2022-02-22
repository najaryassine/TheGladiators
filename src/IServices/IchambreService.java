/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IServices;

import edu.Connextion3a15.entities.Chambre;
import edu.Connextion3a15.entities.Hotel;
import java.util.List;

/**
 *
 * @author mazen
 */
public interface IchambreService {
    public void ajouterChambre(Chambre ch);
    public void modifierChambre(Chambre ch, int id) ;
    public void supprimerChambre(Chambre ch, int id) ;
     public List<Chambre> afficherChambre();
    
}

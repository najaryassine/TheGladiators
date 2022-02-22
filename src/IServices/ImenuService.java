/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IServices;

import edu.Connextion3a15.entities.menu;
import edu.Connextion3a15.entities.restaurant;
import java.util.List;

/**
 *
 * @author mazen
 */
public interface ImenuService {
    public void ajouterMenu(menu ch);
    public void modifierMenu(menu ch, int id);
    public void supprimerMenu(menu ch, int id);
     public List<menu> afficherMenu();
    
}

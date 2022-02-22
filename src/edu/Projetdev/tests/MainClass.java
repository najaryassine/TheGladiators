/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.Projetdev.tests;
import edu.Projetdev.entities.Client;
import edu.Projetdev.entities.ReservationVoyage;
import edu.Projetdev.entities.Voyage;
import edu.Projetdev.services.ClientCRUD;
import edu.Projetdev.services.ReservationVoyageCRUD;
import edu.Projetdev.services.VoyageCRUD;
import java.util.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class MainClass
{

    public MainClass() throws Exception
    {
    String dateString = "2001/03/09";

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
    Date convertedDate = (Date) dateFormat.parse(dateString);
    System.out.println("Converted string to date : " + convertedDate);
    }

    public static void main(String[] argv) throws Exception
    {
    
    String sDate1="2002/02/02";  
    String sDate2="2002/02/05"; 
    Date date1=(Date) new SimpleDateFormat("yyyy/mm/dd").parse(sDate1);
    Date date2=(Date) new SimpleDateFormat("yyyy/mm/dd").parse(sDate2);
    
    
    String sDate3="2022/06/08";  
    String sDate4="2023/12/23"; 
    Date date3=(Date) new SimpleDateFormat("yyyy/mm/dd").parse(sDate3);
    Date date4=(Date) new SimpleDateFormat("yyyy/mm/dd").parse(sDate4);
    
    
    
    
    /*
    Calendar cal1 = Calendar.getInstance();
    cal1.set(Calendar.HOUR_OF_DAY,17);
    cal1.set(Calendar.MINUTE,30);
    cal1.set(Calendar.SECOND,0);
    cal1.set(Calendar.MILLISECOND,0);
    Time d1 = (Time) cal1.getTime();
    
    Calendar cal2 = Calendar.getInstance();
    cal2.set(Calendar.HOUR_OF_DAY,8);
    cal2.set(Calendar.MINUTE,25);
    cal2.set(Calendar.SECOND,30);
    cal2.set(Calendar.MILLISECOND,10);
    Time d2 = (Time) cal2.getTime();

*/
    
    
    ClientCRUD ccd = new ClientCRUD();
    Client c1 = new Client(1,"aa","bb","erf","dsd");
    Client c2 = new Client(1,"ahmed","ali","sgg","tunis");
    //ccd.ajouterClient(c2);
    //System.out.println(ccd.liste_clients());
     
    VoyageCRUD vcd = new VoyageCRUD();
        Voyage v = new Voyage(1,"Tunisair",sDate1,sDate2,"Tunis","Paris");
        Voyage v1 = new Voyage(2,"Nouvelair",sDate1,sDate2,"Monastir","Berlin");
        Voyage v2 = new Voyage(3,"Qatar Airways",sDate3,sDate4,"Djerba","Dubai");
        Voyage v3 = new Voyage(3,"gedgfg",sDate3,sDate4,"aaaa","bbbbb");
        Voyage v4 = new Voyage(3,"kkkkkkk",sDate3,sDate4,"kkkk","kkkkk");
      
        //vcd.ajouterVoyage(v4);
        //vcd.modifierVoyage(v3,5);
        //vcd.supprimerVoyage(6);
        //System.out.println(vcd.liste_voyages());
        
    ReservationVoyageCRUD rvcd = new ReservationVoyageCRUD();
        ReservationVoyage rv1 = new ReservationVoyage(1, 2, 10);
        ReservationVoyage rv2 = new ReservationVoyage(2, 4, 12);
        ReservationVoyage rv3 = new ReservationVoyage(3, 2, 12);
        
        //rvcd.ajouterReservationVoyage(rv3);
        //rvcd.modifierReservationVoyage(rv3, 7);
        //rvcd.supprimerReservationVoyage(4);
        System.out.println(rvcd.liste_reservation_voyages());
    
   
        System.out.println(rvcd.liste_jointure_reservation_voyages());
       
    
        
        
        
        
    }

    
   

}



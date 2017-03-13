
/**
 * 
 * @author (Andreas Wagner) 
 * @version (2013)
 */

import java.util.*;
public class View_Model implements Beobachter
{
    
    /** gibt auf der Konsole aus, wer das Model beobachtet */
    public void update(Model model) {
        
        ArrayList<Beobachter> beobachter = model.getBeobachter();
        
        System.out.println(beobachter.size() + " Beobachter ------------------------------");
        for (int i = 0; i < beobachter.size();  i++) {
            System.out.println(beobachter.get(i).getClass().getName());
        }
        System.out.println("-------------------------------------------");
        
        
    }

}

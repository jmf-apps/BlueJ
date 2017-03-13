
/**
 * 
 * @author (Andreas Wagner) 
 * @version (2013)
 */
public class View_Console implements Beobachter
{
    /** gibt auf der Konsole aus, ob die Lampe an oder aus ist */
    public void update(Model model) {
        
        if (model.getZustand() == 1) {
            System.out.println("Lampe ist an");
        } else {
            System.out.println("Lampe ist aus");
        }
    }
}

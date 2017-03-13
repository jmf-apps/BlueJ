
/**
 * Write a description of class Control here.
 * 
 * @author (Andreas Wagner) 
 * @version (2013)
 */
public class Control
{
    private Model model;
    
    public Control(Model model) {
        this.model = model;
    }
    
    public void schalteZustand() {
        
        if (model.getZustand() == 1) {
            model.setZustand(0);
        } else {
            model.setZustand(1);
        }
    }
}

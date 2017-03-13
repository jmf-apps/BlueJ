/**
 * 
 * View mit Swing-Graphik.
 * 
 * @author (Andreas Wagner) 
 * @version (2013)
 */
import javax.swing.*;
import java.awt.*;

public class View_Graphik1 extends JFrame implements Beobachter
{
    
    private Model model; 

    /** erzeugt ein Graphikfenster */
    public View_Graphik1() {
        super("Graphik1");
        setBounds(100, 100, 300, 300);
        setVisible(true);
    }
    
    /** überschreibt die paint-Methode der JFrame-Klasse, um einen Kreis (gelb = Lampe leuchtet) 
     * auszugeben.
     */
    public void paint(Graphics g) {
        super.paint(g);
        
        if ((model != null) && (model.getZustand() == 1)) {
            g.setColor(Color.yellow);
        } else {
            g.setColor(Color.gray);
        }
        g.fillOval(50, 50, 40, 40);
    }
    
    /** speichert die Referenz auf das aktuelle Model und fordert das Neuzeichnen des Fensters an*/
    public void update(Model model) {
        this.model = model;
        repaint();
    }
}

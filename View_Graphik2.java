
/**
 * Write a description of class View_Graphik2 here.
 * 
 * @author (Andreas Wagner) 
 * @version (2013)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View_Graphik2 extends JFrame implements Beobachter
{
    
    private Model model; 
    private Control controller;
    
    private JButton schalter;

    public View_Graphik2(Control controller) {
        super("Graphik2");
        
        this.controller = controller;
        
        schalter = new JButton("Einschalten");
        schalter.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onButtonClick();
                }
            }
        );
        getContentPane().add(schalter, java.awt.BorderLayout.SOUTH);
        setBounds(100, 400, 300, 300);
        setVisible(true);
    }
    
    public void onButtonClick() {
        controller.schalteZustand();
        //Warum nicht: model.setZustand() ?
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        if ((model != null) && (model.getZustand() == 1)) {
            g.setColor(Color.yellow);
            schalter.setText("Ausschalten");
        } else {
            g.setColor(Color.gray);
            schalter.setText("Einschalten");
        }
        g.fillOval(50, 50, 40, 40);
    }
    

    public void update(Model model) {
        this.model = model;
        repaint();
    }
}


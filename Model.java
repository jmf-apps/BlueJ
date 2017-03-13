/**
 * @author (Andreas Wagner) 
 * @version (2013)
 */
import java.util.*;

public class Model
{
    //Daten, die das Model hält
    private int zustand = 0;
    
    //Beobachter (Views), die das Model hält
    private ArrayList<Beobachter> beobachter;
    
    /** erzeugt ein Objekt der Klasse Model */
    public Model() {
        zustand = 0;
        beobachter = new ArrayList<Beobachter>();
    }
    
    /** setzt den Zustand des Models neu und benachrichtigt anschließend alle Beobachter 
     * über die Zustandsänderung.
     */ 
    public void setZustand(int neuerZustand) {
        zustand = neuerZustand;
        BeobachterBenachrichtigen();
    }
    
    /** gibt den aktuellen Zustand zurück */
    public int getZustand() {
        return zustand;
    }
    
    /** ruft von allen Beobachtern die Methode update() auf. Die Existenz dieser Methode ist 
     * durch die Schnittstelle garantiert.
     */
    public void BeobachterBenachrichtigen() {
        
        for (int i = 0; i < beobachter.size(); i++) {
            beobachter.get(i).update(this);
        }
    }
    
    /** fügt einen Beobachter hinzu */
    public void BeobachterHinzufuegen(Beobachter b) {
         beobachter.add(b);
    }
    
    /** entfernt einen Beobachter */
     public void BeobachterEntfernen(Beobachter b) {
         beobachter.remove(b);
    }
    
    /** gibt die Liste der Beobachter zurück */
    public ArrayList<Beobachter> getBeobachter() {
        return beobachter;
    }
}

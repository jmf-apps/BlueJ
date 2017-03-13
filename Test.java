/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Test {

    public static void main(String[] args) {

        Model m = new Model();
        View_Console v1 = new View_Console();

        Control c = new Control(m);

        View_Graphik2 v2 = new View_Graphik2(c);

        m.BeobachterHinzufuegen(v1);
        m.BeobachterHinzufuegen(v2);


    }


}

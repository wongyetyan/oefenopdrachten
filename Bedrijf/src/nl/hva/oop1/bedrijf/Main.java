package nl.hva.oop1.bedrijf;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import nl.hva.oop1.bedrijf.models.Bedrijf;
import nl.hva.oop1.bedrijf.models.Persoon;
import nl.hva.oop1.bedrijf.models.Werknemer;

import javafx.scene.image.Image;

/**
 * Main test het klassendiagram van de opgave.
 * 
 * @author Dennis Breuker (d.m.breuker@hva.nl)
 * @version 1.0
 */
public class Main {

    /**
     * @STUDENT: DAVID WONG
     * In deze opdracht ga je een bedrijf met werknemers, vrijwilligers en zzp’ers simuleren. Een bedrijf kan
personen als medewerker in dienst nemen. Aan het bedrijf kan worden gevraagd hoeveel managers het
heeft. Ook kan het bedrijf de inkomsten van alle medewerkers printen. De inkomsten van een medewerker
is afhankelijk van het soort medewerker
     */
    public static void main(String[] args) {
         Bedrijf bedrijf = new Bedrijf("HvA"); //CLEAR.
         //System.out.println(bedrijf.toString());
         
        Werknemer w = new Werknemer(1200, "Jantine Jansen");
//        
        bedrijf.neemInDienst(w);
//
//        w = new Werknemer(1300, "Piet Pietersen");
//        bedrijf.neemInDienst(w);
//
//        Vrijwilliger v = new Vrijwilliger("Guus Goedhart");
//        bedrijf.neemInDienst(v);
//        v.huurIn(10);
//        
//        Manager m = new Manager(10000, "Brigitte Baas");
//        bedrijf.neemInDienst(m);
//        m.kenBonusToe(750);
//        
//        m = new Manager(10000, "Dirk Teur");
//        bedrijf.neemInDienst(m);
//        m.kenBonusToe(1200);
//        
//        Zzper z = new Zzper(120, "Beun Haas");
//        bedrijf.neemInDienst(z);
//        z.huurIn(40);
//
        System.out.println(bedrijf);
        bedrijf.printInkomsten();
//        System.out.println("\nAantal in management: " + bedrijf.aantalManagers());
    } 
}

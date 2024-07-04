/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beadando;

import beadando.business.Toll;
import beadando.business.TollTipusEnum;
import beadando.layout.TollLayout;
import java.awt.Color;
import org.json.JSONException;

/**
 *
 * @author zsenakistvan
 */
public class Beadando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException {
        // TODO code application logic here
        Toll t = new Toll(100, true, TollTipusEnum.MADÁRTOLL, Color.BLUE, "Hugo Boss");
        TollLayout tl = new TollLayout(t.getSzin());
        tl.marka = t.getMarka();
        tl.tipus = t.getTipus().name();
        tl.toltottseg = t.getToltottseg();
        
        System.out.println(tl.getSzinkodok());
        System.out.println("Töltöttség: " + tl.toltottseg);
        t.hasznal("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        tl.toltottseg = t.getToltottseg();
        System.out.println("Töltöttség: " + tl.toltottseg);
        
        t.mentes();
        
        //Ceruza c = new Ceruza("HB", 58, Color.GRAY, "Alma");
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beadando.business.os;

import beadando.business.GetterFunctionName;
import java.awt.Color;

/**
 *
 * @author zsenakistvan
 */
public abstract class Iroeszkoz {
    public static final String fajlnev = "mentes.xml";
    
    @GetterFunctionName(name = "getSzin")
    private Color szin;
    @GetterFunctionName(name = "getMarka")
    private String marka;

    public Iroeszkoz() {
    }

    public Iroeszkoz(Color szin, String marka) {
        this.szin = szin;
        this.marka = marka;
    }

    public Color getSzin() {
        return szin;
    }

    public String getMarka() {
        return marka;
    }
    
    
    
}

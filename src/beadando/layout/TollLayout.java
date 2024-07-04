/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beadando.layout;

import java.awt.Color;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author zsenakistvan
 */
public class TollLayout {
    
    public String marka;
    public Integer toltottseg;
    public String tipus;
    public Boolean hasznalhato;
    private JSONObject szinkodok;

    public TollLayout(Color szin) throws JSONException {
        this.szinkodok = new JSONObject();
        this.szinkodok.put("red", szin.getRed());
        this.szinkodok.put("green", szin.getGreen());
        this.szinkodok.put("blue", szin.getBlue());
    }
    
    public String getSzinkodok(){
        return this.szinkodok.toString();
    }
           
    
    
}

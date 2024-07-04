/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beadando.business;

import beadando.business.os.Iroeszkoz;
import beadando.fio.Fio;
import java.awt.Color;

/**
 *
 * @author zsenakistvan
 */
public class Ceruza extends Iroeszkoz{
    @GetterFunctionName(name = "getKemenyseg")
    private String kemenyseg;
    @GetterFunctionName(name = "getHossz")
    private Integer hossz;

    public Ceruza(String kemenyseg, Integer hossz, Color szin, String marka) {
        super(szin, marka);
        this.kemenyseg = kemenyseg;
        this.hossz = hossz;
    }

    public String getKemenyseg() {
        return kemenyseg;
    }

    public Integer getHossz() {
        return hossz;
    }
    
    public void mentes(){
        Fio<Ceruza> f = new Fio<Ceruza>();
        f.mentes(this);
    }
    
    
    
    
    
}

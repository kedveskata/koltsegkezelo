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
public class Toll extends Iroeszkoz{
    
    private static final Integer karakterszam = 40;
    
    @GetterFunctionName(name = "getToltottseg")
    private Integer toltottseg;
    @GetterFunctionName(name = "isHasznalhato")
    private Boolean hasznalhato;
    @GetterFunctionName(name = "getTipus")
    private TollTipusEnum tipus;

    public Toll(Integer toltottseg, Boolean hasznalhato, TollTipusEnum tipus, Color szin, String marka) {
        super(szin, marka);
        this.toltottseg = toltottseg;
        if(this.toltottseg > 100 || this.toltottseg < 0){
            this.toltottseg = 100;
        }
        this.hasznalhato = hasznalhato;
        this.tipus = tipus;
        if(this.tipus.equals(TollTipusEnum.MADÁRTOLL)){
            this.hasznalhato = Boolean.TRUE;
        }
    }

    public Integer getToltottseg() {
        return this.toltottseg;
    }

    public Boolean isHasznalhato() {
        return this.hasznalhato;
    }

    public TollTipusEnum getTipus() {
        return this.tipus;
    }
    
    public void bekapcsol(){
        this.hasznalhato = Boolean.TRUE;
    }
    
    public void kikapcsol(){
        if(!this.tipus.equals(TollTipusEnum.MADÁRTOLL)){
            this.hasznalhato = Boolean.FALSE;
        }
    }
    
    public void tolt(){
        if(!this.tipus.equals(TollTipusEnum.GOLYÓSTOLL)){
            this.toltottseg = 100;
        }
    }
    
    public void hasznal(String szoveg){
        Integer egyseg = szoveg.length() / Toll.karakterszam;
        Integer tintahasznalat = egyseg * this.tipus.getTintaFelhasznalas();
        this.toltottseg -= tintahasznalat;
        System.out.println(szoveg);
    }
    
    public void mentes(){
        Fio<Toll> f = new Fio<Toll>();
        f.mentes(this);
    }
    
    
    
    
            
            
            
    
}

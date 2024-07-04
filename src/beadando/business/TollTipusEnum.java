/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beadando.business;

/**
 *
 * @author zsenakistvan
 */
public enum TollTipusEnum {
    GOLYÓSTOLL(1), TÖLTŐTOLL(3), MADÁRTOLL(5);
    
    private final Integer tintaFelhasznalas;

    private TollTipusEnum(Integer tintaFelhasznalas) {
        this.tintaFelhasznalas = tintaFelhasznalas;
    }
    
    public Integer getTintaFelhasznalas(){
        return this.tintaFelhasznalas;
    }
    
}

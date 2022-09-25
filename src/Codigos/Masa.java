/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

/**
 *
 * @author Frank
 */
public class Masa {
    private double gramo;
    private double kilogramo;
    private double libra;       
    private double tonelada;
    private double gkg;
    private double glib;       
    private double gtn;
    private double kgg;       
    private double kglb;       
    private double kgtn;       
    private double lbg;       
    private double lbkg;       
    private double lbtn;
    private double tng;       
    private double tnkg;       
    private double tnlb;

    

    public Masa() {
        gramo = 0;
        kilogramo = 0;
        libra = 0;
        tonelada = 0;
        gkg = 0;
        glib = 0;
        gtn = 0;
        kgg = 0;
        kglb = 0;
        kgtn = 0;
        lbg = 0;
        lbkg = 0;
        lbtn = 0;
        tng = 0;
        tnkg = 0;
        tnlb = 0;
    }
    
     public void setGramo(double gr) {
        gramo = gr;
    }

    public void setKilogramo(double kg) {
        kilogramo = kg;
    }

    public void setLibra(double lb) {
        libra = lb;
    }

    public void setTonelada(double tn) {
        tonelada = tn;
    }
            
    public void cgramo(){
        gkg = gramo/1000;
        glib = gramo/453.59;
        gtn = gramo/(1000*1000);
    }        
            
    public void ckilogramo(){
        kgg = kilogramo*1000;
        kglb = kilogramo/0.4546;
        kgtn = kilogramo/1000;
    }       
            
    public void clibra(){
        lbg = libra*453.59;
        lbkg = libra*0.4546;
        lbtn = (libra*0.4546)/1000;
    }
    
     public void ctonelada(){
        tng = tonelada*1000*1000;
        tnkg = tonelada*1000;
        tnlb = tonelada*2204.62262;
    }       
    
public double getGramo() {
        return gramo;
    }

    public double getKilogramo() {
        return kilogramo;
    }

    public double getLibra() {
        return libra;
    }

    public double getTonelada() {
        return tonelada;
    }

    public double getGkg() {
        return gkg;
    }

    public double getGlib() {
        return glib;
    }

    public double getGtn() {
        return gtn;
    }

    public double getKgg() {
        return kgg;
    }

    public double getKglb() {
        return kglb;
    }

    public double getKgtn() {
        return kgtn;
    }

    public double getLbg() {
        return lbg;
    }

    public double getLbkg() {
        return lbkg;
    }

    public double getLbtn() {
        return lbtn;
    }

    public double getTng() {
        return tng;
    }

    public double getTnkg() {
        return tnkg;
    }

    public double getTnlb() {
        return tnlb;
    }    
    
}

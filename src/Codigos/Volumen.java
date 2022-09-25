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
public class Volumen {
    private double centimetro;
    private double metro;       
    private double pie;
    private double pulgada;        
    private double litro;
    private double galon;
    private double cmm;
    private double cmft;
    private double cmin;
    private double cmlt;
    private double cmg;
    private double mcm;
    private double mft;
    private double min;
    private double mlt;
    private double mg;
    private double ftcm;
    private double ftm;
    private double ftin;
    private double ftlt;
    private double ftg;
    private double incm;
    private double inm;
    private double inft;
    private double inlt;
    private double ing;
    private double ltcm;
    private double ltm;
    private double ltft;
    private double ltin;
    private double ltg;
    private double gcm;
    private double gm;
    private double gft;
    private double gin;
    private double glt;

    

    public Volumen() {
        centimetro = 0;
        metro = 0;
        pie = 0;
        pulgada = 0;
        litro = 0;
        galon = 0;
        cmm = 0;
        cmft = 0;
        cmin = 0;
        cmlt = 0;
        cmg = 0;
        mcm = 0;
        mft = 0;
        min = 0;
        mlt = 0;
        mg = 0;
        ftcm = 0;
        ftm = 0;
        ftin = 0;
        ftlt = 0;
        ftg = 0;
        incm = 0;
        inm = 0;
        inft = 0;
        inlt = 0;
        ing = 0;
        ltcm = 0;
        ltm = 0;
        ltft = 0;
        ltin = 0;
        ltg = 0;
        gcm = 0;
        gm = 0;
        gft = 0;
        gin = 0;
        glt = 0;
    }
    
    public void setCentimetro(double cm) {
        centimetro = cm;
    }

    public void setMetro(double m) {
        metro = m;
    }

    public void setPie(double ft) {
        pie = ft;
    }

    public void setPulgada(double in) {
        pulgada = in;
    }

    public void setLitro(double lt) {
        litro = lt;
    }

    public void setGalon(double g) {
        galon = g;
    }

    public void ccm(){
        cmm = centimetro/1000000;
        cmft = centimetro/28316.8466;
        cmin = centimetro* 0.061024;
        cmlt = centimetro/1000;
        cmg = centimetro/3785.41;
    }
    
    public void cm(){
    mcm = metro*1000000;
    mft = metro*35.3;
    min = metro*61023.74;
    mlt = metro*1000;
    mg = metro*264.17;
    }
    
    public void cft(){
    ftcm = pie*28316.84;
    ftm = pie*0.0283;
    ftin = pie*1728;
    ftlt = pie*28.3;
    ftg = pie*7.48;
    }
    
    public void cin(){
    incm = pulgada*16.4;
    inm = pulgada/61000;
    inft = pulgada/1728;
    inlt = pulgada/61.02;
    ing = pulgada/231;
    }
    
    public void clt(){
    ltcm = litro*1000;
    ltm = litro/1000;
    ltft = litro/28.3;
    ltin = litro*61.023;
    ltg = litro/3.785;
    }
    
    public void cg(){
    gcm = galon*3785.41;
    gm = galon*0.0037;
    gft = galon*0.134;
    gin = galon*231;
    glt = galon*3.785;
    }
    
    public double getGalon() {
        return galon;
    }
    public double getLitro() {
        return litro;
    }        
    public double getPulgada() {
        return pulgada;
    }        
    public double getPie() {
        return pie;
    }        
    public double getMetro() {
        return metro;
    }        
    public double getCentimetro() {
        return centimetro;
    }
    public double getCmm() {
        return cmm;
    }

    public double getCmft() {
        return cmft;
    }

    public double getCmin() {
        return cmin;
    }

    public double getCmlt() {
        return cmlt;
    }

    public double getCmg() {
        return cmg;
    }

    public double getMcm() {
        return mcm;
    }

    public double getMft() {
        return mft;
    }

    public double getMin() {
        return min;
    }

    public double getMlt() {
        return mlt;
    }

    public double getMg() {
        return mg;
    }

    public double getFtcm() {
        return ftcm;
    }

    public double getFtm() {
        return ftm;
    }

    public double getFtin() {
        return ftin;
    }

    public double getFtlt() {
        return ftlt;
    }

    public double getFtg() {
        return ftg;
    }

    public double getIncm() {
        return incm;
    }

    public double getInm() {
        return inm;
    }

    public double getInft() {
        return inft;
    }

    public double getInlt() {
        return inlt;
    }

    public double getIng() {
        return ing;
    }

    public double getLtcm() {
        return ltcm;
    }

    public double getLtm() {
        return ltm;
    }

    public double getLtft() {
        return ltft;
    }

    public double getLtin() {
        return ltin;
    }

    public double getLtg() {
        return ltg;
    }

    public double getGcm() {
        return gcm;
    }

    public double getGm() {
        return gm;
    }

    public double getGft() {
        return gft;
    }

    public double getGin() {
        return gin;
    }

    public double getGlt() {
        return glt;
    }
}

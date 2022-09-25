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
public class Longitud {
    private double metro;
    private double kilometro;
    private double centimetro;
    private double pulgada;
    private double pie;
    private double yarda;       
    private double milla;
    private double millaNautica;       
    private double añoLuz;

    private double mkm, mcm, min, mft, myd, mmi, mmina, mal;
    private double kmm, kmcm, kmin, kmft, kmyd, kmmi, kmmina, kmal;        
    private double cmm, cmkm, cmin, cmft, cmyd, cmmi, cmmina, cmal;         
    private double inm, inkm, incm, inft, inyd, inmi, inmina, inal;
    private double ftm, ftkm, ftcm, ftin, ftyd, ftmi, ftmina, ftal;
    private double ydm, ydkm, ydcm, ydin, ydft, ydmi, ydmina, ydal;
    private double mim, mikm, micm, miin, mift, miyd, mimina, mial;        
    private double mnm, mnkm, mncm, mnin, mnft, mnyd, mnmi, mnal;
    private double alm, alkm, alcm, alin, alft, alyd, almi, almina; 

    public Longitud() {
        metro = 0;
        kilometro = 0;
        centimetro = 0;
        pulgada = 0;
        pie = 0;
        yarda = 0;
        milla = 0;
        millaNautica = 0;
        añoLuz = 0;
        mkm = 0;
        mcm = 0;
        min = 0;
        mft = 0;
        myd = 0;
        mmi = 0;
        mmina = 0;
        mal = 0;
        kmm = 0;
        kmcm = 0;
        kmin = 0;
        kmft = 0;
        kmyd = 0;
        kmmi = 0;
        kmmina = 0;
        kmal = 0;
        cmm = 0;
        cmkm = 0;
        cmin = 0;
        cmft = 0;
        cmyd = 0;
        cmmi = 0;
        cmmina = 0;
        cmal = 0;
        inm = 0;
        inkm = 0;
        incm = 0;
        inft = 0;
        inyd = 0;
        inmi = 0;
        inmina = 0;
        inal = 0;
        ftm = 0;
        ftkm = 0;
        ftcm = 0;
        ftin = 0;
        ftyd = 0;
        ftmi = 0;
        ftmina = 0;
        ftal = 0;
        ydm = 0;
        ydkm = 0;
        ydcm = 0;
        ydin = 0;
        ydft = 0;
        ydmi = 0;
        ydmina = 0;
        ydal = 0;
        mim = 0;
        mikm = 0;
        micm = 0;
        miin = 0;
        mift = 0;
        miyd = 0;
        mimina = 0;
        mial = 0;
        mnm = 0;
        mnkm = 0;
        mncm = 0;
        mnin = 0;
        mnft = 0;
        mnyd = 0;
        mnmi = 0;
        mnal = 0;
        alm = 0;
        alkm = 0;
        alcm = 0;
        alin = 0;
        alft = 0;
        alyd = 0;
        almi = 0;
        almina = 0;
    }

    
    
     public void setMetro(double metro) {
        this.metro = metro;
    }

    public void setKilometro(double kilometro) {
        this.kilometro = kilometro;
    }

    public void setCentimetro(double centimetro) {
        this.centimetro = centimetro;
    }

    public void setPulgada(double pulgada) {
        this.pulgada = pulgada;
    }

    public void setPie(double pie) {
        this.pie = pie;
    }

    public void setYarda(double yarda) {
        this.yarda = yarda;
    }

    public void setMilla(double milla) {
        this.milla = milla;
    }

    public void setMillaNautica(double millaNautica) {
        this.millaNautica = millaNautica;
    }

    public void setAñoLuz(double añoLuz) {
        this.añoLuz = añoLuz;
    }
    
    public void cMetro(){
        mkm = metro/1000;
        mcm = metro*100;
        min = metro*39.37;
        mft = metro*3.281;
        myd = metro* 1.0936;
        mmi = metro/1609.34;
        mmina = metro/1852;
        mal = (long) metro*0.00000000000000010570;
    }
    
    public void cKilometro(){
    kmm = kilometro*1000;
    kmcm = kilometro*100000;
    kmin = kilometro*39370.07;
    kmft = kilometro*3280.8399;
    kmyd = kilometro*1093.6133;
    kmmi = kilometro*0.6214;
    kmmina = kilometro/1.852;
    kmal = (long)kilometro*0.00000000000010570;
    }
    
    public void cCentimetro(){
    cmm = centimetro/100;
    cmkm = centimetro/100000;
    cmin = centimetro/2.5;
    cmft = centimetro/30.48;
    cmyd = centimetro/91.44;
    cmmi = centimetro/160934.4;
    cmmina = centimetro/185200;
    cmal = (long)centimetro/(100*9461000000000000L);
    }
    
    public void cPulgada(){
    inm = pulgada/39.37;
    inkm = pulgada/39370.07;
    incm = pulgada*2.54;
    inft = pulgada/12;
    inyd = pulgada/36;
    inmi = pulgada/63360;
    inmina = pulgada/72913.38;
    inal = (long)pulgada/(39.37*9461000000000000L);
    }
    
    public void cPie(){
    ftm = pie/0.3048;
    ftkm = pie/3280.8399;
    ftcm = pie/0.032808;
    ftin = pie*12.000;
    ftyd = pie/3;
    ftmi = pie/5280;
    ftmina = pie/6080;
    ftal = pie/(3.281*9461000000000000L);
    }
    
    public void cYarda(){
        ydm = yarda*0.9144;
        ydkm = yarda/1093.61;
        ydcm = yarda*91.44;
        ydin = yarda*36;
        ydft = yarda*3;
        ydmi = yarda/1760;
        ydmina = yarda/2025.37;
        ydal = yarda*0.000000000000000096652;
    }
  
    public void cMilla(){
        mim = milla*1609.34;
        mikm = milla*1.609344;
        micm = milla*160934.4;
        miin = milla*63360;
        mift = milla*5280;
        miyd = milla*1760;
        mimina = milla/1.152;
        mial = (milla*1609.34)/9461000000000000L;
    }
    
    public void cMillaNautica(){
        mnm = millaNautica*1852;
        mnkm = millaNautica*1.852;
        mncm = millaNautica*185200;
        mnin = millaNautica*72913.3858;
        mnft = millaNautica*6076.11549;
        mnyd = millaNautica*2025.37;
        mnmi = millaNautica*1.152;
        mnal = millaNautica*0.000000000017422;
    }
    
    public void cAñoluz(){
        alm = añoLuz/0.00000000000000010570;
        alkm = añoLuz/0.00000000000010570;
        alcm = añoLuz/0.0000000000000000010570;
        alin = añoLuz*372470000000000000L;
        alft = añoLuz * 31039000000000000L;
        alyd = añoLuz * 10346000000000000L;
        almi = añoLuz * 5878600000000L;
        almina =añoLuz*5108385916074.99;
    }
    
    public double getMetro() {
        return metro;
    }

    public double getKilometro() {
        return kilometro;
    }

    public double getCentimetro() {
        return centimetro;
    }

    public double getPulgada() {
        return pulgada;
    }

    public double getPie() {
        return pie;
    }

    public double getYarda() {
        return yarda;
    }

    public double getMilla() {
        return milla;
    }

    public double getMillaNautica() {
        return millaNautica;
    }

    public double getAñoLuz() {
        return añoLuz;
    }

    public double getMkm() {
        return mkm;
    }

    public double getMcm() {
        return mcm;
    }

    public double getMin() {
        return min;
    }

    public double getMft() {
        return mft;
    }

    public double getMyd() {
        return myd;
    }

    public double getMmi() {
        return mmi;
    }

    public double getMmina() {
        return mmina;
    }

    public double getMal() {
        return mal;
    }

    public double getKmm() {
        return kmm;
    }

    public double getKmcm() {
        return kmcm;
    }

    public double getKmin() {
        return kmin;
    }

    public double getKmft() {
        return kmft;
    }

    public double getKmyd() {
        return kmyd;
    }

    public double getKmmi() {
        return kmmi;
    }

    public double getKmmina() {
        return kmmina;
    }

    public double getKmal() {
        return kmal;
    }

    public double getCmm() {
        return cmm;
    }

    public double getCmkm() {
        return cmkm;
    }

    public double getCmin() {
        return cmin;
    }

    public double getCmft() {
        return cmft;
    }

    public double getCmyd() {
        return cmyd;
    }

    public double getCmmi() {
        return cmmi;
    }

    public double getCmmina() {
        return cmmina;
    }

    public double getCmal() {
        return cmal;
    }

    public double getInm() {
        return inm;
    }

    public double getInkm() {
        return inkm;
    }

    public double getIncm() {
        return incm;
    }

    public double getInft() {
        return inft;
    }

    public double getInyd() {
        return inyd;
    }

    public double getInmi() {
        return inmi;
    }

    public double getInmina() {
        return inmina;
    }

    public double getInal() {
        return inal;
    }

    public double getFtm() {
        return ftm;
    }

    public double getFtkm() {
        return ftkm;
    }

    public double getFtcm() {
        return ftcm;
    }

    public double getFtin() {
        return ftin;
    }

    public double getFtyd() {
        return ftyd;
    }

    public double getFtmi() {
        return ftmi;
    }

    public double getFtmina() {
        return ftmina;
    }

    public double getFtal() {
        return ftal;
    }

    public double getYdm() {
        return ydm;
    }

    public double getYdkm() {
        return ydkm;
    }

    public double getYdcm() {
        return ydcm;
    }

    public double getYdin() {
        return ydin;
    }

    public double getYdft() {
        return ydft;
    }

    public double getYdmi() {
        return ydmi;
    }

    public double getYdmina() {
        return ydmina;
    }

    public double getYdal() {
        return ydal;
    }

    public double getMim() {
        return mim;
    }

    public double getMikm() {
        return mikm;
    }

    public double getMicm() {
        return micm;
    }

    public double getMiin() {
        return miin;
    }

    public double getMift() {
        return mift;
    }

    public double getMiyd() {
        return miyd;
    }

    public double getMimina() {
        return mimina;
    }

    public double getMial() {
        return mial;
    }

    public double getMnm() {
        return mnm;
    }

    public double getMnkm() {
        return mnkm;
    }

    public double getMncm() {
        return mncm;
    }

    public double getMnin() {
        return mnin;
    }

    public double getMnft() {
        return mnft;
    }

    public double getMnyd() {
        return mnyd;
    }

    public double getMnmi() {
        return mnmi;
    }

    public double getMnal() {
        return mnal;
    }

    public double getAlm() {
        return alm;
    }

    public double getAlkm() {
        return alkm;
    }

    public double getAlcm() {
        return alcm;
    }

    public double getAlin() {
        return alin;
    }

    public double getAlft() {
        return alft;
    }

    public double getAlyd() {
        return alyd;
    }

    public double getAlmi() {
        return almi;
    }

    public double getAlmina() {
        return almina;
    }
            
}

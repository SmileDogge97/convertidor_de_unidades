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
public class Area {
    private double metro;
    private double hectarea;       
    private double centimetro;       
    private double pulgada;      
    private double pies;       
    private double yarda;       
    private double milla;       
    private double mh;       
    private double mcm;       
    private double min;       
    private double mft;        
    private double myd;        
    private double mmi;        
    private double hm;       
    private double hcm;       
    private double hin;       
    private double hft;        
    private double hyd;        
    private double hmi;   
    private double cmm;       
    private double cmh;       
    private double cmin;       
    private double cmft;        
    private double cmyd;        
    private double cmmi;    
    private double inm;       
    private double inh;       
    private double incm;       
    private double inft;        
    private double inyd;        
    private double inmi;    
    private double ftm;       
    private double fth;       
    private double ftcm;       
    private double ftin;        
    private double ftyd;        
    private double ftmi;   
    private double ydm;       
    private double ydh;       
    private double ydcm;       
    private double ydin;        
    private double ydft;        
    private double ydmi;   
    private double mim;       
    private double mih;       
    private double micm;       
    private double miin;        
    private double mift;        
    private double miyd;       

    
    public Area() {
        metro = 0;
        hectarea = 0;
        centimetro = 0;
        pulgada = 0;
        pies = 0;
        yarda = 0;
        milla = 0;
        mh = 0;
        mcm = 0;
        min = 0;
        mft = 0;
        myd = 0;
        mmi = 0;
        hm = 0;
        hcm = 0;
        hin = 0;
        hft = 0;
        hyd = 0;
        hmi = 0;
        cmm = 0;
        cmh = 0;
        cmin = 0;
        cmft = 0;
        cmyd = 0;
        cmmi = 0;
        inm = 0;
        inh = 0;
        incm = 0;
        inft = 0;
        inyd = 0;
        inmi = 0;
        ftm = 0;
        fth = 0;
        ftcm = 0;
        ftin = 0;
        ftyd = 0;
        ftmi = 0;
        ydm = 0;
        ydh = 0;
        ydcm = 0;
        ydin = 0;
        ydft = 0;
        ydmi = 0;
        mim = 0;
        mih = 0;
        micm = 0;
        miin = 0;
        mift = 0;
        miyd = 0;
    }

    public void setm(double mt){metro=mt;}
    public void seth(double ht){hectarea=ht;}
    public void setcm(double cm){centimetro=cm;}
    public void setin(double in){pulgada=in;}
    public void setft(double ft){pies=ft;}
    public void setyd(double yd){yarda=yd;}
    public void setmi(double mi){milla=mi;}
    
    public void cmt(){
     mh = metro/10000;
     mcm = metro*(10000/1);
     min = metro*((39.37/1)*(39.37/1));
     mft = metro*(10.76/1);
     myd = metro*(1/0.8364);
     mmi = (metro*0.00062137)*(metro*0.00062137);
    }
    
    public void cht(){
    hm = hectarea*(10000/1);
    hcm = hectarea*(10000/1)*(10000/1);
    hin = hectarea*(10000/1)*((39.37/1)*(39.37/1));
    hft = hectarea*107640;
    hyd = hectarea*11960;
    hmi = (hectarea*2.471)/640;
    }
    
    public void ccm(){
    cmm = centimetro/10000;
    cmh = centimetro/100000000;
    cmin = centimetro*(0.155/1);
    cmft = centimetro*(0.00108/1);
    cmyd = centimetro/(10000*0.8361);
    cmmi = centimetro*0.000000000038610;
    }
    
    public void cin(){
    inm = pulgada*((1/39.37)*(1/39.37));
    inh = pulgada/15500031;
    incm = pulgada*(6.452/1);
    inft = pulgada/144;
    inyd = pulgada/1296;
    inmi = pulgada* 0.00000000024910;
    }
    
    public void cft(){
    ftm = pies*(1/10.76);
    fth = pies*(1/107639.104);
    ftcm = pies*((30.48/1)*(30.48/1));
    ftin = pies*(144/1);
    ftyd = pies/9;
    ftmi = pies* 0.000000035870;
    }
    
    public void cyd(){
    ydm = yarda*(0.8361/1);
    ydh = yarda*(1/11959.9005);
    ydcm = yarda/0.00011960;
    ydin = yarda*(1296/1);
    ydft = yarda*(9/1);
    ydmi = yarda/3097600;
    }
    
    public void cmi(){
     mim = milla*(2589988.11/1);
        mih = milla*(1/0.003861);
        micm = (long) milla*(25900000000L/1);
        miin = (long) milla*(4014489600L/1);
        mift = milla*((5280/1)*(5280/1));
        miyd = milla*(3097600/1);
    }
    
    public double getMetro() {
        return metro;
    }

    public double getHectarea() {
        return hectarea;
    }

    public double getCentimetro() {
        return centimetro;
    }

    public double getPulgada() {
        return pulgada;
    }

    public double getPies() {
        return pies;
    }

    public double getYarda() {
        return yarda;
    }

    public double getMilla() {
        return milla;
    }

    public double getMh() {
        return mh;
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

    public double getHm() {
        return hm;
    }

    public double getHcm() {
        return hcm;
    }

    public double getHin() {
        return hin;
    }

    public double getHft() {
        return hft;
    }

    public double getHyd() {
        return hyd;
    }

    public double getHmi() {
        return hmi;
    }

    public double getCmm() {
        return cmm;
    }

    public double getCmh() {
        return cmh;
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

    public double getInm() {
        return inm;
    }

    public double getInh() {
        return inh;
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

    public double getFtm() {
        return ftm;
    }

    public double getFth() {
        return fth;
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

    public double getYdm() {
        return ydm;
    }

    public double getYdh() {
        return ydh;
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

    public double getMim() {
        return mim;
    }

    public double getMih() {
        return mih;
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
}
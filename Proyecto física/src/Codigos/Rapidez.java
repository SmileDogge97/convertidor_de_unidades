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
public class Rapidez {
    private double ms;
    private double kmh;
    private double fts;
    private double mih;
    private double nudo;
    private double mk;
    private double mf;
    private double mmi;
    private double mn;
    private double km;       
    private double kf;       
    private double kmi;       
    private double kn;       
    private double fm;       
    private double fk;       
    private double fmi;       
    private double fn;       
    private double mim;       
    private double mik;       
    private double mif;       
    private double min;       
    private double nm;       
    private double nk;       
    private double nf;      
    private double nmi;     
    
    public Rapidez(){
    ms=0;
    kmh=0;
    fts=0;
    mih=0;
    nudo=0;
    mk=0;
    mf=0;
    mmi=0;
    mn=0;
    km=0;       
    kf=0;       
    kmi=0;       
    kn=0;       
    fm=0;       
    fk=0;       
    fmi=0;       
    fn=0;       
    mim=0;       
    mik=0;       
    mif=0;       
    min=0;       
    nm=0;       
    nk=0;       
    nf=0;      
    nmi=0;}
    
    public void setms(double m){ms=m;}
    public void setkmh(double k){kmh=k;} 
    public void setfts(double f){fts=f;}
    public void setmih(double mi){mih=mi;}
    public void setnudo(double n){nudo=n;}
    
    public void cms(){
    mk=ms*(3.6/1);
    mf=ms*(3.28/1);
    mmi=ms*(2.24/1);
    mn=ms*(1/0.5144);
    }
    
     public void ckmh(){
    km=kmh*(0.2778/1);       
    kf=kmh*(0.911/1);       
    kmi=kmh*(0.621/1);       
    kn=kmh*(0.2778/1)*(1/0.5144);   
    }
     
    public void cfts(){
    fm=fts*(0.3048/1);       
    fk=fts*(1.10/1);       
    fmi=fts*(0.682/1);       
    fn=fts*(0.3048/1)*(1/0.5144);   
    } 
    
    public void cmih(){
    mim=mih*0.4470;       
    mik=mih*1.609;       
    mif=mih*1.466;       
    min=((mih*0.4470)/0.51);    
    } 
    
    public void cnudo(){
    nm=nudo*0.5144;       
    nk=((nudo*0.5144)/0.2778);       
    nf=((nudo*0.5144)/0.3148);      
    nmi=((nudo*0.5144)/0.4470);   
    }
    
    public double ms(){return ms;}
    public double kmh(){return kmh;}
    public double fts(){return fts;}
    public double mih(){return mih;}
    public double nudo(){return nudo;}
    public double mk(){return mk;}
    public double mf(){return mf;}
    public double mmi(){return mmi;}
    public double mn(){return mn;}
    public double km(){return km;}       
    public double kf(){return kf;}       
    public double kmi(){return kmi;}       
    public double kn(){return kn;}       
    public double fm(){return fm;}       
    public double fk(){return fk;}       
    public double fmi(){return fmi;}       
    public double fn(){return fn;}       
    public double mim(){return mim;}       
    public double mik(){return mik;}       
    public double mif(){return mif;}       
    public double min(){return min;}       
    public double nm(){return nm;}       
    public double nk(){return nk;}       
    public double nf(){return nf;}      
    public double nmi(){return nmi;}
    
}

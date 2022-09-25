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
public class Tiempo {
    private  double segundo;
    private  double minuto;
    private  double hora;       
    private  double dia;
    private  double año;
    private  double sm;
    private  double sh;
    private  double sd;
    private  double sa;
    private  double ms;
    private  double mh;
    private  double md;
    private  double ma;       
    private  double hs;       
    private  double hm;      
    private  double hd;       
    private  double ha;       
    private  double ds;       
    private  double dm;       
    private  double dh;       
    private  double da;
    private  double as;
    private  double am;       
    private  double ah;       
    private  double ad;      
    
    public Tiempo(){
    segundo=0;
    minuto=0;
    hora=0;       
    dia=0;
    año=0;
    sm=0;
    sh=0;
    sd=0;
    sa=0;
    ms=0;
    mh=0;
    md=0;
    ma=0;       
    hs=0;       
    hm=0;      
    hd=0;       
    ha=0;       
    ds=0;       
    dm=0;       
    dh=0;       
    da=0;
    as=0;
    am=0;       
    ah=0;       
    ad=0;
    }
    
    public void setSegundo (double s){segundo=s;}
    public void setMinuto (double m){minuto=m;}
    public void setHora (double h){hora=h;}
    public void setDia (double d){dia=d;}        
    public void setAño (double a){año=a;} 
    
    public  void cSegundo(){
    sm=segundo/60;
    sh=segundo/3600;
    sd=segundo/86400;
    sa=segundo/31560000;
    }
    
    public  void cMinuto(){
    ms=minuto*(60/1);
    mh=minuto/60;
    md=minuto/1440;
    ma=minuto/526000;
    }
    
   public  void cHora(){
    hs=hora*(3600/1);       
    hm=hora*(60/1);      
    hd=hora/24;       
    ha=hora/8760;
    }
    
    public  void cDía(){
    ds=dia*(86400/1);       
    dm=dia*(1440/1);       
    dh=dia*(24/1);       
    da=dia/365;
    }
    
    public  void cAño(){
    as=año*(31560000/1);
    am=año*(526000/1);       
    ah=año*(8760/1);       
    ad=año*(365/1);
    }
     public double s(){return segundo;}
     public double m(){return minuto;}
     public double h(){return hora;}
     public double d(){return dia;}
     public double a(){return año;}
    
    public double sm(){return sm;}
    public double sh(){return sh;}
    public double sd(){return sd;}
    public double sa(){return sa;}
    
    public double ms(){return ms;}
    public double mh(){return mh;}
    public double md(){return md;}
    public double ma(){return ma;}  
    
    public double hs(){return hs;}       
    public double hm(){return hm;}      
    public double hd(){return hd;}       
    public double ha(){return ha;}   
    
    public double ds(){return ds;}       
    public double dm(){return dm;}       
    public double dh(){return dh;}      
    public double da(){return da;}
    
    public double as(){return as;}
    public double am(){return am;}      
    public double ah(){return ah;}     
    public double ad(){return ad;}
}

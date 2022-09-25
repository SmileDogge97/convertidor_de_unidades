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
public class Temperatura {
    private double celsius;
    private double kelvin;
    private double farenheit;
    private double rankine;
    private double cf;
    private double ck;
    private double cr;
    private double fc;
    private double fk;
    private double fr;
    private double kc;
    private double kf;        
    private double kr;
    private double rc;
    private double rf;
    private double rk;       
            
    public Temperatura(){
        celsius=0;
        kelvin=0;
        farenheit=0;
        rankine=0;
        cf=0;
        ck=0;        
        cr=0;
        fc=0;        
        fk=0;        
        fr=0;        
        kc=0;        
        kf=0;        
        kr=0;
        rc=0;        
        rf=0;        
        rk=0;        
    }
    
    public void setCelsius (double c){celsius=c;}
    public void setKelvin (double k){kelvin=k;}
    public void setFarenheit(double f){farenheit=f;}
    public void setRankine (double r){rankine=r;}
    
    public void conversionCelsius (){
    cf=((9*celsius)/5)+32;
    ck=celsius+273.15;
    cr=celsius*1.8000+491.67;
    }
    
    public void conversionFarenheit(){
    fc=(5*(farenheit-32))/9;
    fk=((5*(farenheit-32))/9)+273.15;
    fr=(farenheit-32)+491.67;        
    }
    
    public void conversionKelvin(){
    kc=kelvin-273.15;
    kf=((9*(kelvin-273.15))/5)+32;
    kr=(kelvin- 273.15)*1.8000+491.67;
    }
    
    public void conversionRankine(){
    rc=(5*(rankine-491.67))/9;
    rf=(rankine-491.67)+32;        
    rk=((5*(rankine-491.67))/9)+273.45;    
    }
    public double getc(){return celsius;}
    public double getf(){return farenheit;}
    public double getk(){return kelvin;}
    public double getr(){return rankine;}
    public double cf(){return cf;}
    public double ck(){return ck;}
    public double cr(){return cr;}
    public double fc(){return fc;}
    public double fk(){return fk;}
    public double fr(){return fr;}
    public double kc(){return kc;}
    public double kf(){return kf;}
    public double kr(){return kr;}
    public double rc(){return rc;}
    public double rf(){return rf;}
    public double rk(){return rk;}

   /* public double setCelsius() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}

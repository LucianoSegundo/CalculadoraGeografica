package com.Calculadora.geografica.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClassificarModel {


    private double ca;
    private double mg;

    private double na;
    private double ce;

    private String nota;
    
    private double ras;

    public String ClassificarAgua(){
        double raizQuadrada = (ca + mg)/2;
        ras = na/ Math.sqrt(raizQuadrada);
        
        if (ce == 0 || ce < 250 ){
            nota = "C1";
        }
        else if (ce == 250 || ce < 750 ){
            nota = "C2";
        }
        else if (ce == 750 || ce < 2250 ){
            nota = "C3";
        }
        else if (ce == 2250 || ce < 5000 ){
            nota = "C4";
        }

        if(ras< (18.87 - (4.44*Math.log10(ce)))){
            nota += "S1";

        }
        else if (ras< (31.31 - (6.66*Math.log10(ce)))){
            nota += "S2";

        }
        else if (ras< (43.75 - (8.87*Math.log10(ce)))){
            nota += "S3";

        }
        else if (ras> (43.75 - (8.87*Math.log10(ce)))){
            nota += "S4";

        }
     return nota;
    }


    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    public double getMg() {
        return mg;
    }

    public void setMg(double mg) {
        this.mg = mg;
    }

    public double getNa() {
        return na;
    }

    public void setNa(double na) {
        this.na = na;
    }

    public double getCe() {
        return ce;
    }

    public void setCe(double ce) {
        this.ce = ce;
    }

    public double getRas() {
        return ras;
    }

    public void setRas(double ras) {
        this.ras = ras;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "ClassificarModel{" +
                "ca=" + ca +
                ", mg=" + mg +
                ", na=" + na +
                ", ce=" + ce +
                ", ras=" + ras +
                ", nota='" + nota + '\'' +
                '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl8.zad4;

/**
 *
 * @author MICHAL
 */
public class Stozek extends FiguraPrzestrzenna {

    private double r;
    private double h;
    private double l;

    public Stozek(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.h = l;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }
    
    public double getL() {
        return l;
    }

    public void setR(double r) {
        if (r < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.r = r;
        }
        
    }
    
    public void setH(double h) {
        if (h < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.h = h;
        }
    }    
    
    public void setL(double l) {
        if (l < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.l = l;
        }
        
    }

    @Override
    public double ObliczObjetosc() {
        double wynik = (Math.PI*r*r*h)/3;
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public double ObliczPole() {
        double wynik = Math.PI*r*(r+l);
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole stożka: " + ObliczPole() + " Objętość skożka: " + ObliczObjetosc();
    }

}

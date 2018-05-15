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
public class Walec extends FiguraPrzestrzenna {

    private double r;
    private double h;

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
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

    @Override
    public double ObliczObjetosc() {
        double wynik = Math.PI * r * r * h;
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public double ObliczPole() {
        double wynik = 2 * Math.PI * r * r + (2 * Math.PI * r * h);
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole walca: " + ObliczPole() + " Objętość walca: " + ObliczObjetosc();
    }

}

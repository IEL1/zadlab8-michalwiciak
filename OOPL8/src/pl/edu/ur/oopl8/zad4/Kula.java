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
public class Kula extends FiguraPrzestrzenna {

    private double r;

    public Kula(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r < 0) {
            System.out.println("Liczba ujemna");
        } else {
            this.r = r;
        }
    }

    @Override
    public double ObliczObjetosc() {
        double wynik = Math.PI*r*r*(4/3);
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public double ObliczPole() {
        double wynik = Math.PI * r * r;
        wynik*=100;
        wynik = Math.round(wynik);
        wynik/=100;
        return wynik;
    }

    @Override
    public String toString() {
        return super.toString() + " Pole kuli: " + ObliczPole() + " Objętość kuli: " + ObliczObjetosc();
    }

}

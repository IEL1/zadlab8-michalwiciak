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
public abstract class FiguraPrzestrzenna extends FiguraGeometryczna {
    
     public abstract double ObliczObjetosc();
     
     @Override
     public String toString() {
        return "Obliczanie parametrów figury przestrzennej";
    }
    
}

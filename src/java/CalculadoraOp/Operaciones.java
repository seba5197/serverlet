/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraOp;

/**
 *
 * @author sebas
 */
public class Operaciones {
    private double n1;
    private double n2;

    public Operaciones(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Operaciones() {
    }
    
    public double Suma(double n1, double n2){
        
        return(n1+n2);
    }
    public double Div(double n1, double n2){
        
        return(n1/n2);
    }
    public double Mult(double n1, double n2){
        
        return(n1*n2);
    }
    public double Resta(double n1, double n2){
        
        return(n1-n2);
    }
    
    
}


package com.mycompany.figuras;


public class Circulo {
    
    public double radio;
    public Circulo(){
    
    }
public Circulo(double radio){
    this.radio=radio;
}    
    public void imprimir(){
        System.out.println("El radio es: "+ radio);
    }
    public double calcularAreaCirculo(){
    return radio*radio;
    
    }
    public double calcularPerimetroCirculo(){
    return radio*1;
    
    }
}
    

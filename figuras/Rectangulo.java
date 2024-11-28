
package com.mycompany.figuras;


public class Rectangulo {
    public float base;
    public float altura;
    
    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
        
    }
    
    public float calcurAreaRectangulo(){
        return base * altura;
    }
    
    public float calcularPerimetroRectangulo(){
        return 2* (base+altura);
        
    }
    
}
    


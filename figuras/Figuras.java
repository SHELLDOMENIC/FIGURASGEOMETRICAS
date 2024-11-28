
package com.mycompany.figuras;
public class Figuras {

    public static void main(String[] args) {
         Circulo objCirculo = new Circulo(5);
         
         double AreaCirculo=objCirculo.calcularAreaCirculo();
        System.out.println("El area del Circulo es: "+AreaCirculo);
        
        double PerimetroCirculo=objCirculo.calcularPerimetroCirculo();
        System.out.println("El perimetro del Circulo es: "+PerimetroCirculo);
        
        
        Rectangulo objRectangulo=new Rectangulo(10,5);
        
        float AreaRectangulo=objRectangulo.calcurAreaRectangulo();
        System.out.println("El area de un Rectangulo es: "+AreaRectangulo);
        
        float PerimetroRectangulo=objRectangulo.calcularPerimetroRectangulo();
        System.out.println("El perimetro de el Rectangulo es: "+PerimetroRectangulo);
         }
   }

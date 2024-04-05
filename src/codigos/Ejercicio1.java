//Calcule el área del triángulo, si se tiene como dato: (BxH) / 2
package codigos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       float area, altura,base;
       System.out.print("Ingresa la base del triangulo:  ");
       base = input.nextFloat();
       System.out.print("Ingresa la altura del triangulo:   ");
       altura = input.nextFloat();
       area = (base*altura)/2;
       System.out.println("El area del triangulo es: " +area+"cm2");
    }
}

//Un estudiante de EPE de la UPC ha realizado 5 exámenes virtuales (12, 18, 10 ,13 y 15) y
// requiere conocer si aprobó dicho criterio del curso.
// Calcular el promedio de las calificaciones obtenidas.
package codigos;

public class Ejercicio2 {
    public static void main(String[] args) {
        int nota1 = 12;
        int nota2 = 18;
        int nota3 = 10;
        int nota4 = 13;
        int nota5 = 15;
        int notafinal = nota1 + nota2 + nota3 + nota4 + nota5;
        System.out.println("El promedio de las calificaciones es: " + notafinal/5.0);
    }
}

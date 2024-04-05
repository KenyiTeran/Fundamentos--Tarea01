//Javier asiste a Plaza Vea como cada domingo y tiene que comprar productos para
// la semana. En comida gasta 100 soles, en aseo personal 40% de la comida y en
// limpieza del hogar 30% de la comida. Si solo dispone de 200 soles, cuanto le
// resta de dinero al finalizar la compra.
package codigos;

public class Ejercicio3 {
    public static void main(String[] args) {
        int comida = 100;
        double aseoPersonal = comida*0.4;
        double limpiezaHogar = comida*0.3;
        double gastoTotal = comida + aseoPersonal + limpiezaHogar;
        int dineroDisponible = 200;
        System.out.println("Al final de la compra le resta: " + (dineroDisponible - gastoTotal) + " soles.");
    }
}
